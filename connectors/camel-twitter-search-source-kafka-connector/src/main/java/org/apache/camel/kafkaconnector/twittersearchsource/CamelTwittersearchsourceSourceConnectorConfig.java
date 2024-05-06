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
package org.apache.camel.kafkaconnector.twittersearchsource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelTwittersearchsourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_KEYWORDS_CONF = "camel.kamelet.twitter-search-source.keywords";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_KEYWORDS_DOC = "The keywords to use in the Twitter search (Supports Twitter standard operators) Example: Apache Camel";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_KEYWORDS_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_CONF = "camel.kamelet.twitter-search-source.apiKey";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_DOC = "The API Key from the Twitter application in the developer portal";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_SECRET_CONF = "camel.kamelet.twitter-search-source.apiKeySecret";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_SECRET_DOC = "The API Key Secret from the Twitter application in the developer portal";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_CONF = "camel.kamelet.twitter-search-source.accessToken";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_DOC = "The Access Token from the Twitter application in the developer portal";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_SECRET_CONF = "camel.kamelet.twitter-search-source.accessTokenSecret";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_SECRET_DOC = "The Access Token Secret from the Twitter application in the developer portal";
    public static final String CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_SECRET_DEFAULT = null;

    public CamelTwittersearchsourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelTwittersearchsourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_KEYWORDS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_KEYWORDS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_KEYWORDS_DOC);
        conf.define(CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_DOC);
        conf.define(CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_SECRET_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_API_KEY_SECRET_DOC);
        conf.define(CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_SECRET_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_TWITTERSEARCHSOURCE_KAMELET_ACCESS_TOKEN_SECRET_DOC);
        return conf;
    }
}