package com.stackroute.upstream.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.upstream.model.Tweet;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
//import sun.jvm.hotspot.runtime.ObjectMonitor;

@Service
public class UpstreamPublishService {

    @Autowired
    private KafkaTemplate<byte[], byte[]> kafkaTemplate;

    private static final String TOPIC = "tweet";

    public String send(Tweet tweet){
        System.out.println("--------------- Hello");
//        System.out.println(tweet);

        try {
            byte[] ba =
            new ObjectMapper().writeValueAsString(tweet).getBytes();
            kafkaTemplate.send(new ProducerRecord<byte[], byte[]>(TOPIC, ba));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "sent to KAFKA sucessfully";
    }
}
