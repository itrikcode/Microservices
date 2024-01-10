# Use an official OpenJDK runtime as a parent image
FROM openjdk:17.0.1-slim

# Create working directory inside the container
WORKDIR /testapp

# Copy the jar file into the testapp working directory
COPY build/libs/irctc-provider-0.0.1-SNAPSHOT.jar .

# Expose the port at app run
##EXPOSE 7070

# Specify the command to run on container start
CMD ["java", "-jar", "irctc-provider-0.0.1-SNAPSHOT.jar"]
