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
package org.apache.camel.kafkaconnector.sftpsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSftpsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_HOST_CONF = "camel.kamelet.sftp-source.connectionHost";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_HOST_DOC = "The hostname of the SFTP server.";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_PORT_CONF = "camel.kamelet.sftp-source.connectionPort";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_PORT_DOC = "The port of the FTP server.";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_PORT_DEFAULT = "22";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_USERNAME_CONF = "camel.kamelet.sftp-source.username";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_USERNAME_DOC = "The username to access the SFTP server.";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.sftp-source.password";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSWORD_DOC = "The password to access the SFTP server.";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_DIRECTORY_NAME_CONF = "camel.kamelet.sftp-source.directoryName";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_DIRECTORY_NAME_DOC = "The starting directory.";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_DIRECTORY_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSIVE_MODE_CONF = "camel.kamelet.sftp-source.passiveMode";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSIVE_MODE_DOC = "Sets the passive mode connection.";
    public static final Boolean CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSIVE_MODE_DEFAULT = false;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_RECURSIVE_CONF = "camel.kamelet.sftp-source.recursive";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_RECURSIVE_DOC = "If a directory, look for files in all sub-directories as well.";
    public static final Boolean CAMEL_SOURCE_SFTPSOURCE_KAMELET_RECURSIVE_DEFAULT = false;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_IDEMPOTENT_CONF = "camel.kamelet.sftp-source.idempotent";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_IDEMPOTENT_DOC = "Skip already-processed files.";
    public static final Boolean CAMEL_SOURCE_SFTPSOURCE_KAMELET_IDEMPOTENT_DEFAULT = true;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_IGNORE_FILE_NOT_FOUND_OR_PERMISSION_ERROR_CONF = "camel.kamelet.sftp-source.ignoreFileNotFoundOrPermissionError";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_IGNORE_FILE_NOT_FOUND_OR_PERMISSION_ERROR_DOC = "Whether to ignore when (trying to list files in directories or when downloading a file), which does not exist or due to permission error. By default when a directory or file does not exists or insufficient permission, then an exception is thrown. Setting this option to true allows to ignore that instead.";
    public static final Boolean CAMEL_SOURCE_SFTPSOURCE_KAMELET_IGNORE_FILE_NOT_FOUND_OR_PERMISSION_ERROR_DEFAULT = false;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_BINARY_CONF = "camel.kamelet.sftp-source.binary";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_BINARY_DOC = "Specifies the file transfer mode, BINARY or ASCII. Default is ASCII (false).";
    public static final Boolean CAMEL_SOURCE_SFTPSOURCE_KAMELET_BINARY_DEFAULT = false;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_FILE_CONF = "camel.kamelet.sftp-source.privateKeyFile";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_FILE_DOC = "Set the private key file so that the SFTP endpoint can do private key verification.";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_FILE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_PASSPHRASE_CONF = "camel.kamelet.sftp-source.privateKeyPassphrase";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_PASSPHRASE_DOC = "Set the private key file passphrase so that the SFTP endpoint can do private key verification.";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_PASSPHRASE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_URI_CONF = "camel.kamelet.sftp-source.privateKeyUri";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_URI_DOC = "Set the private key file (loaded from classpath by default) so that the SFTP endpoint can do private key verification.";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_STRICT_HOST_KEY_CHECKING_CONF = "camel.kamelet.sftp-source.strictHostKeyChecking";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_STRICT_HOST_KEY_CHECKING_DOC = "Sets whether to use strict host key checking.";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_STRICT_HOST_KEY_CHECKING_DEFAULT = "false";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_USE_USER_KNOWN_HOSTS_FILE_CONF = "camel.kamelet.sftp-source.useUserKnownHostsFile";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_USE_USER_KNOWN_HOSTS_FILE_DOC = "If knownHostFile has not been explicit configured then use the host file from System.getProperty(user.home)/.ssh/known_hosts.";
    public static final Boolean CAMEL_SOURCE_SFTPSOURCE_KAMELET_USE_USER_KNOWN_HOSTS_FILE_DEFAULT = true;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_AUTO_CREATE_CONF = "camel.kamelet.sftp-source.autoCreate";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_AUTO_CREATE_DOC = "Automatically create starting directory.";
    public static final Boolean CAMEL_SOURCE_SFTPSOURCE_KAMELET_AUTO_CREATE_DEFAULT = true;
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_DELETE_CONF = "camel.kamelet.sftp-source.delete";
    public static final String CAMEL_SOURCE_SFTPSOURCE_KAMELET_DELETE_DOC = "If true, the file will be deleted after it is processed successfully.";
    public static final Boolean CAMEL_SOURCE_SFTPSOURCE_KAMELET_DELETE_DEFAULT = false;

    public CamelSftpsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSftpsourceSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_HOST_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SFTPSOURCE_KAMELET_CONNECTION_PORT_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SFTPSOURCE_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_DIRECTORY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SFTPSOURCE_KAMELET_DIRECTORY_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SFTPSOURCE_KAMELET_DIRECTORY_NAME_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSIVE_MODE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSIVE_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PASSIVE_MODE_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_RECURSIVE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SFTPSOURCE_KAMELET_RECURSIVE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_RECURSIVE_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_IDEMPOTENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SFTPSOURCE_KAMELET_IDEMPOTENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_IDEMPOTENT_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_IGNORE_FILE_NOT_FOUND_OR_PERMISSION_ERROR_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SFTPSOURCE_KAMELET_IGNORE_FILE_NOT_FOUND_OR_PERMISSION_ERROR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_IGNORE_FILE_NOT_FOUND_OR_PERMISSION_ERROR_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_BINARY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SFTPSOURCE_KAMELET_BINARY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_BINARY_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_FILE_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_PASSPHRASE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_PASSPHRASE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_PASSPHRASE_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_PRIVATE_KEY_URI_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_STRICT_HOST_KEY_CHECKING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SFTPSOURCE_KAMELET_STRICT_HOST_KEY_CHECKING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_STRICT_HOST_KEY_CHECKING_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_USE_USER_KNOWN_HOSTS_FILE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SFTPSOURCE_KAMELET_USE_USER_KNOWN_HOSTS_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_USE_USER_KNOWN_HOSTS_FILE_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_AUTO_CREATE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SFTPSOURCE_KAMELET_AUTO_CREATE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_AUTO_CREATE_DOC);
        conf.define(CAMEL_SOURCE_SFTPSOURCE_KAMELET_DELETE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SFTPSOURCE_KAMELET_DELETE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SFTPSOURCE_KAMELET_DELETE_DOC);
        return conf;
    }
}