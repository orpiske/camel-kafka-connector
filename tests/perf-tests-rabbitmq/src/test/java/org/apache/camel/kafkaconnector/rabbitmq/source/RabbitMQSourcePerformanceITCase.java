package org.apache.camel.kafkaconnector.rabbitmq.source;

import java.time.Duration;
import java.util.concurrent.ExecutionException;

import org.apache.camel.kafkaconnector.common.AbstractKafkaTest;
import org.apache.camel.kafkaconnector.common.ConnectorPropertyFactory;
import org.apache.camel.kafkaconnector.common.utils.TestUtils;
import org.apache.camel.kafkaconnector.rabbitmq.services.RabbitMQService;
import org.apache.camel.kafkaconnector.rabbitmq.services.RabbitMQServiceFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@EnabledIfSystemProperty(named = "it.test.perf.enabled", matches = "true")
public class RabbitMQSourcePerformanceITCase extends AbstractKafkaTest {
    private static final Logger LOG = LoggerFactory.getLogger(RabbitMQSourcePerformanceITCase.class);

    @RegisterExtension
    public static RabbitMQService service = RabbitMQServiceFactory.createService();

    private static int duration;

    @Override
    protected String[] getConnectorsInTest() {
        return new String[] {"camel-rabbitmq-kafka-connector"};
    }

    @BeforeAll
    public static void setUpAll() {
        duration = Integer.parseInt(System.getProperty("rabbitmq.test.duration", "5"));
    }

    @Test
    public void testMemory() throws ExecutionException, InterruptedException {
//        ConnectorPropertyFactory factory = CamelRabbitMQPropertyFactory
//                .basic()
//                .withKafkaTopic(TestUtils.getDefaultTestTopic(this.getClass()))
//                .withHostname(service.connectionProperties().hostname())
//                .withPortNumber(service.connectionProperties().port())
//                .withUsername(service.connectionProperties().username())
//                .withPassword(service.connectionProperties().password())
//                .withExchangeName("X.test")
//                .withAutoDelete(true)
//                .withQueue("Q.test.kafka.import")
//                .withRoutingKey("events");

        ConnectorPropertyFactory factory = CamelRabbitMQPropertyFactory
                .basic()
                .withKafkaTopic(TestUtils.getDefaultTestTopic(this.getClass()))
                .withUrl(service.connectionProperties().hostname() + ":" + service.connectionProperties().port() +
                        "/X.test")
                .append("username", service.connectionProperties().username())
                .append("password", service.connectionProperties().password())
                .append("autoDelete", "true")
                .append("queue", "Q.test.kafka.import")
                .append("routingKey", "events")
                .buildUrl();

        factory.log();
        getKafkaConnectService().initializeConnector(factory);

        Thread.sleep(Duration.ofMinutes(duration).toMillis());
    }

    @Test
    public void testMemoryUrl() throws ExecutionException, InterruptedException {

    }

}
