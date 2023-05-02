
FROM amazoncorretto:8-alpine-jdk

COPY target/portfolioBackEnd-0.0.1-SNAPSHOT app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
