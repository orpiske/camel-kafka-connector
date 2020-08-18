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
package org.apache.camel.kafkaconnector.syslog.sink;

import org.apache.camel.Exchange;
import org.apache.camel.kafkaconnector.common.AbstractKafkaTest;
import org.apache.camel.kafkaconnector.common.ConnectorPropertyFactory;
import org.apache.camel.kafkaconnector.common.clients.kafka.KafkaClient;
import org.apache.camel.kafkaconnector.common.services.camel.CamelContextService;
import org.apache.camel.kafkaconnector.common.services.camel.CamelContextServiceFactory;
import org.apache.camel.kafkaconnector.common.utils.TestUtils;
import org.apache.camel.kafkaconnector.syslog.source.SyslogTestConfiguratorCamel;
import org.apache.camel.model.ModelCamelContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * A simple test case that checks whether the syslog send the expected number of
 * messages
 */
@Testcontainers
public class CamelSinkSyslogITCase extends AbstractKafkaTest {
    @RegisterExtension
    public CamelContextService<SyslogTestConfiguratorCamel> camelContextService = CamelContextServiceFactory
            .createCamelContextService(new SyslogTestConfiguratorCamel());

    private static final Logger LOG = LoggerFactory.getLogger(CamelSinkSyslogITCase.class);

    @Override
    protected String[] getConnectorsInTest() {
        return new String[] {"camel-syslog-kafka-connector"};
    }

    private void runBasicProduceTest(ConnectorPropertyFactory connectorPropertyFactory) throws Exception {
        connectorPropertyFactory.log();
        getKafkaConnectService().initializeConnectorBlocking(connectorPropertyFactory, 1);

        LOG.debug("Creating the producer ...");
        KafkaClient<String, String> kafkaClient = new KafkaClient<>(getKafkaService().getBootstrapServers());
        kafkaClient.produce(TestUtils.getDefaultTestTopic(this.getClass()), "<13>1 2020-05-14T14:47:01.198+02:00 nathannever myapp - - [timeQuality tzKnown=\"1\" isSynced=\"1\" syncAccuracy=\"11266\"] FOO BAR!");
        LOG.debug("Created the producer ...");

        ModelCamelContext context = camelContextService.getContext();
        Exchange exchange =  context.createConsumerTemplate().receive("seda:syslog", 10000L);

        assertEquals("<13>1 2020-05-14T14:47:01.198+02:00 nathannever myapp - - [timeQuality tzKnown=\"1\" isSynced=\"1\" syncAccuracy=\"11266\"] FOO BAR!",
                exchange.getIn().getBody(String.class));
    }

    @Test
    @Timeout(90)
    public void testBasicReceive() {
        try {
            SyslogTestConfiguratorCamel configuratorCamel = camelContextService.getConfigurator();

            ConnectorPropertyFactory connectorPropertyFactory = CamelSyslogPropertyFactory
                    .basic()
                    .withTopics(TestUtils.getDefaultTestTopic(this.getClass()))
                    .withHost(configuratorCamel.getHost())
                    .withPort(configuratorCamel.getPort())
                    .withProtocol(configuratorCamel.getProtocol());

            runBasicProduceTest(connectorPropertyFactory);
        } catch (Exception e) {
            LOG.error("Syslog test failed: {} {}", e.getMessage(), e);
            fail(e.getMessage(), e);
        }
    }
}
