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
package org.apache.camel.kafkaconnector.box;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelBoxSourceConnectorConfig extends CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_BOX_PATH_API_NAME_CONF = "camel.source.path.apiName";
    public static final String CAMEL_SOURCE_BOX_PATH_API_NAME_DOC = "What kind of operation to perform One of: [COLLABORATIONS] [COMMENTS] [EVENT_LOGS] [FILES] [FOLDERS] [GROUPS] [EVENTS] [SEARCH] [TASKS] [USERS]";
    public static final String CAMEL_SOURCE_BOX_PATH_API_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_PATH_METHOD_NAME_CONF = "camel.source.path.methodName";
    public static final String CAMEL_SOURCE_BOX_PATH_METHOD_NAME_DOC = "What sub operation to use for the selected operation";
    public static final String CAMEL_SOURCE_BOX_PATH_METHOD_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_ID_CONF = "camel.source.endpoint.clientId";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_ID_DOC = "Box application client ID";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_ENTERPRISE_ID_CONF = "camel.source.endpoint.enterpriseId";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_ENTERPRISE_ID_DOC = "The enterprise ID to use for an App Enterprise.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_ENTERPRISE_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_IN_BODY_CONF = "camel.source.endpoint.inBody";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_IN_BODY_DOC = "Sets the name of a parameter to be passed in the exchange In Body";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_IN_BODY_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USER_ID_CONF = "camel.source.endpoint.userId";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USER_ID_DOC = "The user ID to use for an App User.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USER_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_BOX_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_BOX_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_HTTP_PARAMS_CONF = "camel.source.endpoint.httpParams";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_HTTP_PARAMS_DOC = "Custom HTTP params for settings like proxy host";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_HTTP_PARAMS_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_BOX_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_CONF = "camel.source.endpoint.accessTokenCache";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_DOC = "Custom Access Token Cache for storing and retrieving access tokens.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_DELAY_DOC = "Milliseconds before the next poll. You can also specify time values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30 seconds), and 1h (1 hour).";
    public static final Long CAMEL_SOURCE_BOX_ENDPOINT_DELAY_DEFAULT = 500L;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_BOX_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_BOX_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component One of: [none] [spring] [quartz]";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_BOX_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_SECRET_CONF = "camel.source.endpoint.clientSecret";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_SECRET_DOC = "Box application client secret";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_CONF = "camel.source.endpoint.encryptionAlgorithm";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_DOC = "The type of encryption algorithm for JWT. Supported Algorithms: RSA_SHA_256 RSA_SHA_384 RSA_SHA_512 One of: [RSA_SHA_256] [RSA_SHA_384] [RSA_SHA_512]";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_DEFAULT = "RSA_SHA_256";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_MAX_CACHE_ENTRIES_CONF = "camel.source.endpoint.maxCacheEntries";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_MAX_CACHE_ENTRIES_DOC = "The maximum number of access tokens in cache.";
    public static final Integer CAMEL_SOURCE_BOX_ENDPOINT_MAX_CACHE_ENTRIES_DEFAULT = 100;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_AUTHENTICATION_TYPE_CONF = "camel.source.endpoint.authenticationType";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_AUTHENTICATION_TYPE_DOC = "The type of authentication for connection. Types of Authentication: STANDARD_AUTHENTICATION - OAuth 2.0 (3-legged) SERVER_AUTHENTICATION - OAuth 2.0 with JSON Web Tokens";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_AUTHENTICATION_TYPE_DEFAULT = "APP_USER_AUTHENTICATION";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts. You can also specify time values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30 seconds), and 1h (1 hour).";
    public static final Long CAMEL_SOURCE_BOX_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_BOX_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_FILE_CONF = "camel.source.endpoint.privateKeyFile";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_FILE_DOC = "The private key for generating the JWT signature.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_FILE_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_CONF = "camel.source.endpoint.privateKeyPassword";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_DOC = "The password for the private key.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_PUBLIC_KEY_ID_CONF = "camel.source.endpoint.publicKeyId";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_PUBLIC_KEY_ID_DOC = "The ID for public key for validating the JWT signature.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_PUBLIC_KEY_ID_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.source.endpoint.sslContextParameters";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters.";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USER_NAME_CONF = "camel.source.endpoint.userName";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USER_NAME_DOC = "Box user name, MUST be provided";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USER_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USER_PASSWORD_CONF = "camel.source.endpoint.userPassword";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USER_PASSWORD_DOC = "Box user password, MUST be provided if authSecureStorage is not set, or returns null on first call";
    public static final String CAMEL_SOURCE_BOX_ENDPOINT_USER_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_COMPONENT_CONFIGURATION_CONF = "camel.component.box.configuration";
    public static final String CAMEL_SOURCE_BOX_COMPONENT_CONFIGURATION_DOC = "To use the shared configuration";
    public static final String CAMEL_SOURCE_BOX_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_BOX_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.box.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_BOX_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_BOX_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_BOX_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.box.basicPropertyBinding";
    public static final String CAMEL_SOURCE_BOX_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_BOX_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelBoxSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelBoxSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_BOX_PATH_API_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_PATH_API_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_BOX_PATH_API_NAME_DOC);
        conf.define(CAMEL_SOURCE_BOX_PATH_METHOD_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_PATH_METHOD_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_BOX_PATH_METHOD_NAME_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_ID_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_ENTERPRISE_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_ENTERPRISE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_ENTERPRISE_ID_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_IN_BODY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_IN_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_IN_BODY_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_USER_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_USER_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_USER_ID_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_BOX_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_BOX_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_HTTP_PARAMS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_HTTP_PARAMS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_HTTP_PARAMS_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_BOX_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_ACCESS_TOKEN_CACHE_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_BOX_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_BOX_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_BOX_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_BOX_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_CLIENT_SECRET_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_ENCRYPTION_ALGORITHM_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_MAX_CACHE_ENTRIES_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_BOX_ENDPOINT_MAX_CACHE_ENTRIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_MAX_CACHE_ENTRIES_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_AUTHENTICATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_AUTHENTICATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_AUTHENTICATION_TYPE_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_BOX_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_BOX_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_FILE_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_PRIVATE_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_PUBLIC_KEY_ID_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_PUBLIC_KEY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_PUBLIC_KEY_ID_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_USER_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_USER_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_USER_NAME_DOC);
        conf.define(CAMEL_SOURCE_BOX_ENDPOINT_USER_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_ENDPOINT_USER_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_ENDPOINT_USER_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_BOX_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_BOX_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_BOX_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_BOX_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_BOX_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_BOX_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BOX_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}