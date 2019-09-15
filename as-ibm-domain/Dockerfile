FROM openjdk:11
ADD ./target/as-ibm-domain-1.0-SNAPSHOT.jar as-ibm.jar
EXPOSE 8095
ENTRYPOINT ["java","-jar","as-ibm.jar"]