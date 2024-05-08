FROM maven AS build
WORKDIR /app
COPY code/pom.xml .
COPY code/src ./src
RUN mvn -f pom.xml clean package

#
# PACKAGE STAGE
#
FROM openjdk:11-jre-slim 
COPY --from=build /app/target/my-application.jar /my-application.jar  
EXPOSE 8080  
CMD ["java","-jar","/my-application.jar"]