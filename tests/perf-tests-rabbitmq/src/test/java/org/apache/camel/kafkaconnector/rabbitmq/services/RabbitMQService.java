package org.apache.camel.kafkaconnector.rabbitmq.services;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public interface RabbitMQService extends BeforeAllCallback, AfterAllCallback {


    /**
     * The connection properties for the service
     * @return
     */
    ConnectionProperties connectionProperties();


    /**
     * Perform any initialization necessary
     */
    void initialize();

    /**
     * Shuts down the service after the test has completed
     */
    void shutdown();


    @Override
    default void afterAll(ExtensionContext extensionContext) throws Exception {
        shutdown();
    }

    @Override
    default void beforeAll(ExtensionContext extensionContext) throws Exception {
        initialize();
    }
}
