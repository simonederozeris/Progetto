# Dockerfile for the ricette application
FROM openjdk:8-jdk
# Install the application binary
COPY /build/libs/ricette.jar ricette.jar
# Expose port 
EXPOSE 8082 8500 9092
# Launch the Java application
ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "ricette.jar"]
