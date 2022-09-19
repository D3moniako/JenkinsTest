FROM openjdk:8
EXPOSE 8080
ADD Docker-jenkins-integration-esempio.jar Docker-jenkins-integration-esempio.jar
ENTRYPOINT("java","-jar","/docker-jenkins-integration-esempio.jar")