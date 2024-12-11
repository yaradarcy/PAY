WORKDIR /app
COPY ./app

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-alpine

COPY --from-build /app/target/projeto-sistema-web-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]