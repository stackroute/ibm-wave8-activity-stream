FROM openjdk:11
ADD ./target/as-downstream-save-1.0-SNAPSHOT.jar as-downstream.jar
EXPOSE 8096
ENTRYPOINT ["java","-jar","as-downstream.jar"]