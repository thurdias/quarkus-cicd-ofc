MVNW=./mvnw
DOCKER_IMAGE=my-quarkus-app
TAG=latest

.PHONY: clean build test package docker-run

clean:
	$(MVNW) clean

build:
	$(MVNW) compile

test:
	$(MVNW) test

package:
	$(MVNW) package -Dquarkus.package.type=uber-jar

docker-build:
	docker build -f src/main/docker/Dockerfile.jvm -t $(DOCKER_IMAGE):$(TAG) .

docker-run:
	docker run -i --rm -p 8080:8080 $(DOCKER_IMAGE):$(TAG)
