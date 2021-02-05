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
package org.apache.camel.kafkaconnector.atlasmap;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAtlasmapSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_ATLASMAP_PATH_RESOURCE_URI_CONF = "camel.sink.path.resourceUri";
    public static final String CAMEL_SINK_ATLASMAP_PATH_RESOURCE_URI_DOC = "Path to the resource. You can prefix with: classpath, file, http, ref, or bean. classpath, file and http loads the resource using these protocols (classpath is default). ref will lookup the resource in the registry. bean will call a method on a bean to be used as the resource. For bean you can specify the method name after dot, eg bean:myBean.myMethod.";
    public static final String CAMEL_SINK_ATLASMAP_PATH_RESOURCE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_CONF = "camel.sink.endpoint.allowContextMapAll";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_DOC = "Sets whether the context map should allow access to all details. By default only the message body and headers can be accessed. This option can be enabled for full access to the current Exchange and CamelContext. Doing so impose a potential security risk as this opens access to the full power of CamelContext API.";
    public static final Boolean CAMEL_SINK_ATLASMAP_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_DEFAULT = false;
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_CONTENT_CACHE_CONF = "camel.sink.endpoint.contentCache";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_CONTENT_CACHE_DOC = "Sets whether to use resource content cache or not";
    public static final Boolean CAMEL_SINK_ATLASMAP_ENDPOINT_CONTENT_CACHE_DEFAULT = false;
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ATLASMAP_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_SOURCE_MAP_NAME_CONF = "camel.sink.endpoint.sourceMapName";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_SOURCE_MAP_NAME_DOC = "The Exchange property name for a source message map which hold java.util.Map&lt;String, Message&gt; where the key is AtlasMap Document ID. AtlasMap consumes Message bodies as source documents, as well as message headers as source properties where the scope equals to Document ID.";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_SOURCE_MAP_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_MODE_CONF = "camel.sink.endpoint.targetMapMode";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_MODE_DOC = "TargetMapMode enum value to specify how multiple target documents are delivered if exist. 'MAP': Stores them into a java.util.Map, and the java.util.Map is set to an exchange property if 'targetMapName' is specified, otherwise message body. 'MESSAGE_HEADER': Stores them into message headers. 'EXCHANGE_PROPERTY': Stores them into exchange properties. ) One of: [MAP] [MESSAGE_HEADER] [EXCHANGE_PROPERTY]";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_MODE_DEFAULT = "MAP";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_NAME_CONF = "camel.sink.endpoint.targetMapName";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_NAME_DOC = "The Exchange property name for a target document map which hold java.util.Map&lt;String, Object&gt; where the key is AtlasMap Document ID. AtlasMap populates multiple target documents into this map.";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_PROPERTIES_FILE_CONF = "camel.sink.endpoint.propertiesFile";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_PROPERTIES_FILE_DOC = "The URI of the properties file which is used for AtlasContextFactory initialization.";
    public static final String CAMEL_SINK_ATLASMAP_ENDPOINT_PROPERTIES_FILE_DEFAULT = null;
    public static final String CAMEL_SINK_ATLASMAP_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.atlasmap.lazyStartProducer";
    public static final String CAMEL_SINK_ATLASMAP_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ATLASMAP_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ATLASMAP_COMPONENT_ATLAS_CONTEXT_FACTORY_CONF = "camel.component.atlasmap.atlasContextFactory";
    public static final String CAMEL_SINK_ATLASMAP_COMPONENT_ATLAS_CONTEXT_FACTORY_DOC = "To use the AtlasContextFactory otherwise a new engine is created.";
    public static final String CAMEL_SINK_ATLASMAP_COMPONENT_ATLAS_CONTEXT_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_ATLASMAP_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.atlasmap.autowiredEnabled";
    public static final String CAMEL_SINK_ATLASMAP_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_ATLASMAP_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelAtlasmapSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAtlasmapSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_ATLASMAP_PATH_RESOURCE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATLASMAP_PATH_RESOURCE_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_ATLASMAP_PATH_RESOURCE_URI_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATLASMAP_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_ENDPOINT_CONTENT_CACHE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATLASMAP_ENDPOINT_CONTENT_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_ENDPOINT_CONTENT_CACHE_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATLASMAP_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_ENDPOINT_SOURCE_MAP_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATLASMAP_ENDPOINT_SOURCE_MAP_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_ENDPOINT_SOURCE_MAP_NAME_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_MODE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_MODE_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_ENDPOINT_TARGET_MAP_NAME_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_ENDPOINT_PROPERTIES_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATLASMAP_ENDPOINT_PROPERTIES_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_ENDPOINT_PROPERTIES_FILE_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATLASMAP_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_COMPONENT_ATLAS_CONTEXT_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ATLASMAP_COMPONENT_ATLAS_CONTEXT_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_COMPONENT_ATLAS_CONTEXT_FACTORY_DOC);
        conf.define(CAMEL_SINK_ATLASMAP_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ATLASMAP_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ATLASMAP_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}