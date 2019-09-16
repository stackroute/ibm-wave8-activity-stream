package com.stackroute.model;

public class SentimentCounterClass {
    private int negativeCount;
    private int positiveCount;
    private int neutralCount;
    public SentimentCounterClass(int negativeCount, int positiveCount, int neutralCount)
    {
        this.negativeCount=negativeCount;
        this.positiveCount=positiveCount;
        this.neutralCount=neutralCount;
    }
}
