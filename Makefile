
$ docker-compose -f build/docker-compose.ci.yaml -p ${CONTAINER_SUFFIX}

build:
	docker-compose -f deploy/docker-compose.yaml run --name