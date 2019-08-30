

package com.stackroute.service;

import com.stackroute.model.Message;

import java.util.List;

public interface MessageService {
    public Message save(Message message);

    public List<Message> findAll();

}
