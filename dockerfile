FROM eclipse-temurin:21-jdk-jammy

# Set working directory
WORKDIR /app

# Copy the built jar (renamed inside container)
COPY build/libs/notification-service-*.jar notification-service.jar

# Expose Eureka port
EXPOSE 7083

# Run the application
ENTRYPOINT ["java","-jar","notification-servic.jar"]