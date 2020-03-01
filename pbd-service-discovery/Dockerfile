FROM openjdk:8-jdk-alpine
ARG JAR_FILE=pbd-service-discovery/target/pbd-service-discovery-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]