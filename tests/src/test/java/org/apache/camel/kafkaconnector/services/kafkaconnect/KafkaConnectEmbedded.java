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

package org.apache.camel.kafkaconnector.services.kafkaconnect;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.apache.camel.kafkaconnector.ConnectorPropertyFactory;
import org.apache.camel.kafkaconnector.services.kafka.EmbeddedKafkaService;
import org.apache.camel.kafkaconnector.services.kafka.KafkaService;
import org.apache.kafka.connect.runtime.ConnectorConfig;
import org.apache.kafka.connect.util.clusters.EmbeddedConnectCluster;

import static org.junit.Assert.fail;

public class KafkaConnectEmbedded implements KafkaConnectService {
    private final EmbeddedConnectCluster cluster;
    private String connectorName;

    public KafkaConnectEmbedded(KafkaService kafkaService) {
        if (!(kafkaService instanceof EmbeddedKafkaService)) {
            throw new RuntimeException("Invalid Kafka service type: " +
                    (kafkaService == null ? "null" : kafkaService.getClass()));
        }

        this.cluster = ((EmbeddedKafkaService) kafkaService).getCluster();
    }

    private void convertProperty(Map<String, String> map, Object key, Object value) {
        map.put(String.valueOf(key), String.valueOf(value));
    }

    @Override
    public void initializeConnector(ConnectorPropertyFactory propertyFactory) {
        Map<String, String> configuredProperties = new HashMap<>();

        propertyFactory.getProperties().forEach((k, v) -> convertProperty(configuredProperties, k, v));

        connectorName = configuredProperties.get(ConnectorConfig.NAME_CONFIG);
        cluster.configureConnector(connectorName, configuredProperties);
    }

    @Override
    public void initializeConnectorBlocking(ConnectorPropertyFactory propertyFactory) throws InterruptedException {
        /*
        This is (likely) not necessary for this type of embedded runner because it
        should be running on the same thread as the test code. So we just wrap the
        other method
        */

        initializeConnector(propertyFactory);
    }

    @Override
    public void stop() {
        if (connectorName != null) {
            try {
                cluster.deleteConnector(connectorName);
            } finally {
                connectorName = null;
            }
        }
    }

    @Override
    public void start() {
        // NO-OP
    }
}
