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
package org.apache.camel.kafkaconnector.reactivestreams;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelReactivestreamsSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_REACTIVESTREAMS_PATH_STREAM_CONF = "camel.source.path.stream";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_PATH_STREAM_DOC = "Name of the stream channel used by the endpoint to exchange messages.";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_PATH_STREAM_DEFAULT = null;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_CONCURRENT_CONSUMERS_CONF = "camel.source.endpoint.concurrentConsumers";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_CONCURRENT_CONSUMERS_DOC = "Number of threads used to process exchanges in the Camel route.";
    public static final Integer CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_CONCURRENT_CONSUMERS_DEFAULT = 1;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGES_REFILL_LOW_WATERMARK_CONF = "camel.source.endpoint.exchangesRefillLowWatermark";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGES_REFILL_LOW_WATERMARK_DOC = "Set the low watermark of requested exchanges to the active subscription as percentage of the maxInflightExchanges. When the number of pending items from the upstream source is lower than the watermark, new items can be requested to the subscription. If set to 0, the subscriber will request items in batches of maxInflightExchanges, only after all items of the previous batch have been processed. If set to 1, the subscriber can request a new item each time an exchange is processed (chatty). Any intermediate value can be used.";
    public static final Double CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGES_REFILL_LOW_WATERMARK_DEFAULT = 0.25D;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_COMPLETE_CONF = "camel.source.endpoint.forwardOnComplete";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_COMPLETE_DOC = "Determines if onComplete events should be pushed to the Camel route.";
    public static final Boolean CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_COMPLETE_DEFAULT = false;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_ERROR_CONF = "camel.source.endpoint.forwardOnError";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_ERROR_DOC = "Determines if onError events should be pushed to the Camel route. Exceptions will be set as message body.";
    public static final Boolean CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_ERROR_DEFAULT = false;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_MAX_INFLIGHT_EXCHANGES_CONF = "camel.source.endpoint.maxInflightExchanges";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_MAX_INFLIGHT_EXCHANGES_DOC = "Maximum number of exchanges concurrently being processed by Camel. This parameter controls backpressure on the stream. Setting a non-positive value will disable backpressure.";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_MAX_INFLIGHT_EXCHANGES_DEFAULT = "128";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MAX_SIZE_CONF = "camel.component.reactive-streams.threadPoolMaxSize";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MAX_SIZE_DOC = "The maximum number of threads used by the reactive streams internal engine.";
    public static final Integer CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MAX_SIZE_DEFAULT = 10;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MIN_SIZE_CONF = "camel.component.reactive-streams.threadPoolMinSize";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MIN_SIZE_DOC = "The minimum number of threads used by the reactive streams internal engine.";
    public static final Integer CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MIN_SIZE_DEFAULT = null;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_NAME_CONF = "camel.component.reactive-streams.threadPoolName";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_NAME_DOC = "The name of the thread pool used by the reactive streams internal engine.";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_NAME_DEFAULT = "CamelReactiveStreamsWorker";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.reactive-streams.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.reactive-streams.autowiredEnabled";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_REACTIVE_STREAMS_ENGINE_CONFIGURATION_CONF = "camel.component.reactive-streams.reactiveStreamsEngineConfiguration";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_REACTIVE_STREAMS_ENGINE_CONFIGURATION_DOC = "To use an existing reactive stream engine configuration.";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_REACTIVE_STREAMS_ENGINE_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_CONF = "camel.component.reactive-streams.serviceType";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_DOC = "Set the type of the underlying reactive streams implementation to use. The implementation is looked up from the registry or using a ServiceLoader, the default implementation is DefaultCamelReactiveStreamsService";
    public static final String CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_DEFAULT = null;

    public CamelReactivestreamsSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelReactivestreamsSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_PATH_STREAM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_REACTIVESTREAMS_PATH_STREAM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_PATH_STREAM_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_CONCURRENT_CONSUMERS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_CONCURRENT_CONSUMERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_CONCURRENT_CONSUMERS_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGES_REFILL_LOW_WATERMARK_CONF, ConfigDef.Type.DOUBLE, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGES_REFILL_LOW_WATERMARK_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGES_REFILL_LOW_WATERMARK_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_COMPLETE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_COMPLETE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_COMPLETE_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_ERROR_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_ERROR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_FORWARD_ON_ERROR_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_MAX_INFLIGHT_EXCHANGES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_MAX_INFLIGHT_EXCHANGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_MAX_INFLIGHT_EXCHANGES_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MAX_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MAX_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MAX_SIZE_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MIN_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MIN_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_MIN_SIZE_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_THREAD_POOL_NAME_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_REACTIVE_STREAMS_ENGINE_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_REACTIVE_STREAMS_ENGINE_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_REACTIVE_STREAMS_ENGINE_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_REACTIVESTREAMS_COMPONENT_SERVICE_TYPE_DOC);
        return conf;
    }
}