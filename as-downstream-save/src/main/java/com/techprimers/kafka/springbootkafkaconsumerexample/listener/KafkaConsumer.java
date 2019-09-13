package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;
import com.techprimers.kafka.springbootkafkaconsumerexample.model.Tweet;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.beans.ExceptionListener;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "tweet")
    public void consume(byte[] message) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            Tweet t = mapper.readValue(message, Tweet.class);
            System.out.println("------------------ Consumed message: " + t);

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
