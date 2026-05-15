# Use Java image
FROM eclipse-temurin:17

# App jar name
ARG JAR_FILE=target/*.jar

# Copy jar into container
COPY ${JAR_FILE} app.jar

# Run application
ENTRYPOINT ["java", "-jar", "/app.jar"]