package org.apache.camel.kafkaconnector.rabbitmq.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.containers.RabbitMQContainer;

public class RabbitMQLocalContainerService implements RabbitMQService {
    private static final Logger LOG = LoggerFactory.getLogger(RabbitMQLocalContainerService.class);

    private static final RabbitMQContainer container = new RabbitMQContainer("rabbitmq:3.8-management");

    @Override
    public ConnectionProperties connectionProperties() {
        return new ConnectionProperties() {
            @Override
            public String username() {
                return container.getAdminUsername();
            }

            @Override
            public String password() {
                return container.getAdminPassword();
            }

            @Override
            public String hostname() {
                return container.getHost();
            }

            @Override
            public int port() {
                return container.getAmqpPort();
            }
        };
    }

    public RabbitMQLocalContainerService() {
        container.start();
    }


    @Override
    public void initialize() {
        LOG.info("RabbitMQ container running on {}", container.getAmqpUrl());
    }

    @Override
    public void shutdown() {
        container.stop();
    }
}
