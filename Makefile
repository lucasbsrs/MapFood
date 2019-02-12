install:
	mvn clean install -DskipTests
	
test:
	mvn test
	
docker-build: install
	docker build -t kmyokoyama/mapfood-codenation:latest .
	
clean:
	docker container stop $(docker container ls -a -q)
	docker container rm $(docker container ls -a -q)
	docker volume prune
	docker image rm $(docker images -f dangling=true -a -q) 
	
docker-rm-volume:
	docker volume prune
	
run:
	docker-compose up
	
prune:
	docker-compose stop
	docker-compose rm