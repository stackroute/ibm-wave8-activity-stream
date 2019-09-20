package com.stackroute.listener;
import com.stackroute.model.ActivityTweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.messaging.simp.SimpMessagingTemplate;
@Service
public class KafkaConsumer {

    @Autowired
    SimpMessagingTemplate template;

    @KafkaListener(topics = "socket")
    public void consume(ActivityTweet activityTweet) {
        try {
         template.convertAndSend("/topic/user", activityTweet);

        }catch(Exception e) {
            e.printStackTrace();
        }

    }

}