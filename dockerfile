FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Xdebug", "-Xrunjdwp:transport=dt_socket,address=5005,server=y,suspend=n", "-jar", "/app.jar"]