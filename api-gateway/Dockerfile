# Dockerfile for the api-gateway application
FROM openjdk:8-jdk
# Install the application binary
COPY /build/libs/api-gateway.jar api-gateway.jar
# Expose port 
EXPOSE 8084 8500
# Launch the Java application
ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "api-gateway.jar"]
