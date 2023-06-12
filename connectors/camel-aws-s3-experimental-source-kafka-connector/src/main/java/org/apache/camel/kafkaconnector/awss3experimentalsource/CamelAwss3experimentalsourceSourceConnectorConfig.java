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
package org.apache.camel.kafkaconnector.awss3experimentalsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwss3experimentalsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_BUCKET_NAME_OR_ARN_CONF = "camel.kamelet.aws-s3-experimental-source.bucketNameOrArn";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_BUCKET_NAME_OR_ARN_DOC = "The S3 Bucket name or Amazon Resource Name (ARN).";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_BUCKET_NAME_OR_ARN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELETE_AFTER_READ_CONF = "camel.kamelet.aws-s3-experimental-source.deleteAfterRead";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELETE_AFTER_READ_DOC = "Specifies to delete objects after consuming them.";
    public static final Boolean CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELETE_AFTER_READ_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_ACCESS_KEY_CONF = "camel.kamelet.aws-s3-experimental-source.accessKey";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_ACCESS_KEY_DOC = "The access key obtained from AWS.";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_SECRET_KEY_CONF = "camel.kamelet.aws-s3-experimental-source.secretKey";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_SECRET_KEY_DOC = "The secret key obtained from AWS.";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_REGION_CONF = "camel.kamelet.aws-s3-experimental-source.region";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_REGION_DOC = "The AWS region to access.";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_REGION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_AUTO_CREATE_BUCKET_CONF = "camel.kamelet.aws-s3-experimental-source.autoCreateBucket";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_AUTO_CREATE_BUCKET_DOC = "Specifies to automatically create the S3 bucket.";
    public static final Boolean CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_AUTO_CREATE_BUCKET_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_INCLUDE_BODY_CONF = "camel.kamelet.aws-s3-experimental-source.includeBody";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_INCLUDE_BODY_DOC = "If true, the exchange is consumed and put into the body and closed. If false, the S3Object stream is put raw into the body and the headers are set with the S3 object metadata.";
    public static final Boolean CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_INCLUDE_BODY_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_PREFIX_CONF = "camel.kamelet.aws-s3-experimental-source.prefix";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_PREFIX_DOC = "The AWS S3 bucket prefix to consider while searching. Example: folder/";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_PREFIX_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_IGNORE_BODY_CONF = "camel.kamelet.aws-s3-experimental-source.ignoreBody";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_IGNORE_BODY_DOC = "If true, the S3 Object body is ignored. Setting this to true overrides any behavior defined by the `includeBody` option. If false, the S3 object is put in the body.";
    public static final Boolean CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_IGNORE_BODY_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF = "camel.kamelet.aws-s3-experimental-source.useDefaultCredentialsProvider";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC = "If true, the S3 client loads credentials through a default credentials provider. If false, it uses the basic authentication method (access key and secret key).";
    public static final Boolean CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_URI_ENDPOINT_OVERRIDE_CONF = "camel.kamelet.aws-s3-experimental-source.uriEndpointOverride";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_URI_ENDPOINT_OVERRIDE_DOC = "The overriding endpoint URI. To use this option, you must also select the `overrideEndpoint` option.";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_URI_ENDPOINT_OVERRIDE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OVERRIDE_ENDPOINT_CONF = "camel.kamelet.aws-s3-experimental-source.overrideEndpoint";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OVERRIDE_ENDPOINT_DOC = "Select this option to override the endpoint URI. To use this option, you must also provide a URI for the `uriEndpointOverride` option.";
    public static final Boolean CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OVERRIDE_ENDPOINT_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELAY_CONF = "camel.kamelet.aws-s3-experimental-source.delay";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELAY_DOC = "The number of milliseconds before the next poll of the selected bucket.";
    public static final Integer CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELAY_DEFAULT = 500;
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OUTPUT_FORMAT_CONF = "camel.kamelet.aws-s3-experimental-source.outputFormat";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OUTPUT_FORMAT_DOC = "Choose the output type for this Kamelet. The Kamelet supports different output types and performs automatic message conversion according to this data type. Example: binary";
    public static final String CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OUTPUT_FORMAT_DEFAULT = "binary";

    public CamelAwss3experimentalsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwss3experimentalsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_BUCKET_NAME_OR_ARN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_BUCKET_NAME_OR_ARN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_BUCKET_NAME_OR_ARN_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELETE_AFTER_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELETE_AFTER_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELETE_AFTER_READ_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_SECRET_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_REGION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_REGION_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_AUTO_CREATE_BUCKET_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_INCLUDE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_INCLUDE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_INCLUDE_BODY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_PREFIX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_PREFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_PREFIX_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_IGNORE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_IGNORE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_IGNORE_BODY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_USE_DEFAULT_CREDENTIALS_PROVIDER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_USE_DEFAULT_CREDENTIALS_PROVIDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_USE_DEFAULT_CREDENTIALS_PROVIDER_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_URI_ENDPOINT_OVERRIDE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_URI_ENDPOINT_OVERRIDE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_URI_ENDPOINT_OVERRIDE_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OVERRIDE_ENDPOINT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OVERRIDE_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OVERRIDE_ENDPOINT_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_DELAY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OUTPUT_FORMAT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OUTPUT_FORMAT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3EXPERIMENTALSOURCE_KAMELET_OUTPUT_FORMAT_DOC);
        return conf;
    }
}