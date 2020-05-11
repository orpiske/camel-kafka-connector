/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.kafkaconnector.source.salesforce;

import java.util.concurrent.ExecutionException;

import org.apache.camel.kafkaconnector.AbstractKafkaTest;
import org.apache.camel.kafkaconnector.ConnectorPropertyFactory;
import org.apache.camel.kafkaconnector.TestCommon;
import org.apache.camel.kafkaconnector.clients.kafka.KafkaClient;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
/* This test is disabled by default because requires manual verification on Salesforce end.

Creating API keys:
https://help.salesforce.com/articleView?id=connected_app_create_api_integration.htm

You need to set 3 system properties to run this test:
 -Dit.test.salesforce.enable=true to enable the test
 */
@EnabledIfSystemProperty(named = "it.test.salesforce.enable", matches = "true")
public class CamelSourceSalesforceITCase extends AbstractKafkaTest  {
    private static final Logger LOG = LoggerFactory.getLogger(CamelSourceSalesforceITCase.class);
    private final String clientId = System.getProperty("it.test.salesforce.client.id");
    private final String clientSecret = System.getProperty("it.test.salesforce.client.secret");
    private final String password = System.getProperty("it.test.salesforce.password");
    private final String userName = System.getProperty("it.test.salesforce.username");

    private boolean received;

    private <T> boolean checkRecord(ConsumerRecord<String, T> record) {
        LOG.debug("Received: {}", record.value());
        received  = true;

        return false;
    }

    public void runBasicTest(ConnectorPropertyFactory connectorPropertyFactory) throws ExecutionException, InterruptedException {
        connectorPropertyFactory.log();
        getKafkaConnectService().initializeConnector(connectorPropertyFactory);

        LOG.debug("Creating the consumer ...");
        KafkaClient<String, String> kafkaClient = new KafkaClient<>(getKafkaService().getBootstrapServers());
        kafkaClient.consume(TestCommon.getDefaultTestTopic(this.getClass()), this::checkRecord);
        LOG.debug("Created the consumer ...");

        assertTrue(received, "Didn't receive any messages");
    }


    /* For this test to work: after the classes have been generated, go to Salesforce UI
       and create or edit an account.
     */
    @Test
    @Timeout(180)
    public void testBasicConsume() throws ExecutionException, InterruptedException {
        ConnectorPropertyFactory factory = CamelSalesforcePropertyFactory.basic()
                .withKafkaTopic(TestCommon.getDefaultTestTopic(this.getClass()))
                .withLoginUrl("https://login.salesforce.com")
                .withUserName(userName)
                .withPassword(password)
                .withClientId(clientId)
                .withClientSecret(clientSecret)
                .withNotifyForFields("ALL")
                .withUpdateTopic(true)
                .withRawPayload(true)
                .withPackages("org.apache.camel.salesforce.dto")
                .withSObjectClass("org.apache.camel.salesforce.dto.Account")
                .withSObjectQuery("SELECT Id, Name FROM Account")
                .withTopicName("CamelKafkaConnectorTopic");

        runBasicTest(factory);
    }

    /* For this test to work: after the classes have been generated, go to Salesforce UI
       and create or edit an account.
     */
    @Disabled("Not working")
    @Test
    @Timeout(180)
    public void testBasicConsumeUsingUrl() throws ExecutionException, InterruptedException {
        ConnectorPropertyFactory factory = CamelSalesforcePropertyFactory.basic()
                .withLoginUrl("https://login.salesforce.com")
                .withUserName(userName)
                .withPassword(password)
                .withClientId(clientId)
                .withClientSecret(clientSecret)
                .withPackages("org.apache.camel.salesforce.dto")
                .withUrl("CamelKafkaConnectorTopic")
                    .append("notifyForFields", "ALL")
                    .append("updateTopic", "true")
                    .append("rawPayload", "true")
                    .append("SObjectClass", "org.apache.camel.salesforce.dto.Account")
                    .append("sObjectQuery", "SELECT Id, Name FROM Account")
                    .buildUrl();

        runBasicTest(factory);
    }


    /*
     For this test to work, Change Data Capture need to be enabled on the setup. For lightnining, as of now, this is
     Setup -> Integrations -> Change Data Capture

     Then select Account
     */
    @Disabled("Not working")
    @Test
    @Timeout(180)
    public void testBasicCDC() throws ExecutionException, InterruptedException {
        ConnectorPropertyFactory factory = CamelSalesforcePropertyFactory.basic()
                .withKafkaTopic(TestCommon.getDefaultTestTopic(this.getClass()))
                .withLoginUrl("https://login.salesforce.com")
                .withUserName(userName)
                .withPassword(password)
                .withClientId(clientId)
                .withClientSecret(clientSecret)
                .withRawPayload(true)
                .withReplayId(-1)
                .withTopicName("data/AccountChangeEvent");

        runBasicTest(factory);
    }


    @Disabled("Not working")
    @Test
    @Timeout(180)
    public void testBasicCDCUsingUrl() throws ExecutionException, InterruptedException {
        ConnectorPropertyFactory factory = CamelSalesforcePropertyFactory.basic()
                .withKafkaTopic(TestCommon.getDefaultTestTopic(this.getClass()))
                .withLoginUrl("https://login.salesforce.com")
                .withUserName(userName)
                .withPassword(password)
                .withClientId(clientId)
                .withClientSecret(clientSecret)
                .withUrl("data/AccountChangeEvent")
                    .append("replayId", "-1")
                    .buildUrl();

        runBasicTest(factory);
    }
}
