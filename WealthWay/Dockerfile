# Use a base image with Maven and JDK
FROM maven:3.9.6-eclipse-temurin-17 as build

# Set working directory inside the container
WORKDIR /app

# Copy all files from current directory to /app in container
COPY . .

# Run the Maven build
RUN mvn clean install

# ----- optional second stage -----
# Use a smaller base image to run the app
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
