# Build the application first using Maven
FROM maven:3.8-openjdk-8 as build
WORKDIR /app
COPY . .
RUN mvn install

# Inject the JAR file into a new container to keep the file small
FROM openjdk:8-jre-slim
WORKDIR /app
COPY --from=build /app/target/producer*.jar /app/producer.jar
EXPOSE 8091
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar app.jar"]

FROM openjdk:8-jre-slim
WORKDIR /app
COPY --from=build /app/target/products*.jar /app/products.jar
EXPOSE 8090
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar app.jar"]

FROM openjdk:8-jre-slim
WORKDIR /app
COPY --from=build /app/target/streamers*.jar /app/streamers.jar
EXPOSE 8092
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar app.jar"]