FROM registry.access.redhat.com/ubi8/ubi-minimal AS buildimg
MAINTAINER Otavio Rodolfo Piske <angusyoung@gmail.com>
ARG KAFKA_VERSION
ENV KAFKA_VERSION ${KAFKA_VERSION:-2.4.0}
ARG APACHE_MIRROR
ENV APACHE_MIRROR ${APACHE_MIRROR:-http://apache.miloslavbrada.cz/kafka}
RUN microdnf install -y java-1.8.0-openjdk-devel which unzip zip wget tar gzip
ENV JAVA_HOME /etc/alternatives/jre
WORKDIR /root/build
RUN wget -c ${APACHE_MIRROR}/${KAFKA_VERSION}/kafka_2.12-${KAFKA_VERSION}.tgz && \
    mkdir -p /root/build/kafka && \
    tar --strip-components=1 -xvf kafka_2.12-${KAFKA_VERSION}.tgz -C /root/build/kafka

FROM registry.access.redhat.com/ubi8/ubi-minimal AS camel-kafka-connector-base
ARG KAFKA_VERSION
ENV KAFKA_VERSION ${KAFKA_VERSION:-2.4.0}
ARG CAMEL_KAFKA_CONNECTOR_VERSION
ENV CAMEL_KAFKA_CONNECTOR_VERSION ${CAMEL_KAFKA_CONNECTOR_VERSION:-0.0.1-SNAPSHOT}
LABEL CAMEL_KAFKA_CONNECTOR_VERSION=${CAMEL_KAFKA_CONNECTOR_VERSION}
ARG CONNECTOR_NAME
ENV CONNECTOR_NAME ${CONNECTOR_NAME:-sjms2}

ENV KAFKA_HOME /opt/kafka/
WORKDIR ${KAFKA_HOME}
VOLUME ${KAFKA_HOME}
RUN microdnf install -y java-1.8.0-openjdk-headless && \
    microdnf clean all && \
    echo "\$KAFKA_HOME/bin/connect-standalone.sh \$KAFKA_HOME/custom-config/connect-standalone.properties \$KAFKA_HOME/custom-config/CamelConnector.properties" >> /opt/run-connector.sh && \
    chmod +x /opt/run-connector.sh

FROM camel-kafka-connector-base
COPY --from=buildimg /root/build/kafka /opt/kafka
COPY connectors/camel-${CONNECTOR_NAME}-kafka-connector/target/camel-${CONNECTOR_NAME}-kafka-connector-${CAMEL_KAFKA_CONNECTOR_VERSION}.jar /opt/kafka/libs/camel-kafka-connector/
COPY connectors/camel-${CONNECTOR_NAME}-kafka-connector/target/camel-${CONNECTOR_NAME}-kafka-connector-${CAMEL_KAFKA_CONNECTOR_VERSION}-package/share/java/camel-${CONNECTOR_NAME}-kafka-connector/ /opt/kafka/libs
ENTRYPOINT ["sh", "-c", "/opt/run-connector.sh"]