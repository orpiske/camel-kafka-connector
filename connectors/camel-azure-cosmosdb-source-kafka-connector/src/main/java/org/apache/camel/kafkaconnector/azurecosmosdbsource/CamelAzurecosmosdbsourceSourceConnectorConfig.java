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
package org.apache.camel.kafkaconnector.azurecosmosdbsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAzurecosmosdbsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_NAME_CONF = "camel.kamelet.azure-cosmosdb-source.databaseName";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_NAME_DOC = "The Azure Cosmos database name.";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CONTAINER_NAME_CONF = "camel.kamelet.azure-cosmosdb-source.containerName";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CONTAINER_NAME_DOC = "The Azure Cosmos container name.";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CONTAINER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_ACCOUNT_KEY_CONF = "camel.kamelet.azure-cosmosdb-source.accountKey";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_ACCOUNT_KEY_DOC = "The Azure Cosmos account Key.";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_DATABASE_NAME_CONF = "camel.kamelet.azure-cosmosdb-source.leaseDatabaseName";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_DATABASE_NAME_DOC = "Sets the lease container which acts as a state storage and coordinates processing the change feed across multiple workers.";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_DATABASE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_CONTAINER_NAME_CONF = "camel.kamelet.azure-cosmosdb-source.leaseContainerName";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_CONTAINER_NAME_DOC = "Sets the lease database where the leaseContainerName will be stored.";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_CONTAINER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_DATABASE_IF_NOT_EXISTS_CONF = "camel.kamelet.azure-cosmosdb-source.createLeaseDatabaseIfNotExists";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_DATABASE_IF_NOT_EXISTS_DOC = "Sets if the component should create Cosmos lease database for the consumer automatically in case it doesn’t exist in Cosmos account.";
    public static final Boolean CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_DATABASE_IF_NOT_EXISTS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_CONTAINER_IF_NOT_EXISTS_CONF = "camel.kamelet.azure-cosmosdb-source.createLeaseContainerIfNotExists";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_CONTAINER_IF_NOT_EXISTS_DOC = "Sets if the component should create Cosmos lease container for the consumer automatically in case it doesn’t exist in Cosmos database.";
    public static final Boolean CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_CONTAINER_IF_NOT_EXISTS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_ENDPOINT_CONF = "camel.kamelet.azure-cosmosdb-source.databaseEndpoint";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_ENDPOINT_DOC = "Sets the Azure Cosmos database endpoint the component will connect to.";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_ENDPOINT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREDENTIAL_TYPE_CONF = "camel.kamelet.azure-cosmosdb-source.credentialType";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREDENTIAL_TYPE_DOC = "Determines the credential strategy to adopt.";
    public static final String CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREDENTIAL_TYPE_DEFAULT = "SHARED_ACCOUNT_KEY";

    public CamelAzurecosmosdbsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAzurecosmosdbsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CONTAINER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CONTAINER_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CONTAINER_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_ACCOUNT_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_DATABASE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_DATABASE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_DATABASE_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_CONTAINER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_CONTAINER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_LEASE_CONTAINER_NAME_DOC);
        conf.define(CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_DATABASE_IF_NOT_EXISTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_DATABASE_IF_NOT_EXISTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_DATABASE_IF_NOT_EXISTS_DOC);
        conf.define(CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_CONTAINER_IF_NOT_EXISTS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_CONTAINER_IF_NOT_EXISTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREATE_LEASE_CONTAINER_IF_NOT_EXISTS_DOC);
        conf.define(CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_ENDPOINT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_ENDPOINT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_DATABASE_ENDPOINT_DOC);
        conf.define(CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREDENTIAL_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREDENTIAL_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AZURECOSMOSDBSOURCE_KAMELET_CREDENTIAL_TYPE_DOC);
        return conf;
    }
}