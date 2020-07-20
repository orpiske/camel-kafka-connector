package org.apache.camel.kafkaconnector.cli.bootstrap;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;


public class HTTPEasy {
    public static WebClient getClient(final String requestUrl) {
        WebClient webClient = WebClient.create(requestUrl);

        webClient
                .type(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE);

        return webClient;
    }
}
