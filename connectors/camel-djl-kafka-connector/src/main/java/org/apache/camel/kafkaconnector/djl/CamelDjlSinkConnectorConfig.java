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
package org.apache.camel.kafkaconnector.djl;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelDjlSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_DJL_PATH_APPLICATION_CONF = "camel.sink.path.application";
    public static final String CAMEL_SINK_DJL_PATH_APPLICATION_DOC = "Application name";
    public static final String CAMEL_SINK_DJL_PATH_APPLICATION_DEFAULT = null;
    public static final String CAMEL_SINK_DJL_ENDPOINT_ARTIFACT_ID_CONF = "camel.sink.endpoint.artifactId";
    public static final String CAMEL_SINK_DJL_ENDPOINT_ARTIFACT_ID_DOC = "Model Artifact";
    public static final String CAMEL_SINK_DJL_ENDPOINT_ARTIFACT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_DJL_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_DJL_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_DJL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_DJL_ENDPOINT_MODEL_CONF = "camel.sink.endpoint.model";
    public static final String CAMEL_SINK_DJL_ENDPOINT_MODEL_DOC = "Model";
    public static final String CAMEL_SINK_DJL_ENDPOINT_MODEL_DEFAULT = null;
    public static final String CAMEL_SINK_DJL_ENDPOINT_TRANSLATOR_CONF = "camel.sink.endpoint.translator";
    public static final String CAMEL_SINK_DJL_ENDPOINT_TRANSLATOR_DOC = "Translator";
    public static final String CAMEL_SINK_DJL_ENDPOINT_TRANSLATOR_DEFAULT = null;
    public static final String CAMEL_SINK_DJL_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.djl.lazyStartProducer";
    public static final String CAMEL_SINK_DJL_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_DJL_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_DJL_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.djl.autowiredEnabled";
    public static final String CAMEL_SINK_DJL_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_DJL_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelDjlSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelDjlSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_DJL_PATH_APPLICATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DJL_PATH_APPLICATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_DJL_PATH_APPLICATION_DOC);
        conf.define(CAMEL_SINK_DJL_ENDPOINT_ARTIFACT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DJL_ENDPOINT_ARTIFACT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DJL_ENDPOINT_ARTIFACT_ID_DOC);
        conf.define(CAMEL_SINK_DJL_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DJL_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DJL_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_DJL_ENDPOINT_MODEL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DJL_ENDPOINT_MODEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DJL_ENDPOINT_MODEL_DOC);
        conf.define(CAMEL_SINK_DJL_ENDPOINT_TRANSLATOR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DJL_ENDPOINT_TRANSLATOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DJL_ENDPOINT_TRANSLATOR_DOC);
        conf.define(CAMEL_SINK_DJL_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DJL_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DJL_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_DJL_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DJL_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DJL_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}