package com.stackroute.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
//import User;
import com.stackroute.model.Tweet;
import com.stackroute.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @Autowired
    private TwitterService twitterService;

    @KafkaListener(topics = "tweet")
    public void consume(byte[] message) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            Tweet t = mapper.readValue(message, Tweet.class);
            System.out.println("------------------ Consumed message: " + t);
    twitterService.save(t);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

/*
    @KafkaListener(topics = "Kafka_Example_json", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }*/
}
