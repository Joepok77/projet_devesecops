FROM openjdk:17-oracle
EXPOSE 8080
ADD ./build/libs/car_service-0.0.1-SNAPSHOT.jar  app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]