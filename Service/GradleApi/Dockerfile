# Use a base image with the desired OS and JDK version
FROM openjdk:19-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the Spring Boot Gradle project build files to the container
COPY build/libs/*.jar GradleApi-v1.0.0-SNAPSHOT.jar

# Expose the container port
EXPOSE 8183

# Set the entry point to run the application when the container starts
ENTRYPOINT ["java", "-jar", "GradleApi-v1.0.0-SNAPSHOT.jar"]