FROM openjdk:8-jdk-alpine
ARG JAR_FILE=pbd-config-server/target/pbd-config-server-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod,native","app.jar"]