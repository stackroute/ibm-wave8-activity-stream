package com.stackroute.listener;

import com.stackroute.SentimentAnalyzer;
import com.stackroute.SentimentResult;
import com.stackroute.model.ActivityTweet;
import com.stackroute.model.AnalyzedActivityTweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  @Autowired
  KafkaTemplate<String, AnalyzedActivityTweet> kafkaTemplate;

    @KafkaListener(topics = "tweet2", groupId = "group_id")
      public void consume(ActivityTweet message){
      System.out.println(message);
      SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
      sentimentAnalyzer.initialize();
      SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(message.getContent());
      System.out.println(sentimentResult.toString());
      AnalyzedActivityTweet analyzedActivityTweet=new AnalyzedActivityTweet();
      analyzedActivityTweet.setActor(message.getActor());
      analyzedActivityTweet.setContent(message.getContent());
      analyzedActivityTweet.setObject(message.getObject());
      analyzedActivityTweet.setSentimentResult(sentimentResult);
      analyzedActivityTweet.setVerb(message.getVerb());
      kafkaTemplate.send("tweet3",analyzedActivityTweet);
    }
}
