package com.stackroute.listener;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.stackroute.model.DAOUser;
import com.stackroute.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class KafkaConsumer {
    @Autowired
    UserDao userDao;
    @Autowired
    private PasswordEncoder bcryptEncoder;
    @KafkaListener(topics = "User-Details1", groupId = "group_id")
    public void consume(String daoUser) throws IOException {
//        System.out.println("aushdoisankjfnsalkjnfljdsnf");
//        System.out.println(daoUser.getUsername());
//        System.out.println(daoUser.getPassword());
        DAOUser obj = new ObjectMapper().readValue(daoUser, DAOUser.class);
//        DAOUser object=new DAOUser();
        //System.out.println("Consumed message: " + bcryptEncoder.encode(obj.getPassword()));
        obj.setPassword(bcryptEncoder.encode(obj.getPassword()));
        userDao.save(obj);
//       return userDao.save(daoUser);
       /* DAOUser newUser = new DAOUser();
        newUser.setUsername(daoUser.getUsername());
        newUser.setPassword(bcryptEncoder.encode(daoUser.getPassword()));
        return userDao.save(newUser);
*/
    }

}
