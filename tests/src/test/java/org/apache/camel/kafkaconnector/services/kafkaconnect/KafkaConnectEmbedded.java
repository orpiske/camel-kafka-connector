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

    @Override
    public void initializeConnector(ConnectorPropertyFactory propertyFactory) throws ExecutionException, InterruptedException {


        this.cluster.start();
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

        Properties props = new Properties();
        props.put(StandaloneConfig.BOOTSTRAP_SERVERS_CONFIG,  "fuse-dev-02.tpb.lab.eng.brq.redhat.com:9092");
        props.put(StandaloneConfig.KEY_CONVERTER_CLASS_CONFIG, "org.apache.kafka.connect.json.JsonConverter");
        props.put(StandaloneConfig.VALUE_CONVERTER_CLASS_CONFIG, "org.apache.kafka.connect.json.JsonConverter");
        props.put(StandaloneConfig.OFFSET_STORAGE_FILE_FILENAME_CONFIG, this.getClass().getResource("/").getPath() + "connect.offsets");
        props.put(StandaloneConfig.OFFSET_COMMIT_INTERVAL_MS_CONFIG, "10000");
        props.put(StandaloneConfig.PLUGIN_PATH_CONFIG, "");
//        props.put(StandaloneConfig.LISTENERS_CONFIG, "http://localhost:9999");

        this.cluster = builder
                .brokerProps(props)
                .build();
    }
}
