/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.kafkaconnector.services.kafkaconnect;

import org.apache.camel.kafkaconnector.services.kafka.KafkaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KafkaConnectRunnerFactory {
    private static final Logger LOG = LoggerFactory.getLogger(KafkaConnectRunnerFactory.class);

    private KafkaConnectRunnerFactory() {
    }

    public static KafkaConnectService createService(KafkaService kafkaService) {
        String kafkaRemote = System.getProperty("kafka-connect.instance.type");

        if (kafkaRemote == null || kafkaRemote.equals("legacy-kafka-connect")) {
            return new KafkaConnectRunnerService(kafkaService);
        }


        if (kafkaRemote.equals("kafka-native")) {
            return new KafkaConnectEmbedded();
        }

        LOG.error("Invalid Kafka Connect type. Instance must be one of 'legacy-kafka-connect' or 'kafka-native'");
        throw new UnsupportedOperationException("Invalid Kafka connect instance type:");
    }
}
