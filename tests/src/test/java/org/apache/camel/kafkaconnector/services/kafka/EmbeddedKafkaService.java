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

package org.apache.camel.kafkaconnector.services.kafka;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.kafka.connect.runtime.WorkerConfig;
import org.apache.kafka.connect.util.clusters.EmbeddedConnectCluster;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.shaded.org.apache.commons.io.DirectoryWalker;

public class EmbeddedKafkaService implements KafkaService {
    private static final Logger LOG = LoggerFactory.getLogger(EmbeddedKafkaService.class);
    private static final long OFFSET_COMMIT_INTERVAL_MS = TimeUnit.SECONDS.toMillis(30);

    private EmbeddedConnectCluster cluster;

    private static class PluginWalker extends DirectoryWalker<String> {
        @Override
        protected void handleFile(File file, int depth, Collection<String> results) throws IOException {
            String fileName = file.getName();

            if (fileName.endsWith(".jar")) {
                if (fileName.contains("kafka-connector") && fileName.contains("camel")) {
                    String parentDir = file.getParentFile().getCanonicalPath();
                    if (parentDir.endsWith("target")) {
                        LOG.info("Adding dir with jar file: {} because of file {}", parentDir, fileName);

                        results.add(parentDir);
                    }
                }
            }
        }

        public List<String> findPlugins(File startDir) {
            List<String> results = new ArrayList<>();

            try {
                walk(startDir, results);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return results;
        }
    }



    public EmbeddedKafkaService() {
        LOG.info("Creating the embedded Kafka connect instance");
        EmbeddedConnectCluster.Builder builder = new EmbeddedConnectCluster.Builder();

        Properties brokerProps = new Properties();
        brokerProps.put("auto.create.topics.enable", String.valueOf(true));

        Map<String, String> workerProps = new HashMap<>();
        workerProps.put(WorkerConfig.OFFSET_COMMIT_INTERVAL_MS_CONFIG, String.valueOf(OFFSET_COMMIT_INTERVAL_MS));

        /*
         * We need to construct a list of directories containing *only* the connector classes (ie.: those that
         * specialize Kafka's Connector abstract class.
         *
         * Our build generates jar files with for every connector and puts that in the target directory which the
         * build dir (ie.: ${project.root}/core/target/camel-kafka-connector-0.0.1-SNAPSHOT.jar,
         * ${project.root}/connectors/camel-sjms2-kafka-connector/target/camel-sjms2-kafka-connector-0.0.1-SNAPSHOT.jar,
         * etc).
         *
         * The code within the pluginPaths traverses the directories for the core and connectors module, filtering any
         * file that matches all of the following conditions:
         * 1) ends with jar
         * 2) is located in the target directory
         * 3) contains the strings 'camel' and 'kafka-connector' as part of their name.
         *
         * This is also leverage by the fact that the core and connectors modules have the provided scope on the test
         * pom file.
         *
         * Why it does this?
         *
         * 1) Because having the connector classes in the classpath could cause library conflicts causing the connectors
         * and the Kafka connect runtime to fail.
         * 2) Having the connectors on the classpath causes the following error to appear multiple times in the logs:
         * 'Plugin class loader for connector: [name] was not found'
         *
         * ref: https://docs.confluent.io/current/connect/userguide.html
         */
        String pluginPaths = pluginPaths();

        LOG.info("Adding the following directories to the plugin path: {}", pluginPaths);
        workerProps.put(WorkerConfig.PLUGIN_PATH_CONFIG, pluginPaths);

        LOG.info("Building the embedded Kafka connect instance");
        this.cluster = builder
                .name("connect-cluster")
                .numWorkers(1)
                .numBrokers(1)
                .brokerProps(brokerProps)
                .workerProps(workerProps)
                .maskExitProcedures(true)
                .build();

        LOG.info("Built the embedded Kafka connect instance");
    }

    private List<String> findPlugins(String ...moduleDirs) {
        List<String> ret = new ArrayList<>();

        for (String module : moduleDirs) {
            String path = System.getProperty("project.basedir") + File.separator + module;
            LOG.info("Base dir used for search: {}", path);
            PluginWalker pluginWalker = new PluginWalker();

            ret.addAll(pluginWalker.findPlugins(new File(path)));
        }

        return ret;
    }

    private List<String> findPlugins() {
        return findPlugins("core", "connectors");
    }

    private String pluginPaths() {
        return findPlugins().stream().collect(Collectors.joining(","));
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {

    }

    @Override
    public String getBootstrapServers() {
        return cluster.kafka().bootstrapServers();
    }

    @Override
    public void initialize() {
        cluster.start();
        LOG.info("Kafka bootstrap server running at address {}", getBootstrapServers());
    }

    public EmbeddedConnectCluster getCluster() {
        return cluster;
    }
}
