


package com.stackroute.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.model.Message;
import com.stackroute.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @Autowired
    MessageService messageService;

    @KafkaListener(topics = "demojsontopic", groupId = "group_id")
    public void consume(String message) throws IOException {

        Message obj=new ObjectMapper().readValue(message,Message.class);
        System.out.println(obj.getMessage());
        messageService.save(obj);
    }

}