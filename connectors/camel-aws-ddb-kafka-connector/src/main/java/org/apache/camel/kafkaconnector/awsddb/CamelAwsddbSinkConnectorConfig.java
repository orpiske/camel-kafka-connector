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
package org.apache.camel.kafkaconnector.awsddb;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwsddbSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AWSDDB_PATH_TABLE_NAME_CONF = "camel.sink.path.tableName";
    public static final String CAMEL_SINK_AWSDDB_PATH_TABLE_NAME_DOC = "The name of the table currently worked with.";
    public static final String CAMEL_SINK_AWSDDB_PATH_TABLE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_AMAZON_DDBCLIENT_CONF = "camel.sink.endpoint.amazonDDBClient";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_AMAZON_DDBCLIENT_DOC = "To use the AmazonDynamoDB as the client";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_AMAZON_DDBCLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_CONSISTENT_READ_CONF = "camel.sink.endpoint.consistentRead";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_CONSISTENT_READ_DOC = "Determines whether or not strong consistency should be enforced when data is read.";
    public static final Boolean CAMEL_SINK_AWSDDB_ENDPOINT_CONSISTENT_READ_DEFAULT = false;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_NAME_CONF = "camel.sink.endpoint.keyAttributeName";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_NAME_DOC = "Attribute name when creating table";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_TYPE_CONF = "camel.sink.endpoint.keyAttributeType";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_TYPE_DOC = "Attribute type when creating table";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSDDB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_OPERATION_DOC = "What operation to perform One of: [BatchGetItems] [DeleteItem] [DeleteTable] [DescribeTable] [GetItem] [PutItem] [Query] [Scan] [UpdateItem] [UpdateTable]";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_OPERATION_DEFAULT = "PutItem";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_HOST_DOC = "To define a proxy host when instantiating the DDB client";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PORT_DOC = "To define a proxy port when instantiating the DDB client. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PROTOCOL_CONF = "camel.sink.endpoint.proxyProtocol";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the DDB client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_READ_CAPACITY_CONF = "camel.sink.endpoint.readCapacity";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_READ_CAPACITY_DOC = "The provisioned throughput to reserve for reading resources from your table";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_READ_CAPACITY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_REGION_DOC = "The region in which DDB client needs to work";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_WRITE_CAPACITY_CONF = "camel.sink.endpoint.writeCapacity";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_WRITE_CAPACITY_DOC = "The provisioned throughput to reserved for writing resources to your table";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_WRITE_CAPACITY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AWSDDB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_AWSDDB_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWSDDB_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_ACCESS_KEY_CONF = "camel.component.aws-ddb.accessKey";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.aws-ddb.lazyStartProducer";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSDDB_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_REGION_CONF = "camel.component.aws-ddb.region";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_REGION_DOC = "The region in which DDB client needs to work";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_SECRET_KEY_CONF = "camel.component.aws-ddb.secretKey";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.aws-ddb.basicPropertyBinding";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AWSDDB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_CONFIGURATION_CONF = "camel.component.aws-ddb.configuration";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_CONFIGURATION_DOC = "The AWS DDB default configuration";
    public static final String CAMEL_SINK_AWSDDB_COMPONENT_CONFIGURATION_DEFAULT = null;

    public CamelAwsddbSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwsddbSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AWSDDB_PATH_TABLE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_PATH_TABLE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSDDB_PATH_TABLE_NAME_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_AMAZON_DDBCLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_AMAZON_DDBCLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_AMAZON_DDBCLIENT_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_CONSISTENT_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSDDB_ENDPOINT_CONSISTENT_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_CONSISTENT_READ_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_NAME_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_KEY_ATTRIBUTE_TYPE_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSDDB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_READ_CAPACITY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_READ_CAPACITY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_READ_CAPACITY_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_WRITE_CAPACITY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_WRITE_CAPACITY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_WRITE_CAPACITY_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSDDB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSDDB_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSDDB_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWSDDB_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSDDB_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSDDB_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSDDB_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSDDB_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_COMPONENT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWSDDB_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSDDB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AWSDDB_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSDDB_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSDDB_COMPONENT_CONFIGURATION_DOC);
        return conf;
    }
}