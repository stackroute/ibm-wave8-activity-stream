package com.stackroute.listener;

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

    @KafkaListener(topics = "tweet1", groupId = "group_id")
      public void consume(ActivityTweet message){

      System.out.println(message);
    }
}
