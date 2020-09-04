package org.apache.camel.kafkaconnector.rabbitmq.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RabbitMQServiceFactory {
    private static final Logger LOG = LoggerFactory.getLogger(RabbitMQServiceFactory.class);

    public static RabbitMQService createService() {
        String instanceType = System.getProperty("rabbitmq.instance.type");

        if (instanceType == null || instanceType.equals("local-rabbitmq-container")) {
            return new RabbitMQLocalContainerService();
        }

        if (instanceType.equals("remote")) {
            return new RabbitMQRemoteService();
        }

        LOG.error("rabbit-mq instance must be one of 'local-rabbitmq-container' or 'remote");
        throw new UnsupportedOperationException(String.format("Invalid rabbitmq instance type: %s", instanceType));

        }
}
