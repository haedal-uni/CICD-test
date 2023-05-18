FROM openjdk:11-slim
WORKDIR /app
COPY ./cicid1-1.0-SNAPSHOT.jar ./app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar","app.jar"]
