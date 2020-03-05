FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/sample1.jar sample1.jar
ENTRYPOINT ["java","-jar","sample1.jar"]