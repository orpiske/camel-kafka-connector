FROM strimzi/kafka:latest-kafka-2.4.0
USER root:root
COPY ./core/target/camel-kafka-connector-0.0.1-SNAPSHOT-package/share/java/camel-kafka-connector/ /opt/kafka/plugins/
USER 1001