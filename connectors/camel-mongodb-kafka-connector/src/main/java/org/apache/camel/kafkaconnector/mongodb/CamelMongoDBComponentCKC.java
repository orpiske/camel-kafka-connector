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

import java.util.Map;

import com.mongodb.client.MongoClient;
import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.component.mongodb.MongoDbComponent;
import org.apache.camel.component.mongodb.MongoDbEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.BeanRepository;
import org.apache.camel.spi.PropertyConfigurer;
import org.apache.camel.support.CamelContextHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CamelMongoDBComponentCKC extends MongoDbComponent {
    private static final Logger LOG = LoggerFactory.getLogger(CamelMongoDBComponentCKC.class);

    private void overrideMongoConnection(CamelContext context) {
        LOG.warn("Using the work-around component");
        if (super.getMongoConnection() == null) {
            LOG.warn("Overriding the mongo connection!");

            MongoClient mongoConnection = CamelContextHelper.findByType(context, MongoClient.class);

            if (mongoConnection == null) {
                LOG.warn("Could not find a bean to override the mongo connection");
            }

            for (Endpoint eps : getCamelContext().getEndpoints()) {
                LOG.warn("EP -> {}", eps.toString());
            }
            super.setMongoConnection(mongoConnection);

        } else {
            LOG.warn("Overriding the mongo connection!");
        }
    }

    @Override
    public PropertyConfigurer getEndpointPropertyConfigurer() {
        LOG.warn("Creating the endpoint configurer");
        return super.getEndpointPropertyConfigurer();
    }

    @Override
    public PropertyConfigurer getComponentPropertyConfigurer() {
        LOG.warn("Creating the property configurer");
        PropertyConfigurer propertyConfigurer = super.getComponentPropertyConfigurer();

        overrideMongoConnection(getCamelContext());

        return propertyConfigurer;
    }
}
