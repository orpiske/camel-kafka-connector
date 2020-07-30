package org.apache.camel.kafkaconnector.cli.bootstrap;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;


public class HTTPEasy {
    public static WebClient getClient(final String requestUrl) {
        WebClient webClient = WebClient
                .create(requestUrl);

        webClient
                .type(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE);

        return webClient;
    }

    public static WebClient getClient(final String requestUrl, Map<String, Object> properties) {
        WebClient webClient = WebClient
                .create(requestUrl, properties);

        webClient
                .type(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE);

        return webClient;
    }
}
