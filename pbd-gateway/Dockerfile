FROM openjdk:8-jdk-alpine
ARG JAR_FILE=pbd-gateway/target/pbd-gateway-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","app.jar"]