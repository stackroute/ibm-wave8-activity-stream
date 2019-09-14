package com.stackroute.SentimentCalculator;
public class SentimentResult {
  String sentimentType;
  double sentimentScore;
  SentimentClassification sentimentClass;

  @Override
  public String toString() {
    return "SentimentResult{" +
      "sentimentType='" + sentimentType + '\'' +
      ", sentimentScore=" + sentimentScore +
      '}';
  }

  public String getSentimentType() {
    return sentimentType;
  }
  public void setSentimentType(String sentimentType) {
    this.sentimentType = sentimentType;
  }
  public double getSentimentScore() {
    return sentimentScore;
  }
  public void setSentimentScore(double sentimentScore) {
    this.sentimentScore = sentimentScore;
  }
  public SentimentClassification getSentimentClass() {
    return sentimentClass;
  }
  public void setSentimentClass(SentimentClassification sentimentClass) {
    this.sentimentClass = sentimentClass;
  }
}
