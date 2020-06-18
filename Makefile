REGISTRY?=docker.io
PROJECT?=otavio021
KAFKA_VERSION?=2.4.1
CAMEL_KAFKA_CONNECTOR_VERSION=0.4.0-SNAPSHOT

CONNECTORS=aws-kinesis aws-sqs aws-sns aws-s3 cql elasticsearch-rest file hdfs http salesforce slack sjms2 syslog timer twitter-timeline twitter-search

$(CONNECTORS):
	docker build -t camel-kafka-connector-$@-distributed:latest --build-arg CAMEL_KAFKA_CONNECTOR_VERSION=$(CAMEL_KAFKA_CONNECTOR_VERSION) --build-arg KAFKA_VERSION=$(KAFKA_VERSION) --build-arg CONNECTOR_NAME=$@ .
	docker tag camel-kafka-connector-$@-distributed:latest $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-distributed:latest
	docker tag camel-kafka-connector-$@-distributed:latest $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-distributed:latest-connector-$(CAMEL_KAFKA_CONNECTOR_VERSION)
	docker tag camel-kafka-connector-$@-distributed:latest $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-distributed:latest-kafka-$(KAFKA_VERSION)
	docker push $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-distributed:latest
	docker push $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-distributed:latest-connector-$(CAMEL_KAFKA_CONNECTOR_VERSION)
	docker push $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-distributed:latest-kafka-$(KAFKA_VERSION)
	docker build -t camel-kafka-connector-$@-standalone:latest --build-arg CAMEL_KAFKA_CONNECTOR_VERSION=$(CAMEL_KAFKA_CONNECTOR_VERSION) --build-arg KAFKA_VERSION=$(KAFKA_VERSION) --build-arg CONNECTOR_NAME=$@ --build-arg KAFKA_CONNECT_MODE=standalone .
	docker tag camel-kafka-connector-$@-standalone:latest $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-standalone:latest
	docker tag camel-kafka-connector-$@-standalone:latest $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-standalone:latest-connector-$(CAMEL_KAFKA_CONNECTOR_VERSION)
	docker tag camel-kafka-connector-$@-standalone:latest $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-standalone:latest-kafka-$(KAFKA_VERSION)
	docker push $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-standalone:latest
	docker push $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-standalone:latest-connector-$(CAMEL_KAFKA_CONNECTOR_VERSION)
	docker push $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-standalone:latest-kafka-$(KAFKA_VERSION)
	docker build -f Dockerfile-s2i -t camel-kafka-connector-$@-s2i:latest  --build-arg CONNECTOR_NAME=$@ --build-arg CAMEL_KAFKA_CONNECTOR_VERSION=$(CAMEL_KAFKA_CONNECTOR_VERSION) .
	docker tag camel-kafka-connector-$@-s2i:latest $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-s2i:latest
	docker tag camel-kafka-connector-$@-s2i:latest $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-s2i:latest-connector-$(CAMEL_KAFKA_CONNECTOR_VERSION)
	docker push $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-s2i:latest
	docker push $(REGISTRY)/$(PROJECT)/camel-kafka-connector-$@-s2i:latest-connector-$(CAMEL_KAFKA_CONNECTOR_VERSION)

connectors: $(CONNECTORS)
