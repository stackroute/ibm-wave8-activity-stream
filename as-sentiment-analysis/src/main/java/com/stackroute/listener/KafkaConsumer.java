package com.stackroute.listener;

import com.stackroute.SentimentAnalyzer;
import com.stackroute.SentimentResult;
import com.stackroute.model.AnalyzedActivityTweet;
import com.stackroute.model.TweetAfterCleansing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
//  int
  @Autowired
  KafkaTemplate<String, AnalyzedActivityTweet> kafkaTemplate;

    @KafkaListener(topics = "tweet2", groupId = "group_id")
      public void consume(TweetAfterCleansing message){
      System.out.println(message);
      SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
      sentimentAnalyzer.initialize();
      SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(message.getContent());
      System.out.println(sentimentResult.toString());
      AnalyzedActivityTweet analyzedActivityTweet=new AnalyzedActivityTweet();
      analyzedActivityTweet.setActor(message.getActor());
      analyzedActivityTweet.setTimeStamp(message.getTimeStamp());
      analyzedActivityTweet.setUuid(message.getUuid());
      analyzedActivityTweet.setContent(message.getContent());
      analyzedActivityTweet.setObject(message.getObject());
      analyzedActivityTweet.setSentimentResult(sentimentResult);
      analyzedActivityTweet.setVerb(message.getVerb());
      analyzedActivityTweet.setTimeStamp(message.getTimeStamp());
      analyzedActivityTweet.setUuid(message.getUuid());
      kafkaTemplate.send("tweet3",analyzedActivityTweet);
    }
}
