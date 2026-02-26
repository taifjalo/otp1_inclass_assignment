FROM  maven:3.9.12-eclipse-temurin-17 AS build
LABEL authors="taifjalo1"

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn package

CMD ["java", "-jar", "target/tempcon.jar"]