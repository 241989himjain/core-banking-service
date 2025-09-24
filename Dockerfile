# Use a base image with Tomcat and JDK 17
# This image includes a pre-configured Tomcat server, perfect for WAR deployment.
FROM tomcat:10.1-jdk17-temurin

# Set a label for the image
LABEL authors="HMR Infotech"

# Set the working directory to Tomcat's webapps folder
# This is where Tomcat looks for WAR files to deploy.
WORKDIR /usr/local/tomcat/webapps

# Copy the WAR file from your local target directory into the container.
# The `pom.xml` defines the output file name as `oracle-war-microservice-0.0.1-SNAPSHOT.war`.
COPY target/core-banking-service.war /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8080

# The base image's default CMD will run Tomcat, so we don't need to specify it.
# The WAR file will be automatically deployed when the container starts.