

package com.stackroute.controller;

import com.stackroute.model.Message;
import com.stackroute.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageController {

    private MessageService messageService;

    @GetMapping
    public List<Message> getAllMessages() {
        List<Message> messages = new ArrayList<>();
        messageService.findAll().forEach(messages::add);
        return messages;
    }

    @PostMapping
    public ResponseEntity<Message> saveMessage(@RequestBody Message message) {

        Message one = messageService.save(message);
        return new ResponseEntity<Message>(one, HttpStatus.OK);
    }
}
