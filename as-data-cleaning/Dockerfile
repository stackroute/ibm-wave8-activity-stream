FROM openjdk:11
ADD ./target/Data-Cleaning-1.0-SNAPSHOT.jar as-cleaning.jar
EXPOSE 8092
ENTRYPOINT ["java","-jar","as-cleaning.jar"]