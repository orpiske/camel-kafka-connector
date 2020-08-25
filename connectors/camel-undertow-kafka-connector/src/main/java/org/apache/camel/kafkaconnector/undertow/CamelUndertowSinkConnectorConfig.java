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
package org.apache.camel.kafkaconnector.undertow;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelUndertowSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_UNDERTOW_PATH_HTTP_URICONF = "camel.sink.path.httpURI";
    public static final String CAMEL_SINK_UNDERTOW_PATH_HTTP_URIDOC = "The url of the HTTP endpoint to use.";
    public static final String CAMEL_SINK_UNDERTOW_PATH_HTTP_URIDEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_USE_STREAMING_CONF = "camel.sink.endpoint.useStreaming";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_USE_STREAMING_DOC = "For HTTP endpoint: if true, text and binary messages will be wrapped as java.io.InputStream before they are passed to an Exchange; otherwise they will be passed as byte. For WebSocket endpoint: if true, text and binary messages will be wrapped as java.io.Reader and java.io.InputStream respectively before they are passed to an Exchange; otherwise they will be passed as String and byte respectively.";
    public static final Boolean CAMEL_SINK_UNDERTOW_ENDPOINT_USE_STREAMING_DEFAULT = false;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_COOKIE_HANDLER_CONF = "camel.sink.endpoint.cookieHandler";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_COOKIE_HANDLER_DOC = "Configure a cookie handler to maintain a HTTP session";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_COOKIE_HANDLER_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_KEEP_ALIVE_CONF = "camel.sink.endpoint.keepAlive";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_KEEP_ALIVE_DOC = "Setting to ensure socket is not closed due to inactivity";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_KEEP_ALIVE_DEFAULT = "true";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_UNDERTOW_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_OPTIONS_CONF = "camel.sink.endpoint.options";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_OPTIONS_DOC = "Sets additional channel options. The options that can be used are defined in org.xnio.Options. To configure from endpoint uri, then prefix each option with option., such as option.close-abort=true&option.send-buffer=8192";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_PRESERVE_HOST_HEADER_CONF = "camel.sink.endpoint.preserveHostHeader";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_PRESERVE_HOST_HEADER_DOC = "If the option is true, UndertowProducer will set the Host header to the value contained in the current exchange Host header, useful in reverse proxy applications where you want the Host header received by the downstream server to reflect the URL called by the upstream client, this allows applications which use the Host header to generate accurate URL's for a proxied service.";
    public static final Boolean CAMEL_SINK_UNDERTOW_ENDPOINT_PRESERVE_HOST_HEADER_DEFAULT = true;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_REUSE_ADDRESSES_CONF = "camel.sink.endpoint.reuseAddresses";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_REUSE_ADDRESSES_DOC = "Setting to facilitate socket multiplexing";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_REUSE_ADDRESSES_DEFAULT = "true";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_TCP_NO_DELAY_CONF = "camel.sink.endpoint.tcpNoDelay";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_TCP_NO_DELAY_DOC = "Setting to improve TCP protocol performance";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_TCP_NO_DELAY_DEFAULT = "true";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF = "camel.sink.endpoint.throwExceptionOnFailure";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC = "Option to disable throwing the HttpOperationFailedException in case of failed responses from the remote server. This allows you to get all responses regardless of the HTTP status code.";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT = "true";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_TRANSFER_EXCEPTION_CONF = "camel.sink.endpoint.transferException";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_TRANSFER_EXCEPTION_DOC = "If enabled and an Exchange failed processing on the consumer side and if the caused Exception was send back serialized in the response as a application/x-java-serialized-object content type. On the producer side the exception will be deserialized and thrown as is instead of the HttpOperationFailedException. The caused exception is required to be serialized. This is by default turned off. If you enable this then be aware that Java will deserialize the incoming data from the request to Java and that can be a potential security risk.";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT = "false";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_ACCESS_LOG_RECEIVER_CONF = "camel.sink.endpoint.accessLogReceiver";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_ACCESS_LOG_RECEIVER_DOC = "Which Undertow AccessLogReceiver should be used Will use JBossLoggingAccessLogReceiver if not specified";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_ACCESS_LOG_RECEIVER_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_UNDERTOW_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.sink.endpoint.headerFilterStrategy";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_UNDERTOW_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_UNDERTOW_HTTP_BINDING_CONF = "camel.sink.endpoint.undertowHttpBinding";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_UNDERTOW_HTTP_BINDING_DOC = "To use a custom UndertowHttpBinding to control the mapping between Camel message and undertow.";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_UNDERTOW_HTTP_BINDING_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_ALLOWED_ROLES_CONF = "camel.sink.endpoint.allowedRoles";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_ALLOWED_ROLES_DOC = "Configuration used by UndertowSecurityProvider. Comma separated list of allowed roles.";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_ALLOWED_ROLES_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_CONFIGURATION_CONF = "camel.sink.endpoint.securityConfiguration";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_CONFIGURATION_DOC = "OConfiguration used by UndertowSecurityProvider. Security configuration object for use from UndertowSecurityProvider. Configuration is UndertowSecurityProvider specific. Each provider decides whether accepts configuration.";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_PROVIDER_CONF = "camel.sink.endpoint.securityProvider";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_PROVIDER_DOC = "Security provider allows plug in the provider, which will be used to secure requests. SPI approach could be used too (endpoint then finds security provider using SPI).";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.sink.endpoint.sslContextParameters";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TIMEOUT_CONF = "camel.sink.endpoint.sendTimeout";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TIMEOUT_DOC = "Timeout in milliseconds when sending to a websocket channel. The default timeout is 30000 (30 seconds).";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TIMEOUT_DEFAULT = "30000";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TO_ALL_CONF = "camel.sink.endpoint.sendToAll";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TO_ALL_DOC = "To send to all websocket subscribers. Can be used to configure on endpoint level, instead of having to use the UndertowConstants.SEND_TO_ALL header on the message.";
    public static final String CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TO_ALL_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.undertow.lazyStartProducer";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_UNDERTOW_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.undertow.basicPropertyBinding";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_UNDERTOW_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_HOST_OPTIONS_CONF = "camel.component.undertow.hostOptions";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_HOST_OPTIONS_DOC = "To configure common options, such as thread pools";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_HOST_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_UNDERTOW_HTTP_BINDING_CONF = "camel.component.undertow.undertowHttpBinding";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_UNDERTOW_HTTP_BINDING_DOC = "To use a custom HttpBinding to control the mapping between Camel message and HttpClient.";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_UNDERTOW_HTTP_BINDING_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_ALLOWED_ROLES_CONF = "camel.component.undertow.allowedRoles";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_ALLOWED_ROLES_DOC = "Configuration used by UndertowSecurityProvider. Comma separated list of allowed roles.";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_ALLOWED_ROLES_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_CONFIGURATION_CONF = "camel.component.undertow.securityConfiguration";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_CONFIGURATION_DOC = "Configuration used by UndertowSecurityProvider. Security configuration object for use from UndertowSecurityProvider. Configuration is UndertowSecurityProvider specific. Each provider decides, whether it accepts configuration.";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_PROVIDER_CONF = "camel.component.undertow.securityProvider";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_PROVIDER_DOC = "Security provider allows plug in the provider, which will be used to secure requests. SPI approach could be used too (component then finds security provider using SPI).";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_PROVIDER_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.undertow.sslContextParameters";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.undertow.useGlobalSslContextParameters";
    public static final String CAMEL_SINK_UNDERTOW_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SINK_UNDERTOW_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelUndertowSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelUndertowSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_UNDERTOW_PATH_HTTP_URICONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_PATH_HTTP_URIDEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_UNDERTOW_PATH_HTTP_URIDOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_USE_STREAMING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_UNDERTOW_ENDPOINT_USE_STREAMING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_USE_STREAMING_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_COOKIE_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_COOKIE_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_COOKIE_HANDLER_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_KEEP_ALIVE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_KEEP_ALIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_KEEP_ALIVE_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_UNDERTOW_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_OPTIONS_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_PRESERVE_HOST_HEADER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_UNDERTOW_ENDPOINT_PRESERVE_HOST_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_PRESERVE_HOST_HEADER_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_REUSE_ADDRESSES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_REUSE_ADDRESSES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_REUSE_ADDRESSES_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_TCP_NO_DELAY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_TCP_NO_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_TCP_NO_DELAY_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_TRANSFER_EXCEPTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_TRANSFER_EXCEPTION_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_ACCESS_LOG_RECEIVER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_ACCESS_LOG_RECEIVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_ACCESS_LOG_RECEIVER_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_UNDERTOW_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_UNDERTOW_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_UNDERTOW_HTTP_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_UNDERTOW_HTTP_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_UNDERTOW_HTTP_BINDING_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_ALLOWED_ROLES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_ALLOWED_ROLES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_ALLOWED_ROLES_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_SECURITY_PROVIDER_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TO_ALL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TO_ALL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_ENDPOINT_SEND_TO_ALL_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_UNDERTOW_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_UNDERTOW_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_COMPONENT_HOST_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_COMPONENT_HOST_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_COMPONENT_HOST_OPTIONS_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_COMPONENT_UNDERTOW_HTTP_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_COMPONENT_UNDERTOW_HTTP_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_COMPONENT_UNDERTOW_HTTP_BINDING_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_COMPONENT_ALLOWED_ROLES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_COMPONENT_ALLOWED_ROLES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_COMPONENT_ALLOWED_ROLES_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_PROVIDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_COMPONENT_SECURITY_PROVIDER_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_UNDERTOW_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SINK_UNDERTOW_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_UNDERTOW_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_UNDERTOW_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}