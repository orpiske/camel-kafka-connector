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

package org.apache.camel.kafkaconnector.azure.storage.queue.sink;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.azure.storage.queue.QueueClient;
import com.azure.storage.queue.QueueServiceClient;
import com.azure.storage.queue.models.PeekedMessageItem;
import org.apache.camel.kafkaconnector.CamelSinkTask;
import org.apache.camel.kafkaconnector.azure.storage.services.AzureStorageClientUtils;
import org.apache.camel.kafkaconnector.common.AbstractKafkaTest;
import org.apache.camel.kafkaconnector.common.ConnectorPropertyFactory;
import org.apache.camel.kafkaconnector.common.clients.kafka.KafkaClient;
import org.apache.camel.kafkaconnector.common.utils.TestUtils;
import org.apache.camel.test.infra.azure.common.AzureCredentialsHolder;
import org.apache.camel.test.infra.azure.common.services.AzureService;
import org.apache.camel.test.infra.azure.storage.queue.services.AzureStorageQueueServiceFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CamelSinkAzureStorageQueueITCase extends AbstractKafkaTest {
    @RegisterExtension
    public static AzureService service = AzureStorageQueueServiceFactory.createAzureService();

    private static final Logger LOG = LoggerFactory.getLogger(CamelSinkAzureStorageQueueITCase.class);

    private QueueServiceClient client;
    private QueueClient queueClient;
    private String queueName;
    private int expect = 10;
    private int received;

    @Override
    protected String[] getConnectorsInTest() {
        return new String[]{"camel-azure-storage-queue-kafka-connector"};
    }

    @BeforeEach
    public void setUp() {
        client = AzureStorageClientUtils.getClient();
        queueName = "test-queue" + TestUtils.randomWithRange(0, 100);

        queueClient = client.createQueue(queueName);
        received = 0;
    }

    @AfterEach
    public void tearDown() {
        if (client != null) {
            client.deleteQueue(queueName);
        }
    }

    private void acknowledgeReceived(PeekedMessageItem peekedMessageItem) {
        received++;
        LOG.info("Received: {}", peekedMessageItem.getMessageText());
    }

    private boolean canConsume() {
        return queueClient.getProperties().getApproximateMessagesCount() >= expect;
    }

    private void consume() {
        LOG.debug("Created the consumer ...");
        TestUtils.waitFor(this::canConsume);

        LOG.debug("About to receive messages");
        int count = queueClient.getProperties().getApproximateMessagesCount();

        queueClient.peekMessages(count, null, null).forEach(this::acknowledgeReceived);

    }

    private void putRecords() {
        Map<String, String> messageParameters = new HashMap<>();
        KafkaClient<String, String> kafkaClient = new KafkaClient<>(getKafkaService().getBootstrapServers());

        for (int i = 0; i < expect; i++) {
            try {
                // This is for 3.4 only. From 3.5 and newer, the text is taken from the body
                messageParameters.put(CamelSinkTask.HEADER_CAMEL_PREFIX + "CamelAzureStorageQueueMessageText", "test " + i);

                kafkaClient.produce(TestUtils.getDefaultTestTopic(this.getClass()), "test " + i, messageParameters);
            } catch (ExecutionException e) {
                LOG.error("Unable to produce messages: {}", e.getMessage(), e);
            } catch (InterruptedException e) {
                break;
            }
        }
    }


    public void runTest(ConnectorPropertyFactory connectorPropertyFactory) throws ExecutionException, InterruptedException, IOException {
        connectorPropertyFactory.log();
        getKafkaConnectService().initializeConnectorBlocking(connectorPropertyFactory, 1);

        putRecords();

        consume();

        assertEquals(expect, received, "Did not receive the same amount of messages that were sent");
    }


    @Test
    @Timeout(90)
    public void testBasicSendReceive() throws InterruptedException, ExecutionException, IOException {
        AzureCredentialsHolder azureCredentialsHolder = service.azureCredentials();

        ConnectorPropertyFactory connectorPropertyFactory = CamelSinkAzureStorageQueuePropertyFactory
                .basic()
                .withConfiguration(TestQueueConfiguration.class.getName())
                .withTopics(TestUtils.getDefaultTestTopic(this.getClass()))
                .withAccessKey(azureCredentialsHolder.accountKey())
                .withAccountName(azureCredentialsHolder.accountName())
                .withOperation("sendMessage")
                .withQueueName(queueName);

        runTest(connectorPropertyFactory);
    }


    @Test
    @Timeout(90)
    public void testBasicSendReceiveUrl() throws InterruptedException, ExecutionException, IOException {
        AzureCredentialsHolder azureCredentialsHolder = service.azureCredentials();

        ConnectorPropertyFactory connectorPropertyFactory = CamelSinkAzureStorageQueuePropertyFactory
                .basic()
                .withTopics(TestUtils.getDefaultTestTopic(this.getClass()))
                .withConfiguration(TestQueueConfiguration.class.getName())
                .withUrl(azureCredentialsHolder.accountName() + "/" + queueName)
                .append("accessKey", azureCredentialsHolder.accountKey())
                .append("operation", "sendMessage")
                .buildUrl();

        runTest(connectorPropertyFactory);
    }
}
