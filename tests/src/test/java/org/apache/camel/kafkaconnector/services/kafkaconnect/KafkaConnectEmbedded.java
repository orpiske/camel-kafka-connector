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
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.camel.kafkaconnector.ConnectorPropertyFactory;
import org.apache.kafka.connect.runtime.standalone.StandaloneConfig;
import org.apache.kafka.connect.util.clusters.EmbeddedConnectCluster;

import static org.junit.Assert.fail;

public class KafkaConnectEmbedded implements KafkaConnectService {
    private EmbeddedConnectCluster cluster;

    public KafkaConnectEmbedded() {

    }

    private void convertProperty(Map<String, String> map, Object key, Object value) {
        map.put(String.valueOf(key), String.valueOf(value));
    }

    @Override
    public void initializeConnector(ConnectorPropertyFactory propertyFactory) throws ExecutionException, InterruptedException {

        Map<String, String> configuredProperties = new HashMap<>();

        propertyFactory.getProperties().forEach((k, v) -> convertProperty(configuredProperties, k, v));

        cluster.configureConnector("time", configuredProperties);
    }

    @Override
    public void initializeConnectorBlocking(ConnectorPropertyFactory propertyFactory) throws ExecutionException, InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        this.cluster.start();
        if (!latch.await(30, TimeUnit.SECONDS)) {
            fail("The connector did not start within a reasonable time");
        }
    }

    @Override
    public void stop() {
        this.cluster.stop();
    }

    @Override
    public void start() {
        EmbeddedConnectCluster.Builder builder = new EmbeddedConnectCluster.Builder();

        Properties brokerProps = new Properties();
        brokerProps.put("auto.create.topics.enable", String.valueOf(false));


        Map<String, String> workerProps = new HashMap<>();
        workerProps.put(StandaloneConfig.OFFSET_COMMIT_INTERVAL_MS_CONFIG, "10000");

        this.cluster = builder
                .name("connect-cluster")
                .numBrokers(1)
                .numWorkers(1)
                .brokerProps(brokerProps)
                .workerProps(workerProps)
                .maskExitProcedures(true)
                .build();

        cluster.start();
    }
}
