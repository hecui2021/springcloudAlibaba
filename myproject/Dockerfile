FROM openjdk:8-jdk-slim
LABEL maintainer=peterche

COPY target/*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
