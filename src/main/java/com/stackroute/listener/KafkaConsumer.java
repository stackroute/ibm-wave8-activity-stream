package com.stackroute.listener;


import com.stackroute.dao.UserDao;
import com.stackroute.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder bcryptEncoder;
    @KafkaListener(topics = "registration", groupId="group_id")
   public void consumeJson(Users user) throws IOException {
//        User user = new ObjectMapper().readValue(message, Users.class);
       // System.out.println("Consumed JSON Message: " + user);
        Users newUser = new Users();
        newUser.setEmail(user.getEmail());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        newUser.setUsername(user.getUsername());
        newUser.setPhonenumber(user.getPhonenumber());
        newUser.setTopic(user.getTopic());
     /*   if(user.getOperation()==1) {
            userDao.save(newUser);
        }
        else if(user.getOperation()==0)
        {
            userDao.deleteByemail(user.getEmail());
         } */

    }
}
