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
package org.apache.camel.kafkaconnector.salesforcesource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSalesforcesourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_QUERY_CONF = "camel.kamelet.salesforce-source.query";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_QUERY_DOC = "The query to execute on Salesforce Example: SELECT Id, Name, Email, Phone FROM Contact";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_QUERY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_TOPIC_NAME_CONF = "camel.kamelet.salesforce-source.topicName";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_TOPIC_NAME_DOC = "The name of the topic/channel to use Example: ContactTopic";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_TOPIC_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_LOGIN_URL_CONF = "camel.kamelet.salesforce-source.loginUrl";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_LOGIN_URL_DOC = "The Salesforce instance login URL";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_LOGIN_URL_DEFAULT = "https://login.salesforce.com";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_ID_CONF = "camel.kamelet.salesforce-source.clientId";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_ID_DOC = "The Salesforce application consumer key";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_SECRET_CONF = "camel.kamelet.salesforce-source.clientSecret";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_SECRET_DOC = "The Salesforce application consumer secret";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_USER_NAME_CONF = "camel.kamelet.salesforce-source.userName";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_USER_NAME_DOC = "The Salesforce username";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.salesforce-source.password";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_PASSWORD_DOC = "The Salesforce user password";
    public static final String CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_PASSWORD_DEFAULT = null;

    public CamelSalesforcesourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSalesforcesourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_QUERY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_QUERY_DOC);
        conf.define(CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_TOPIC_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_TOPIC_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_TOPIC_NAME_DOC);
        conf.define(CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_LOGIN_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_LOGIN_URL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_LOGIN_URL_DOC);
        conf.define(CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_ID_DOC);
        conf.define(CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_SECRET_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_CLIENT_SECRET_DOC);
        conf.define(CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_USER_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_USER_NAME_DOC);
        conf.define(CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SALESFORCESOURCE_KAMELET_PASSWORD_DOC);
        return conf;
    }
}