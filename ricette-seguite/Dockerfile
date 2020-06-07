# Dockerfile for the ricette-seguite application
FROM openjdk:8-jdk
# Install the application binary
COPY /build/libs/ricette-seguite.jar ricette-seguite.jar
# Expose port 
EXPOSE 8083 8500 9092 
# Launch the Java application
ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "ricette-seguite.jar"]
