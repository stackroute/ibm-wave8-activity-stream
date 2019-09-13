package com.stackroute.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
//import User;
import com.stackroute.model.ActivityTweet;
import com.stackroute.model.Tweet;

import com.stackroute.model.TweetAfterCleansing;
import com.stackroute.service.CleaningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @Autowired
    private CleaningService service;
    @Autowired
    KafkaTemplate<String,TweetAfterCleansing> kafkaTemplate;

    @KafkaListener(topics = "tweet1")
    public void consume(ActivityTweet activityTweet) throws IOException {
      System.out.println(activityTweet);

        TweetAfterCleansing tweetAfterCleansing=new TweetAfterCleansing();
        try {

            System.out.println("------------------ Consumed message: " + activityTweet);
            service.save(activityTweet);
        }catch(Exception e) {
            e.printStackTrace();
        }
        String contentnew=service.save(activityTweet);
        tweetAfterCleansing.setActor(activityTweet.getActor());
        tweetAfterCleansing.setContent(contentnew);
        tweetAfterCleansing.setObject(activityTweet.getObject());
        tweetAfterCleansing.setVerb(activityTweet.getVerb());

        kafkaTemplate.send("tweet2",tweetAfterCleansing);
    }


}
