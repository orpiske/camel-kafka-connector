FROM centos:8 AS buildimg
MAINTAINER Otavio Rodolfo Piske <angusyoung@gmail.com>
ARG KAFKA_VERSION
ENV KAFKA_VERSION ${KAFKA_VERSION:-2.5.0}
ARG APACHE_MIRROR
ENV APACHE_MIRROR ${APACHE_MIRROR:-http://mirror.hosting90.cz/apache/kafka/}
RUN yum install -y java-11-openjdk-headless which unzip zip wget tar gzip
ENV JAVA_HOME /etc/alternatives/jre
ARG CONNECTOR_NAME
ENV CONNECTOR_NAME ${CONNECTOR_NAME:-sjms2}
ARG CAMEL_KAFKA_CONNECTOR_VERSION
ENV CAMEL_KAFKA_CONNECTOR_VERSION ${CAMEL_KAFKA_CONNECTOR_VERSION:-0.4.0-SNAPSHOT}
WORKDIR /root/build
COPY connectors/camel-${CONNECTOR_NAME}-kafka-connector/target/camel-${CONNECTOR_NAME}-kafka-connector-${CAMEL_KAFKA_CONNECTOR_VERSION}-package.tar.gz /root/build
RUN wget -c ${APACHE_MIRROR}/${KAFKA_VERSION}/kafka_2.12-${KAFKA_VERSION}.tgz && \
    mkdir -p /root/build/kafka /root/build/camel-kafka-connectors && \
    tar --strip-components=1 -xvf kafka_2.12-${KAFKA_VERSION}.tgz -C /root/build/kafka && \
    tar -xvf camel-${CONNECTOR_NAME}-kafka-connector-${CAMEL_KAFKA_CONNECTOR_VERSION}-package.tar.gz -C /root/build/camel-kafka-connectors

FROM centos:8 AS camel-kafka-connector-base
ARG KAFKA_VERSION
ENV KAFKA_VERSION ${KAFKA_VERSION:-2.5.0}
ARG CAMEL_KAFKA_CONNECTOR_VERSION
ENV CAMEL_KAFKA_CONNECTOR_VERSION ${CAMEL_KAFKA_CONNECTOR_VERSION:-0.4.0-SNAPSHOT}
LABEL CAMEL_KAFKA_CONNECTOR_VERSION=${CAMEL_KAFKA_CONNECTOR_VERSION}
ARG CONNECTOR_NAME
ENV CONNECTOR_NAME ${CONNECTOR_NAME:-sjms2}
ARG KAFKA_CONNECT_MODE
ENV KAFKA_CONNECT_MODE ${KAFKA_CONNECT_MODE:-distributed}
ENV KAFKA_HOME /opt/kafka/
WORKDIR ${KAFKA_HOME}
VOLUME ${KAFKA_HOME}/custom-config
RUN yum install -y java-11-openjdk-headless && \
    yum clean all && \
    echo "\$KAFKA_HOME/bin/connect-${KAFKA_CONNECT_MODE}.sh \$KAFKA_HOME/custom-config/connect-${KAFKA_CONNECT_MODE}.properties \$KAFKA_HOME/custom-config/CamelConnector.properties" >> /opt/run-connector.sh && \
    chmod +x /opt/run-connector.sh

FROM camel-kafka-connector-base as camel-kafka-connector
COPY --from=buildimg /root/build/kafka /opt/kafka
COPY --from=buildimg /root/build/camel-kafka-connectors /opt/camel-kafka-connectors

ENTRYPOINT ["sh", "-c", "/opt/run-connector.sh"]
