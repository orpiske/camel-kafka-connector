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
package org.apache.camel.kafkaconnector.avro;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAvroSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AVRO_PATH_TRANSPORT_CONF = "camel.source.path.transport";
    public static final String CAMEL_SOURCE_AVRO_PATH_TRANSPORT_DOC = "Transport to use, can be either http or netty One of: [http] [netty]";
    public static final String CAMEL_SOURCE_AVRO_PATH_TRANSPORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_PATH_PORT_CONF = "camel.source.path.port";
    public static final String CAMEL_SOURCE_AVRO_PATH_PORT_DOC = "Port number to use";
    public static final Integer CAMEL_SOURCE_AVRO_PATH_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_PATH_HOST_CONF = "camel.source.path.host";
    public static final String CAMEL_SOURCE_AVRO_PATH_HOST_DOC = "Hostname to use";
    public static final String CAMEL_SOURCE_AVRO_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_PATH_MESSAGE_NAME_CONF = "camel.source.path.messageName";
    public static final String CAMEL_SOURCE_AVRO_PATH_MESSAGE_NAME_DOC = "The name of the message to send.";
    public static final String CAMEL_SOURCE_AVRO_PATH_MESSAGE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_CONF = "camel.source.endpoint.protocol";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_DOC = "Avro protocol to use";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_CONF = "camel.source.endpoint.protocolClassName";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_DOC = "Avro protocol to use defined by the FQN class name";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_LOCATION_CONF = "camel.source.endpoint.protocolLocation";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_LOCATION_DOC = "Avro protocol location";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_LOCATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_REFLECTION_PROTOCOL_CONF = "camel.source.endpoint.reflectionProtocol";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_REFLECTION_PROTOCOL_DOC = "If protocol object provided is reflection protocol. Should be used only with protocol parameter because for protocolClassName protocol type will be auto detected";
    public static final Boolean CAMEL_SOURCE_AVRO_ENDPOINT_REFLECTION_PROTOCOL_DEFAULT = false;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_SINGLE_PARAMETER_CONF = "camel.source.endpoint.singleParameter";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_SINGLE_PARAMETER_DOC = "If true, consumer parameter won't be wrapped into array. Will fail if protocol specifies more then 1 parameter for the message";
    public static final Boolean CAMEL_SOURCE_AVRO_ENDPOINT_SINGLE_PARAMETER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_URI_AUTHORITY_CONF = "camel.source.endpoint.uriAuthority";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_URI_AUTHORITY_DOC = "Authority to use (username and password)";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_URI_AUTHORITY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AVRO_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_AVRO_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_AVRO_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_CONF = "camel.component.avro.protocol";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_DOC = "Avro protocol to use";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_CLASS_NAME_CONF = "camel.component.avro.protocolClassName";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_CLASS_NAME_DOC = "Avro protocol to use defined by the FQN class name";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_CLASS_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_LOCATION_CONF = "camel.component.avro.protocolLocation";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_LOCATION_DOC = "Avro protocol location";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_LOCATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_REFLECTION_PROTOCOL_CONF = "camel.component.avro.reflectionProtocol";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_REFLECTION_PROTOCOL_DOC = "If protocol object provided is reflection protocol. Should be used only with protocol parameter because for protocolClassName protocol type will be auto detected";
    public static final Boolean CAMEL_SOURCE_AVRO_COMPONENT_REFLECTION_PROTOCOL_DEFAULT = false;
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_SINGLE_PARAMETER_CONF = "camel.component.avro.singleParameter";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_SINGLE_PARAMETER_DOC = "If true, consumer parameter won't be wrapped into array. Will fail if protocol specifies more then 1 parameter for the message";
    public static final Boolean CAMEL_SOURCE_AVRO_COMPONENT_SINGLE_PARAMETER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_URI_AUTHORITY_CONF = "camel.component.avro.uriAuthority";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_URI_AUTHORITY_DOC = "Authority to use (username and password)";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_URI_AUTHORITY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.avro.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AVRO_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.avro.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_CONFIGURATION_CONF = "camel.component.avro.configuration";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_CONFIGURATION_DOC = "To use a shared AvroConfiguration to configure options once";
    public static final String CAMEL_SOURCE_AVRO_COMPONENT_CONFIGURATION_DEFAULT = null;

    public CamelAvroSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAvroSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AVRO_PATH_TRANSPORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_PATH_TRANSPORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AVRO_PATH_TRANSPORT_DOC);
        conf.define(CAMEL_SOURCE_AVRO_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AVRO_PATH_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AVRO_PATH_PORT_DOC);
        conf.define(CAMEL_SOURCE_AVRO_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AVRO_PATH_HOST_DOC);
        conf.define(CAMEL_SOURCE_AVRO_PATH_MESSAGE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_PATH_MESSAGE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_PATH_MESSAGE_NAME_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_CLASS_NAME_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_PROTOCOL_LOCATION_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_REFLECTION_PROTOCOL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AVRO_ENDPOINT_REFLECTION_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_REFLECTION_PROTOCOL_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_SINGLE_PARAMETER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AVRO_ENDPOINT_SINGLE_PARAMETER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_SINGLE_PARAMETER_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_URI_AUTHORITY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_ENDPOINT_URI_AUTHORITY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_URI_AUTHORITY_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AVRO_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AVRO_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AVRO_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_DOC);
        conf.define(CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_CLASS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_CLASS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_CLASS_NAME_DOC);
        conf.define(CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_COMPONENT_PROTOCOL_LOCATION_DOC);
        conf.define(CAMEL_SOURCE_AVRO_COMPONENT_REFLECTION_PROTOCOL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AVRO_COMPONENT_REFLECTION_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_COMPONENT_REFLECTION_PROTOCOL_DOC);
        conf.define(CAMEL_SOURCE_AVRO_COMPONENT_SINGLE_PARAMETER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AVRO_COMPONENT_SINGLE_PARAMETER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_COMPONENT_SINGLE_PARAMETER_DOC);
        conf.define(CAMEL_SOURCE_AVRO_COMPONENT_URI_AUTHORITY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_COMPONENT_URI_AUTHORITY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_COMPONENT_URI_AUTHORITY_DOC);
        conf.define(CAMEL_SOURCE_AVRO_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AVRO_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_AVRO_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AVRO_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AVRO_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AVRO_COMPONENT_CONFIGURATION_DOC);
        return conf;
    }
}