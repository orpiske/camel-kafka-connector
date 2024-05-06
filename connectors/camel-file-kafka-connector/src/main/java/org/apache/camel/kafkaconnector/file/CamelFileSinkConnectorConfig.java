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
package org.apache.camel.kafkaconnector.file;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelFileSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_FILE_PATH_DIRECTORY_NAME_CONF = "camel.sink.path.directoryName";
    public static final String CAMEL_SINK_FILE_PATH_DIRECTORY_NAME_DOC = "The starting directory";
    public static final String CAMEL_SINK_FILE_PATH_DIRECTORY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHARSET_CONF = "camel.sink.endpoint.charset";
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHARSET_DOC = "This option is used to specify the encoding of the file. You can use this on the consumer, to specify the encodings of the files, which allow Camel to know the charset it should load the file content in case the file content is being accessed. Likewise when writing a file, you can use this option to specify which charset to write the file as well. Do mind that when writing the file Camel may have to read the message content into memory to be able to convert the data into the configured charset, so do not use this if you have big messages.";
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHARSET_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_DONE_FILE_NAME_CONF = "camel.sink.endpoint.doneFileName";
    public static final String CAMEL_SINK_FILE_ENDPOINT_DONE_FILE_NAME_DOC = "Producer: If provided, then Camel will write a 2nd done file when the original file has been written. The done file will be empty. This option configures what file name to use. Either you can specify a fixed name. Or you can use dynamic placeholders. The done file will always be written in the same folder as the original file. Consumer: If provided, Camel will only consume files if a done file exists. This option configures what file name to use. Either you can specify a fixed name. Or you can use dynamic placeholders.The done file is always expected in the same folder as the original file. Only ${file.name} and ${file.name.next} is supported as dynamic placeholders.";
    public static final String CAMEL_SINK_FILE_ENDPOINT_DONE_FILE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_FILE_NAME_CONF = "camel.sink.endpoint.fileName";
    public static final String CAMEL_SINK_FILE_ENDPOINT_FILE_NAME_DOC = "Use Expression such as File Language to dynamically set the filename. For consumers, it's used as a filename filter. For producers, it's used to evaluate the filename to write. If an expression is set, it take precedence over the CamelFileName header. (Note: The header itself can also be an Expression). The expression options support both String and Expression types. If the expression is a String type, it is always evaluated using the File Language. If the expression is an Expression type, the specified Expression type is used - this allows you, for instance, to use OGNL expressions. For the consumer, you can use it to filter filenames, so you can for instance consume today's file using the File Language syntax: mydata-${date:now:yyyyMMdd}.txt. The producers support the CamelOverruleFileName header which takes precedence over any existing CamelFileName header; the CamelOverruleFileName is a header that is used only once, and makes it easier as this avoids to temporary store CamelFileName and have to restore it afterwards.";
    public static final String CAMEL_SINK_FILE_ENDPOINT_FILE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_APPEND_CHARS_CONF = "camel.sink.endpoint.appendChars";
    public static final String CAMEL_SINK_FILE_ENDPOINT_APPEND_CHARS_DOC = "Used to append characters (text) after writing files. This can for example be used to add new lines or other separators when writing and appending new files or existing files. To specify new-line (slash-n or slash-r) or tab (slash-t) characters then escape with an extra slash, eg slash-slash-n.";
    public static final String CAMEL_SINK_FILE_ENDPOINT_APPEND_CHARS_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHECKSUM_FILE_ALGORITHM_CONF = "camel.sink.endpoint.checksumFileAlgorithm";
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHECKSUM_FILE_ALGORITHM_DOC = "If provided, then Camel will write a checksum file when the original file has been written. The checksum file will contain the checksum created with the provided algorithm for the original file. The checksum file will always be written in the same folder as the original file. One of: [MD2] [MD5] [SHA_1] [SHA_224] [SHA_256] [SHA_384] [SHA_512] [SHA_512_224] [SHA_512_256] [SHA3_224] [SHA3_256] [SHA3_384] [SHA3_512]";
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHECKSUM_FILE_ALGORITHM_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_FILE_EXIST_CONF = "camel.sink.endpoint.fileExist";
    public static final String CAMEL_SINK_FILE_ENDPOINT_FILE_EXIST_DOC = "What to do if a file already exists with the same name. Override, which is the default, replaces the existing file. - Append - adds content to the existing file. - Fail - throws a GenericFileOperationException, indicating that there is already an existing file. - Ignore - silently ignores the problem and does not override the existing file, but assumes everything is okay. - Move - option requires to use the moveExisting option to be configured as well. The option eagerDeleteTargetFile can be used to control what to do if an moving the file, and there exists already an existing file, otherwise causing the move operation to fail. The Move option will move any existing files, before writing the target file. - TryRename is only applicable if tempFileName option is in use. This allows to try renaming the file from the temporary name to the actual name, without doing any exists check. This check may be faster on some file systems and especially FTP servers. One of: [Override] [Append] [Fail] [Ignore] [Move] [TryRename]";
    public static final String CAMEL_SINK_FILE_ENDPOINT_FILE_EXIST_DEFAULT = "Override";
    public static final String CAMEL_SINK_FILE_ENDPOINT_FLATTEN_CONF = "camel.sink.endpoint.flatten";
    public static final String CAMEL_SINK_FILE_ENDPOINT_FLATTEN_DOC = "Flatten is used to flatten the file name path to strip any leading paths, so it's just the file name. This allows you to consume recursively into sub-directories, but when you eg write the files to another directory they will be written in a single directory. Setting this to true on the producer enforces that any file name in CamelFileName header will be stripped for any leading paths.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_FLATTEN_DEFAULT = false;
    public static final String CAMEL_SINK_FILE_ENDPOINT_JAIL_STARTING_DIRECTORY_CONF = "camel.sink.endpoint.jailStartingDirectory";
    public static final String CAMEL_SINK_FILE_ENDPOINT_JAIL_STARTING_DIRECTORY_DOC = "Used for jailing (restricting) writing files to the starting directory (and sub) only. This is enabled by default to not allow Camel to write files to outside directories (to be more secured out of the box). You can turn this off to allow writing files to directories outside the starting directory, such as parent or root folders.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_JAIL_STARTING_DIRECTORY_DEFAULT = true;
    public static final String CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_CONF = "camel.sink.endpoint.moveExisting";
    public static final String CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_DOC = "Expression (such as File Language) used to compute file name to use when fileExist=Move is configured. To move files into a backup subdirectory just enter backup. This option only supports the following File Language tokens: file:name, file:name.ext, file:name.noext, file:onlyname, file:onlyname.noext, file:ext, and file:parent. Notice the file:parent is not supported by the FTP component, as the FTP component can only move any existing files to a relative directory based on current dir as base.";
    public static final String CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_TEMP_FILE_NAME_CONF = "camel.sink.endpoint.tempFileName";
    public static final String CAMEL_SINK_FILE_ENDPOINT_TEMP_FILE_NAME_DOC = "The same as tempPrefix option but offering a more fine grained control on the naming of the temporary filename as it uses the File Language. The location for tempFilename is relative to the final file location in the option 'fileName', not the target directory in the base uri. For example if option fileName includes a directory prefix: dir/finalFilename then tempFileName is relative to that subdirectory dir.";
    public static final String CAMEL_SINK_FILE_ENDPOINT_TEMP_FILE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_TEMP_PREFIX_CONF = "camel.sink.endpoint.tempPrefix";
    public static final String CAMEL_SINK_FILE_ENDPOINT_TEMP_PREFIX_DOC = "This option is used to write the file using a temporary name and then, after the write is complete, rename it to the real name. Can be used to identify files being written and also avoid consumers (not using exclusive read locks) reading in progress files. Is often used by FTP when uploading big files.";
    public static final String CAMEL_SINK_FILE_ENDPOINT_TEMP_PREFIX_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_ALLOW_NULL_BODY_CONF = "camel.sink.endpoint.allowNullBody";
    public static final String CAMEL_SINK_FILE_ENDPOINT_ALLOW_NULL_BODY_DOC = "Used to specify if a null body is allowed during file writing. If set to true then an empty file will be created, when set to false, and attempting to send a null body to the file component, a GenericFileWriteException of 'Cannot write null body to file.' will be thrown. If the fileExist option is set to 'Override', then the file will be truncated, and if set to append the file will remain unchanged.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_ALLOW_NULL_BODY_DEFAULT = false;
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHMOD_CONF = "camel.sink.endpoint.chmod";
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHMOD_DOC = "Specify the file permissions which is sent by the producer, the chmod value must be between 000 and 777; If there is a leading digit like in 0755 we will ignore it.";
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHMOD_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHMOD_DIRECTORY_CONF = "camel.sink.endpoint.chmodDirectory";
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHMOD_DIRECTORY_DOC = "Specify the directory permissions used when the producer creates missing directories, the chmod value must be between 000 and 777; If there is a leading digit like in 0755 we will ignore it.";
    public static final String CAMEL_SINK_FILE_ENDPOINT_CHMOD_DIRECTORY_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_EAGER_DELETE_TARGET_FILE_CONF = "camel.sink.endpoint.eagerDeleteTargetFile";
    public static final String CAMEL_SINK_FILE_ENDPOINT_EAGER_DELETE_TARGET_FILE_DOC = "Whether or not to eagerly delete any existing target file. This option only applies when you use fileExists=Override and the tempFileName option as well. You can use this to disable (set it to false) deleting the target file before the temp file is written. For example you may write big files and want the target file to exists during the temp file is being written. This ensure the target file is only deleted until the very last moment, just before the temp file is being renamed to the target filename. This option is also used to control whether to delete any existing files when fileExist=Move is enabled, and an existing file exists. If this option copyAndDeleteOnRenameFails false, then an exception will be thrown if an existing file existed, if its true, then the existing file is deleted before the move operation.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_EAGER_DELETE_TARGET_FILE_DEFAULT = true;
    public static final String CAMEL_SINK_FILE_ENDPOINT_FORCE_WRITES_CONF = "camel.sink.endpoint.forceWrites";
    public static final String CAMEL_SINK_FILE_ENDPOINT_FORCE_WRITES_DOC = "Whether to force syncing writes to the file system. You can turn this off if you do not want this level of guarantee, for example if writing to logs / audit logs etc; this would yield better performance.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_FORCE_WRITES_DEFAULT = true;
    public static final String CAMEL_SINK_FILE_ENDPOINT_KEEP_LAST_MODIFIED_CONF = "camel.sink.endpoint.keepLastModified";
    public static final String CAMEL_SINK_FILE_ENDPOINT_KEEP_LAST_MODIFIED_DOC = "Will keep the last modified timestamp from the source file (if any). Will use the FileConstants.FILE_LAST_MODIFIED header to located the timestamp. This header can contain either a java.util.Date or long with the timestamp. If the timestamp exists and the option is enabled it will set this timestamp on the written file. Note: This option only applies to the file producer. You cannot use this option with any of the ftp producers.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_KEEP_LAST_MODIFIED_DEFAULT = false;
    public static final String CAMEL_SINK_FILE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_FILE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_FILE_STRATEGY_CONF = "camel.sink.endpoint.moveExistingFileStrategy";
    public static final String CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_FILE_STRATEGY_DOC = "Strategy (Custom Strategy) used to move file with special naming token to use when fileExist=Move is configured. By default, there is an implementation used if no custom strategy is provided";
    public static final String CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_FILE_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SINK_FILE_ENDPOINT_AUTO_CREATE_CONF = "camel.sink.endpoint.autoCreate";
    public static final String CAMEL_SINK_FILE_ENDPOINT_AUTO_CREATE_DOC = "Automatically create missing directories in the file's pathname. For the file consumer, that means creating the starting directory. For the file producer, it means the directory the files should be written to.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_AUTO_CREATE_DEFAULT = true;
    public static final String CAMEL_SINK_FILE_ENDPOINT_BUFFER_SIZE_CONF = "camel.sink.endpoint.bufferSize";
    public static final String CAMEL_SINK_FILE_ENDPOINT_BUFFER_SIZE_DOC = "Buffer size in bytes used for writing files (or in case of FTP for downloading and uploading files).";
    public static final Integer CAMEL_SINK_FILE_ENDPOINT_BUFFER_SIZE_DEFAULT = 131072;
    public static final String CAMEL_SINK_FILE_ENDPOINT_COPY_AND_DELETE_ON_RENAME_FAIL_CONF = "camel.sink.endpoint.copyAndDeleteOnRenameFail";
    public static final String CAMEL_SINK_FILE_ENDPOINT_COPY_AND_DELETE_ON_RENAME_FAIL_DOC = "Whether to fallback and do a copy and delete file, in case the file could not be renamed directly. This option is not available for the FTP component.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_COPY_AND_DELETE_ON_RENAME_FAIL_DEFAULT = true;
    public static final String CAMEL_SINK_FILE_ENDPOINT_RENAME_USING_COPY_CONF = "camel.sink.endpoint.renameUsingCopy";
    public static final String CAMEL_SINK_FILE_ENDPOINT_RENAME_USING_COPY_DOC = "Perform rename operations using a copy and delete strategy. This is primarily used in environments where the regular rename operation is unreliable (e.g. across different file systems or networks). This option takes precedence over the copyAndDeleteOnRenameFail parameter that will automatically fall back to the copy and delete strategy, but only after additional delays.";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_RENAME_USING_COPY_DEFAULT = false;
    public static final String CAMEL_SINK_FILE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_FILE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used";
    public static final Boolean CAMEL_SINK_FILE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_FILE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.file.lazyStartProducer";
    public static final String CAMEL_SINK_FILE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_FILE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_FILE_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.file.autowiredEnabled";
    public static final String CAMEL_SINK_FILE_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_FILE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_CONF = "camel.component.file.healthCheckConsumerEnabled";
    public static final String CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DOC = "Used for enabling or disabling all consumer based health checks from this component";
    public static final Boolean CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_CONF = "camel.component.file.healthCheckProducerEnabled";
    public static final String CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DOC = "Used for enabling or disabling all producer based health checks from this component. Notice: Camel has by default disabled all producer based health-checks. You can turn on producer checks globally by setting camel.health.producersEnabled=true.";
    public static final Boolean CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DEFAULT = true;

    public CamelFileSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelFileSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_FILE_PATH_DIRECTORY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_PATH_DIRECTORY_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_FILE_PATH_DIRECTORY_NAME_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_CHARSET_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_CHARSET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_CHARSET_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_DONE_FILE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_DONE_FILE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_DONE_FILE_NAME_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_FILE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_FILE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_FILE_NAME_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_APPEND_CHARS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_APPEND_CHARS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_APPEND_CHARS_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_CHECKSUM_FILE_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_CHECKSUM_FILE_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_CHECKSUM_FILE_ALGORITHM_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_FILE_EXIST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_FILE_EXIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_FILE_EXIST_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_FLATTEN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_FLATTEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_FLATTEN_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_JAIL_STARTING_DIRECTORY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_JAIL_STARTING_DIRECTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_JAIL_STARTING_DIRECTORY_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_TEMP_FILE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_TEMP_FILE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_TEMP_FILE_NAME_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_TEMP_PREFIX_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_TEMP_PREFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_TEMP_PREFIX_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_ALLOW_NULL_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_ALLOW_NULL_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_ALLOW_NULL_BODY_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_CHMOD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_CHMOD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_CHMOD_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_CHMOD_DIRECTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_CHMOD_DIRECTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_CHMOD_DIRECTORY_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_EAGER_DELETE_TARGET_FILE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_EAGER_DELETE_TARGET_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_EAGER_DELETE_TARGET_FILE_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_FORCE_WRITES_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_FORCE_WRITES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_FORCE_WRITES_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_KEEP_LAST_MODIFIED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_KEEP_LAST_MODIFIED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_KEEP_LAST_MODIFIED_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_FILE_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_FILE_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_MOVE_EXISTING_FILE_STRATEGY_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_AUTO_CREATE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_AUTO_CREATE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_AUTO_CREATE_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_BUFFER_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_FILE_ENDPOINT_BUFFER_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_BUFFER_SIZE_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_COPY_AND_DELETE_ON_RENAME_FAIL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_COPY_AND_DELETE_ON_RENAME_FAIL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_COPY_AND_DELETE_ON_RENAME_FAIL_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_RENAME_USING_COPY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_RENAME_USING_COPY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_RENAME_USING_COPY_DOC);
        conf.define(CAMEL_SINK_FILE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_FILE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_FILE_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_CONSUMER_ENABLED_DOC);
        conf.define(CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_FILE_COMPONENT_HEALTH_CHECK_PRODUCER_ENABLED_DOC);
        return conf;
    }
}