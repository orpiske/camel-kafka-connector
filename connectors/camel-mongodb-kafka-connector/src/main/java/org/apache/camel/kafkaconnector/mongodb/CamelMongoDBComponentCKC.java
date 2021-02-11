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

package org.apache.camel.kafkaconnector.mongodb;

import com.mongodb.client.MongoClient;
import org.apache.camel.CamelContext;
import org.apache.camel.component.mongodb.MongoDbComponent;
import org.apache.camel.spi.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CamelMongoDBComponentCKC extends MongoDbComponent {
    private static final Logger LOG = LoggerFactory.getLogger(CamelMongoDBComponentCKC.class);

    @Metadata(autowired = true)
    private MongoClient mongoConnection;

    public CamelMongoDBComponentCKC() {
        LOG.warn("Using the work-around component");
        if (mongoConnection != null && super.getMongoConnection() != null) {
            super.setMongoConnection(mongoConnection);
        }
    }

    public CamelMongoDBComponentCKC(CamelContext context) {
        super(context);
        LOG.warn("Using the work-around component (2)");

        if (mongoConnection != null && super.getMongoConnection() != null) {
            super.setMongoConnection(mongoConnection);
        }
    }
}
