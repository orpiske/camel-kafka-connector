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
package org.apache.camel.kafkaconnector.azurestoragequeuesource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzurestoragequeuesourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCOUNT_NAME_CONF = "camel.kamelet.azure-storage-queue-source.accountName";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCOUNT_NAME_DOC = "The Azure Storage Queue account name.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCOUNT_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_QUEUE_NAME_CONF = "camel.kamelet.azure-storage-queue-source.queueName";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_QUEUE_NAME_DOC = "The Azure Storage Queue container name.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_QUEUE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCESS_KEY_CONF = "camel.kamelet.azure-storage-queue-source.accessKey";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCESS_KEY_DOC = "The Azure Storage Queue access key.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_MAX_MESSAGES_CONF = "camel.kamelet.azure-storage-queue-source.maxMessages";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_MAX_MESSAGES_DOC = "The maximum number of messages to get. You can specify a value between 1 and 32. The default is 1 (one message). If there are fewer than the maximum number of messages in the queue, then all the messages are returned.";
    public static final Integer CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_MAX_MESSAGES_DEFAULT = 1;
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_CREDENTIAL_TYPE_CONF = "camel.kamelet.azure-storage-queue-source.credentialType";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_CREDENTIAL_TYPE_DOC = "Determines the credential strategy to adopt.";
    public static final String CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_CREDENTIAL_TYPE_DEFAULT = "SHARED_ACCOUNT_KEY";

    public CamelAzurestoragequeuesourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzurestoragequeuesourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCOUNT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCOUNT_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCOUNT_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_QUEUE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_QUEUE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_QUEUE_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCESS_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_MAX_MESSAGES_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_MAX_MESSAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_MAX_MESSAGES_DOC);
        conf.define(CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_CREDENTIAL_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_CREDENTIAL_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURESTORAGEQUEUESOURCE_KAMELET_CREDENTIAL_TYPE_DOC);
        return conf;
    }
}