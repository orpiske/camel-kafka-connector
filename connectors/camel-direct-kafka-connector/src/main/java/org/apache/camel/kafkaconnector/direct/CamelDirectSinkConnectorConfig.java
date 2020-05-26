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
package org.apache.camel.kafkaconnector.direct;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelDirectSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_DIRECT_PATH_NAME_CONF = "camel.sink.path.name";
    public static final String CAMEL_SINK_DIRECT_PATH_NAME_DOC = "Name of direct endpoint";
    public static final String CAMEL_SINK_DIRECT_PATH_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_BLOCK_CONF = "camel.sink.endpoint.block";
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_BLOCK_DOC = "If sending a message to a direct endpoint which has no active consumer, then we can tell the producer to block and wait for the consumer to become active.";
    public static final Boolean CAMEL_SINK_DIRECT_ENDPOINT_BLOCK_DEFAULT = true;
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_FAIL_IF_NO_CONSUMERS_CONF = "camel.sink.endpoint.failIfNoConsumers";
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_FAIL_IF_NO_CONSUMERS_DOC = "Whether the producer should fail by throwing an exception, when sending to a DIRECT endpoint with no active consumers.";
    public static final Boolean CAMEL_SINK_DIRECT_ENDPOINT_FAIL_IF_NO_CONSUMERS_DEFAULT = false;
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_DIRECT_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_TIMEOUT_CONF = "camel.sink.endpoint.timeout";
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_TIMEOUT_DOC = "The timeout value to use if block is enabled.";
    public static final Long CAMEL_SINK_DIRECT_ENDPOINT_TIMEOUT_DEFAULT = 30000L;
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_DIRECT_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_DIRECT_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_DIRECT_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_DIRECT_COMPONENT_BLOCK_CONF = "camel.component.direct.block";
    public static final String CAMEL_SINK_DIRECT_COMPONENT_BLOCK_DOC = "If sending a message to a direct endpoint which has no active consumer, then we can tell the producer to block and wait for the consumer to become active.";
    public static final Boolean CAMEL_SINK_DIRECT_COMPONENT_BLOCK_DEFAULT = true;
    public static final String CAMEL_SINK_DIRECT_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.direct.lazyStartProducer";
    public static final String CAMEL_SINK_DIRECT_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_DIRECT_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_DIRECT_COMPONENT_TIMEOUT_CONF = "camel.component.direct.timeout";
    public static final String CAMEL_SINK_DIRECT_COMPONENT_TIMEOUT_DOC = "The timeout value to use if block is enabled.";
    public static final Long CAMEL_SINK_DIRECT_COMPONENT_TIMEOUT_DEFAULT = 30000L;
    public static final String CAMEL_SINK_DIRECT_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.direct.basicPropertyBinding";
    public static final String CAMEL_SINK_DIRECT_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_DIRECT_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelDirectSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelDirectSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_DIRECT_PATH_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_DIRECT_PATH_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_DIRECT_PATH_NAME_DOC);
        conf.define(CAMEL_SINK_DIRECT_ENDPOINT_BLOCK_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIRECT_ENDPOINT_BLOCK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_ENDPOINT_BLOCK_DOC);
        conf.define(CAMEL_SINK_DIRECT_ENDPOINT_FAIL_IF_NO_CONSUMERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIRECT_ENDPOINT_FAIL_IF_NO_CONSUMERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_ENDPOINT_FAIL_IF_NO_CONSUMERS_DOC);
        conf.define(CAMEL_SINK_DIRECT_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIRECT_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_DIRECT_ENDPOINT_TIMEOUT_CONF, ConfigDef.Type.LONG, CAMEL_SINK_DIRECT_ENDPOINT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_ENDPOINT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_DIRECT_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIRECT_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_DIRECT_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIRECT_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_DIRECT_COMPONENT_BLOCK_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIRECT_COMPONENT_BLOCK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_COMPONENT_BLOCK_DOC);
        conf.define(CAMEL_SINK_DIRECT_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIRECT_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_DIRECT_COMPONENT_TIMEOUT_CONF, ConfigDef.Type.LONG, CAMEL_SINK_DIRECT_COMPONENT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_COMPONENT_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_DIRECT_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_DIRECT_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_DIRECT_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}