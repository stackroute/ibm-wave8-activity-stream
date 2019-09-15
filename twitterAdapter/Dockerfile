FROM openjdk:11
ADD ./target/twitterAdapter-1.0-SNAPSHOT.jar as-adapter.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","as-adapter.jar"]