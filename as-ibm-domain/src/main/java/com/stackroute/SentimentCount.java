package com.stackroute;

import com.stackroute.SentimentCalculator.SentimentResult;
import com.stackroute.model.AnalyzedActivityTweet;
import com.stackroute.model.SentimentCounterClass;

public class SentimentCount {
     int POSITIVE=0;
     int NEGATIVE=0;
     int NEUTRAL=0;

    public SentimentCounterClass countSentiment(Double score){

//        SentimentResult sentimentResult=new SentimentResult();
        if(score<2){
            NEGATIVE++;
        }
        else if (score>2){
            POSITIVE++;
        }
        else{
            NEUTRAL++;
        }
        return new SentimentCounterClass(NEGATIVE,POSITIVE,NEUTRAL);

    }
}
