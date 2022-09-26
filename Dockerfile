#Docker Image details

FROM openjdk:16
ADD target/URLFeederService.jar URLFeederService.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "URLFeederService.jar"]
