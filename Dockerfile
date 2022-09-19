FROM openjdk:8
EXPOSE 8086
ADD JenkinsTest.jar JenkinsTest.jar
ENTRYPOINT("java","-jar","/JenkinsTest.jar")