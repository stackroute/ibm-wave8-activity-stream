FROM openjdk:11
ADD ./target/as-sentiment-analysis-1.0-SNAPSHOT.jar as-sentiment.jar
EXPOSE 8093
ENTRYPOINT ["java","-jar","as-sentiment.jar"]