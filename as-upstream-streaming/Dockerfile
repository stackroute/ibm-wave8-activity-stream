FROM openjdk:11
ADD ./target/as-upstream-streaming-0.0.1-SNAPSHOT.jar as-upstream.jar
EXPOSE 8092
ENTRYPOINT ["java","-jar","as-upstream.jar"]