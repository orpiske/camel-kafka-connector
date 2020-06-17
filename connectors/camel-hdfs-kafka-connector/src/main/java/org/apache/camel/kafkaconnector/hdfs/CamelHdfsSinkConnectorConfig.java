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
package org.apache.camel.kafkaconnector.hdfs;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelHdfsSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_HDFS_PATH_HOST_NAME_CONF = "camel.sink.path.hostName";
    public static final String CAMEL_SINK_HDFS_PATH_HOST_NAME_DOC = "HDFS host to use";
    public static final String CAMEL_SINK_HDFS_PATH_HOST_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_HDFS_PATH_PORT_CONF = "camel.sink.path.port";
    public static final String CAMEL_SINK_HDFS_PATH_PORT_DOC = "HDFS port to use";
    public static final Integer CAMEL_SINK_HDFS_PATH_PORT_DEFAULT = 8020;
    public static final String CAMEL_SINK_HDFS_PATH_PATH_CONF = "camel.sink.path.path";
    public static final String CAMEL_SINK_HDFS_PATH_PATH_DOC = "The directory path to use";
    public static final String CAMEL_SINK_HDFS_PATH_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_CONNECT_ON_STARTUP_CONF = "camel.sink.endpoint.connectOnStartup";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_CONNECT_ON_STARTUP_DOC = "Whether to connect to the HDFS file system on starting the producer/consumer. If false then the connection is created on-demand. Notice that HDFS may take up till 15 minutes to establish a connection, as it has hardcoded 45 x 20 sec redelivery. By setting this option to false allows your application to startup, and not block for up till 15 minutes.";
    public static final Boolean CAMEL_SINK_HDFS_ENDPOINT_CONNECT_ON_STARTUP_DEFAULT = true;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_CONF = "camel.sink.endpoint.fileSystemType";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_DOC = "Set to LOCAL to not use HDFS but local java.io.File instead. One of: [LOCAL] [HDFS]";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_DEFAULT = "HDFS";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_FILE_TYPE_CONF = "camel.sink.endpoint.fileType";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_FILE_TYPE_DOC = "The file type to use. For more details see Hadoop HDFS documentation about the various files types. One of: [NORMAL_FILE] [SEQUENCE_FILE] [MAP_FILE] [BLOOMMAP_FILE] [ARRAY_FILE]";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_FILE_TYPE_DEFAULT = "NORMAL_FILE";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KEY_TYPE_CONF = "camel.sink.endpoint.keyType";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KEY_TYPE_DOC = "The type for the key in case of sequence or map files. One of: [NULL] [BOOLEAN] [BYTE] [INT] [FLOAT] [LONG] [DOUBLE] [TEXT] [BYTES]";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KEY_TYPE_DEFAULT = "NULL";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_NAMED_NODES_CONF = "camel.sink.endpoint.namedNodes";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_NAMED_NODES_DOC = "A comma separated list of named nodes (e.g. srv11.example.com:8020,srv12.example.com:8020)";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_NAMED_NODES_DEFAULT = null;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_OWNER_CONF = "camel.sink.endpoint.owner";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_OWNER_DOC = "The file owner must match this owner for the consumer to pickup the file. Otherwise the file is skipped.";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_OWNER_DEFAULT = null;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_VALUE_TYPE_CONF = "camel.sink.endpoint.valueType";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_VALUE_TYPE_DOC = "The type for the key in case of sequence or map files One of: [NULL] [BOOLEAN] [BYTE] [INT] [FLOAT] [LONG] [DOUBLE] [TEXT] [BYTES]";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_VALUE_TYPE_DEFAULT = "BYTES";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_APPEND_CONF = "camel.sink.endpoint.append";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_APPEND_DOC = "Append to existing file. Notice that not all HDFS file systems support the append option.";
    public static final Boolean CAMEL_SINK_HDFS_ENDPOINT_APPEND_DEFAULT = false;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_HDFS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_OVERWRITE_CONF = "camel.sink.endpoint.overwrite";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_OVERWRITE_DOC = "Whether to overwrite existing files with the same name";
    public static final Boolean CAMEL_SINK_HDFS_ENDPOINT_OVERWRITE_DEFAULT = true;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_HDFS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_BLOCK_SIZE_CONF = "camel.sink.endpoint.blockSize";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_BLOCK_SIZE_DOC = "The size of the HDFS blocks";
    public static final Long CAMEL_SINK_HDFS_ENDPOINT_BLOCK_SIZE_DEFAULT = 67108864L;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_BUFFER_SIZE_CONF = "camel.sink.endpoint.bufferSize";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_BUFFER_SIZE_DOC = "The buffer size used by HDFS";
    public static final Integer CAMEL_SINK_HDFS_ENDPOINT_BUFFER_SIZE_DEFAULT = 4096;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_CONF = "camel.sink.endpoint.checkIdleInterval";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_DOC = "How often (time in millis) in to run the idle checker background task. This option is only in use if the splitter strategy is IDLE.";
    public static final Integer CAMEL_SINK_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_DEFAULT = 500;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_CHUNK_SIZE_CONF = "camel.sink.endpoint.chunkSize";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_CHUNK_SIZE_DOC = "When reading a normal file, this is split into chunks producing a message per chunk.";
    public static final Integer CAMEL_SINK_HDFS_ENDPOINT_CHUNK_SIZE_DEFAULT = 4096;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_CODEC_CONF = "camel.sink.endpoint.compressionCodec";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_CODEC_DOC = "The compression codec to use One of: [DEFAULT] [GZIP] [BZIP2]";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_CODEC_DEFAULT = "DEFAULT";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_TYPE_CONF = "camel.sink.endpoint.compressionType";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_TYPE_DOC = "The compression type to use (is default not in use) One of: [NONE] [RECORD] [BLOCK]";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_TYPE_DEFAULT = "NONE";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_OPENED_SUFFIX_CONF = "camel.sink.endpoint.openedSuffix";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_OPENED_SUFFIX_DOC = "When a file is opened for reading/writing the file is renamed with this suffix to avoid to read it during the writing phase.";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_OPENED_SUFFIX_DEFAULT = "opened";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_READ_SUFFIX_CONF = "camel.sink.endpoint.readSuffix";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_READ_SUFFIX_DOC = "Once the file has been read is renamed with this suffix to avoid to read it again.";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_READ_SUFFIX_DEFAULT = "read";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_REPLICATION_CONF = "camel.sink.endpoint.replication";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_REPLICATION_DOC = "The HDFS replication factor";
    public static final Short CAMEL_SINK_HDFS_ENDPOINT_REPLICATION_DEFAULT = 3;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_SPLIT_STRATEGY_CONF = "camel.sink.endpoint.splitStrategy";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_SPLIT_STRATEGY_DOC = "In the current version of Hadoop opening a file in append mode is disabled since it's not very reliable. So, for the moment, it's only possible to create new files. The Camel HDFS endpoint tries to solve this problem in this way: If the split strategy option has been defined, the hdfs path will be used as a directory and files will be created using the configured UuidGenerator. Every time a splitting condition is met, a new file is created. The splitStrategy option is defined as a string with the following syntax: splitStrategy=ST:value,ST:value,... where ST can be: BYTES a new file is created, and the old is closed when the number of written bytes is more than value MESSAGES a new file is created, and the old is closed when the number of written messages is more than value IDLE a new file is created, and the old is closed when no writing happened in the last value milliseconds";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_SPLIT_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_HDFS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_CONF = "camel.sink.endpoint.kerberosConfigFileLocation";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_DOC = "The location of the kerb5.conf file (https://web.mit.edu/kerberos/krb5-1.12/doc/admin/conf_files/krb5_conf.html)";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_DEFAULT = null;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_CONF = "camel.sink.endpoint.kerberosKeytabLocation";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_DOC = "The location of the keytab file used to authenticate with the kerberos nodes (contains pairs of kerberos principals and encrypted keys (which are derived from the Kerberos password))";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_DEFAULT = null;
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_USERNAME_CONF = "camel.sink.endpoint.kerberosUsername";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_USERNAME_DOC = "The username used to authenticate with the kerberos nodes";
    public static final String CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_HDFS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.hdfs.lazyStartProducer";
    public static final String CAMEL_SINK_HDFS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_HDFS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_HDFS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.hdfs.basicPropertyBinding";
    public static final String CAMEL_SINK_HDFS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_HDFS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_HDFS_COMPONENT_JAASCONFIGURATION_CONF = "camel.component.hdfs.jAASConfiguration";
    public static final String CAMEL_SINK_HDFS_COMPONENT_JAASCONFIGURATION_DOC = "To use the given configuration for security with JAAS.";
    public static final String CAMEL_SINK_HDFS_COMPONENT_JAASCONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_CONF = "camel.component.hdfs.kerberosConfigFile";
    public static final String CAMEL_SINK_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_DOC = "To use kerberos authentication, set the value of the 'java.security.krb5.conf' environment variable to an existing file. If the environment variable is already set, warn if different than the specified parameter";
    public static final String CAMEL_SINK_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_DEFAULT = null;

    public CamelHdfsSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelHdfsSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_HDFS_PATH_HOST_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_PATH_HOST_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_HDFS_PATH_HOST_NAME_DOC);
        conf.define(CAMEL_SINK_HDFS_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_HDFS_PATH_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_PATH_PORT_DOC);
        conf.define(CAMEL_SINK_HDFS_PATH_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_PATH_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_HDFS_PATH_PATH_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_CONNECT_ON_STARTUP_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HDFS_ENDPOINT_CONNECT_ON_STARTUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_CONNECT_ON_STARTUP_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_FILE_SYSTEM_TYPE_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_FILE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_FILE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_FILE_TYPE_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_KEY_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_KEY_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_KEY_TYPE_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_NAMED_NODES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_NAMED_NODES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_NAMED_NODES_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_OWNER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_OWNER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_OWNER_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_VALUE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_VALUE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_VALUE_TYPE_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_APPEND_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HDFS_ENDPOINT_APPEND_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_APPEND_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HDFS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_OVERWRITE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HDFS_ENDPOINT_OVERWRITE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_OVERWRITE_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HDFS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_BLOCK_SIZE_CONF, ConfigDef.Type.LONG, CAMEL_SINK_HDFS_ENDPOINT_BLOCK_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_BLOCK_SIZE_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_BUFFER_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_HDFS_ENDPOINT_BUFFER_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_BUFFER_SIZE_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_CONF, ConfigDef.Type.INT, CAMEL_SINK_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_CHECK_IDLE_INTERVAL_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_CHUNK_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_HDFS_ENDPOINT_CHUNK_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_CHUNK_SIZE_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_CODEC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_CODEC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_CODEC_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_COMPRESSION_TYPE_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_OPENED_SUFFIX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_OPENED_SUFFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_OPENED_SUFFIX_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_READ_SUFFIX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_READ_SUFFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_READ_SUFFIX_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_REPLICATION_CONF, ConfigDef.Type.SHORT, CAMEL_SINK_HDFS_ENDPOINT_REPLICATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_REPLICATION_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_SPLIT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_SPLIT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_SPLIT_STRATEGY_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HDFS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_CONFIG_FILE_LOCATION_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_KEYTAB_LOCATION_DOC);
        conf.define(CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_ENDPOINT_KERBEROS_USERNAME_DOC);
        conf.define(CAMEL_SINK_HDFS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HDFS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_HDFS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HDFS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_HDFS_COMPONENT_JAASCONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_COMPONENT_JAASCONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_COMPONENT_JAASCONFIGURATION_DOC);
        conf.define(CAMEL_SINK_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HDFS_COMPONENT_KERBEROS_CONFIG_FILE_DOC);
        return conf;
    }
}