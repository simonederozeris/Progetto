# Dockerfile for the connessioni application
FROM openjdk:8-jdk
# Install the application binary
COPY /build/libs/connessioni.jar connessioni.jar
# Expose port 
EXPOSE 8081 8500 9092
# Launch the Java application
ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "connessioni.jar"]
