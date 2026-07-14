FROM eclipse-temurin:170-jdk

WORKDIR /app

COPY targetr/*.jar app.jar

EXPOSE 8081

ENTRYPOINT 	["java", "-jar". "app.jar"]