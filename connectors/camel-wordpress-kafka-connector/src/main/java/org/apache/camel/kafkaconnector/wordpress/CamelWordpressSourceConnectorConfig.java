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
package org.apache.camel.kafkaconnector.wordpress;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelWordpressSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_CONF = "camel.source.path.operation";
    public static final String CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DOC = "The endpoint operation. One of: [post] [user]";
    public static final String CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DETAIL_CONF = "camel.source.path.operationDetail";
    public static final String CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DETAIL_DOC = "The second part of an endpoint operation. Needed only when endpoint semantic is not enough, like wordpress:post:delete One of: [delete]";
    public static final String CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DETAIL_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_API_VERSION_CONF = "camel.source.endpoint.apiVersion";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_API_VERSION_DOC = "The Wordpress REST API version";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_API_VERSION_DEFAULT = "2";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_CRITERIA_CONF = "camel.source.endpoint.criteria";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_CRITERIA_DOC = "The criteria to use with complex searches.";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_CRITERIA_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_FORCE_CONF = "camel.source.endpoint.force";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_FORCE_DOC = "Whether to bypass trash and force deletion.";
    public static final Boolean CAMEL_SOURCE_WORDPRESS_ENDPOINT_FORCE_DEFAULT = false;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_ID_CONF = "camel.source.endpoint.id";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_ID_DOC = "The entity ID. Should be passed when the operation performed requires a specific entity, e.g. deleting a post";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_PASSWORD_CONF = "camel.source.endpoint.password";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_PASSWORD_DOC = "Password from authorized user";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_CONF = "camel.source.endpoint.searchCriteria";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_DOC = "Search criteria";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_URL_CONF = "camel.source.endpoint.url";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_URL_DOC = "The Wordpress API URL from your site, e.g. http://myblog.com/wp-json/";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_USER_CONF = "camel.source.endpoint.user";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_USER_DOC = "Authorized user to perform writing operations";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_USER_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_WORDPRESS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_WORDPRESS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_WORDPRESS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_WORDPRESS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_API_VERSION_CONF = "camel.component.wordpress.apiVersion";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_API_VERSION_DOC = "The Wordpress REST API version";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_API_VERSION_DEFAULT = "2";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_CONFIGURATION_CONF = "camel.component.wordpress.configuration";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_CONFIGURATION_DOC = "Wordpress configuration";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_CRITERIA_CONF = "camel.component.wordpress.criteria";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_CRITERIA_DOC = "The criteria to use with complex searches.";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_CRITERIA_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_FORCE_CONF = "camel.component.wordpress.force";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_FORCE_DOC = "Whether to bypass trash and force deletion.";
    public static final Boolean CAMEL_SOURCE_WORDPRESS_COMPONENT_FORCE_DEFAULT = false;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_ID_CONF = "camel.component.wordpress.id";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_ID_DOC = "The entity ID. Should be passed when the operation performed requires a specific entity, e.g. deleting a post";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_PASSWORD_CONF = "camel.component.wordpress.password";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_PASSWORD_DOC = "Password from authorized user";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_SEARCH_CRITERIA_CONF = "camel.component.wordpress.searchCriteria";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_SEARCH_CRITERIA_DOC = "Search criteria";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_SEARCH_CRITERIA_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_URL_CONF = "camel.component.wordpress.url";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_URL_DOC = "The Wordpress API URL from your site, e.g. http://myblog.com/wp-json/";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_USER_CONF = "camel.component.wordpress.user";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_USER_DOC = "Authorized user to perform writing operations";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_USER_DEFAULT = null;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.wordpress.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_WORDPRESS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.wordpress.basicPropertyBinding";
    public static final String CAMEL_SOURCE_WORDPRESS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_WORDPRESS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelWordpressSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelWordpressSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DETAIL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DETAIL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_PATH_OPERATION_DETAIL_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_API_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_ENDPOINT_API_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_API_VERSION_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_CRITERIA_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_ENDPOINT_CRITERIA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_CRITERIA_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_FORCE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WORDPRESS_ENDPOINT_FORCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_FORCE_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_ENDPOINT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_ID_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_ENDPOINT_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_WORDPRESS_ENDPOINT_URL_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_ENDPOINT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_USER_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WORDPRESS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WORDPRESS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WORDPRESS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_API_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_COMPONENT_API_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_COMPONENT_API_VERSION_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_CRITERIA_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_COMPONENT_CRITERIA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_COMPONENT_CRITERIA_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_FORCE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WORDPRESS_COMPONENT_FORCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_COMPONENT_FORCE_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_COMPONENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_COMPONENT_ID_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_SEARCH_CRITERIA_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_COMPONENT_SEARCH_CRITERIA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_COMPONENT_SEARCH_CRITERIA_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_COMPONENT_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_WORDPRESS_COMPONENT_URL_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_WORDPRESS_COMPONENT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_COMPONENT_USER_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WORDPRESS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_WORDPRESS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_WORDPRESS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_WORDPRESS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_WORDPRESS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}