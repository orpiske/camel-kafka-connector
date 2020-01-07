/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.kafkaconnector.source.jms;

import java.util.Properties;

import org.apache.camel.kafkaconnector.AbstractKafkaTest;
import org.apache.camel.kafkaconnector.ConnectorPropertyFactory;
import org.apache.camel.kafkaconnector.TestCommon;
import org.apache.camel.kafkaconnector.clients.jms.JMSClient;
import org.apache.camel.kafkaconnector.clients.kafka.KafkaClient;
import org.apache.camel.kafkaconnector.services.jms.JMSService;
import org.apache.camel.kafkaconnector.services.jms.JMSServiceFactory;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.fail;

/**
 * A simple test case that checks whether the timer produces the expected number of
 * messages
 */
public class CamelSourceJMSITCase extends AbstractKafkaTest {
    private static final Logger LOG = LoggerFactory.getLogger(CamelSourceJMSITCase.class);

    @Rule
    public JMSService jmsService = JMSServiceFactory.createService();

    private int received;
    private final int expect = 10;

    @Before
    public void setUp() {
        LOG.info("JMS service running at {}", jmsService.getDefaultEndpoint());
    }


    private boolean checkRecord(ConsumerRecord<String, String> record, String regex) {
        LOG.debug("Received: {}", record.value());
        received++;
        Assert.assertTrue("Unexpected message contents", record.value().matches(regex));

        if (received == expect) {
            return false;
        }

        return true;
    }

    @Test(timeout = 90000)
    public void testBasicSendReceive() {
        try {
            Properties connectionProperties = JMSClient.getConnectionProperties(jmsService.getDefaultEndpoint());

            ConnectorPropertyFactory testProperties = new CamelJMSPropertyFactory(1,
                    TestCommon.getDefaultTestTopic(this.getClass()), TestCommon.DEFAULT_JMS_QUEUE, connectionProperties);

            getKafkaConnectService().initializeConnector(testProperties);

            JMSClient jmsProducer = JMSClient.createClient(jmsService.getDefaultEndpoint());

            jmsProducer.start();
            for (int i = 0; i < expect; i++) {
                jmsProducer.send(TestCommon.DEFAULT_JMS_QUEUE, "Test message " + i);
            }
            jmsProducer.stop();

            LOG.debug("Creating the consumer ...");
            KafkaClient<String, String> kafkaClient = new KafkaClient<>(getKafkaService().getBootstrapServers());
            kafkaClient.consume(TestCommon.getDefaultTestTopic(this.getClass()),
                    (k) -> checkRecord(k, "^Test message [0-9]+"));
            LOG.debug("Created the consumer ...");

            Assert.assertEquals("Didn't process the expected amount of messages", received, expect);
        } catch (Exception e) {
            LOG.error("JMS test failed: {}", e.getMessage(), e);
            fail(e.getMessage());
        }

    }

    @Test(timeout = 90000)
    public void testIntSendReceive() {
        try {
            Properties connectionProperties = JMSClient.getConnectionProperties(jmsService.getDefaultEndpoint());

            ConnectorPropertyFactory testProperties = new CamelJMSPropertyFactory(1,
                    TestCommon.getDefaultTestTopic(this.getClass()) + "testIntSendReceive",
                    "testIntSendReceive", connectionProperties);

            getKafkaConnectService().initializeConnector(testProperties);

            JMSClient jmsProducer = JMSClient.createClient(jmsService.getDefaultEndpoint());

            jmsProducer.start();
            for (int i = 0; i < expect; i++) {
                jmsProducer.send("testIntSendReceive", i);
            }
            jmsProducer.stop();

            LOG.debug("Creating the consumer ...");
            KafkaClient<String, String> kafkaClient = new KafkaClient<>(getKafkaService().getBootstrapServers());
            kafkaClient.consume(TestCommon.getDefaultTestTopic(this.getClass()) + "testIntSendReceive",
                    (k) -> checkRecord(k, "[0-9]+"));
            LOG.debug("Created the consumer ...");

            Assert.assertEquals("Didn't process the expected amount of messages", received, expect);
        } catch (Exception e) {
            LOG.error("JMS test failed: {}", e.getMessage(), e);
            fail(e.getMessage());
        }

    }
}
