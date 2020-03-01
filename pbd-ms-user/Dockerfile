FROM openjdk:8-jdk-alpine
ARG JAR_FILE=pbd-ms-user/target/pbd-ms-user-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","app.jar"]