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

package org.apache.camel.kafkaconnector.sink.salesforce;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import org.apache.camel.kafkaconnector.AbstractKafkaTest;
import org.apache.camel.kafkaconnector.ConnectorPropertyFactory;
import org.apache.camel.kafkaconnector.TestCommon;
import org.apache.camel.kafkaconnector.clients.kafka.KafkaClient;
import org.apache.camel.kafkaconnector.clients.salesforce.SalesforceCliContainer;
import org.apache.camel.salesforce.dto.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.junit.jupiter.Container;

public class CamelSinkSalesforceITCase extends AbstractKafkaTest {
    private static final Logger LOG = LoggerFactory.getLogger(CamelSinkSalesforceITCase.class);

    @Container
    public final SalesforceCliContainer container = new SalesforceCliContainer();

    private final String clientId = System.getProperty("it.test.salesforce.client.id");
    private final String clientSecret = System.getProperty("it.test.salesforce.client.secret");
    private final String password = System.getProperty("it.test.salesforce.password");
    private final String userName = System.getProperty("it.test.salesforce.username");


    private void runTest(ConnectorPropertyFactory connectorPropertyFactory) throws ExecutionException, InterruptedException {
        connectorPropertyFactory.log();
        getKafkaConnectService().initializeConnectorBlocking(connectorPropertyFactory, 1);

        KafkaClient<String, String> kafkaClient = new KafkaClient<>(getKafkaService().getBootstrapServers());

        Account account = new Account();

        account.setName("Sink test account");
        account.setDescription("Created during sink test");

        kafkaClient.produce(TestCommon.getDefaultTestTopic(this.getClass()), account.toString());
    }

    @Test
    @Timeout(180)
    public void testBasicProduce() throws ExecutionException, InterruptedException {
        ConnectorPropertyFactory factory = CamelSalesforcePropertyFactory.basic()
                .withKafkaTopic(TestCommon.getDefaultTestTopic(this.getClass()))
                .withUserName(userName)
                .withPassword(password)
                .withClientId(clientId)
                .withClientSecret(clientSecret);

//                .withNotifyForFields("ALL")
//                .withUpdateTopic(true)
//                .withRawPayload(true)
//                .withPackages("org.apache.camel.salesforce.dto")
//                .withSObjectClass("org.apache.camel.salesforce.dto.Account")
//                .withSObjectQuery("SELECT Id, Name FROM Account")
//                .withTopicName("CamelKafkaConnectorTopic");

        runTest(factory);

//        Executors.newCachedThreadPool().submit(this::updateTestAccount);
//
//        runBasicTest(factory);
    }
}
