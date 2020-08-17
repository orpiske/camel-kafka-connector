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

package org.apache.camel.kafkaconnector.syslog.source;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.syslog.SyslogDataFormat;
import org.apache.camel.component.syslog.netty.Rfc5425Encoder;
import org.apache.camel.kafkaconnector.common.services.camel.CamelContextConfigurator;
import org.apache.camel.kafkaconnector.common.utils.NetworkUtils;
import org.apache.camel.model.ModelCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SyslogTestConfiguratorCamel implements CamelContextConfigurator {
    private static final Logger LOG = LoggerFactory.getLogger(SyslogTestConfiguratorCamel.class);

    private static final String PROTOCOL = "udp";
    private static final String HOST = "localhost";
    private static int port =  NetworkUtils.getFreePort(HOST, NetworkUtils.Protocol.UDP);

    @Override
    public void configureContext(ModelCamelContext camelContext) throws Exception {
        String routeUrl = "netty:" + PROTOCOL + "://" + HOST + ":" + port + "?sync=false&encoders=#encoder&useByteBuf=true";
        LOG.info("Configuring route: {}", routeUrl);

        camelContext.getRegistry().bind("encoder", new Rfc5425Encoder());
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:test").marshal(new SyslogDataFormat()).to(routeUrl);
            }
        });
    }

    public int getPort() {
        return port;
    }

    public String getProtocol() {
        return PROTOCOL;
    }

    public String getHost() {
        return HOST;
    }
}