FROM java:8

VOLUME /tmp

ADD target/mapFood-0.0.1-SNAPSHOT.jar app.jar

ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.2.1/wait /wait
RUN chmod +x /wait

CMD /wait && java -Djava.security.egd=file:/dev/./urandom -jar /app.jar