package com.stackroute.service;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.stackroute.dao.UserDao;

import com.stackroute.model.UserDTO;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    private UserDTO userDTO;

    public JwtUserDetailsService() {
    }

    @Autowired
    private PasswordEncoder bcryptEncoder;

    public JwtUserDetailsService(UserDao userDao) {
        this.userDao = userDao;
    }
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userDao.findByusername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Username not found: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

    public Users save(Users user) {
        Users newUser = new Users();
      newUser.setEmail(user.getEmail());
       newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
       newUser.setUsername(user.getUsername());
       newUser.setPhonenumber(user.getPhonenumber());
       newUser.setTopic(user.getTopic());
       return userDao.save(newUser);
   }
public String forgotPassword(String username) throws MessagingException {
    String status = "Failed";
    if (userDao.findByusername(username) != null) {
        MimeMessage message=javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(username);
        helper.setSubject("Link for Reset your Password");
        helper.setText("http://172.23.238.212:4200/resetPassword");
        javaMailSender.send(message);
        //System.out.println("hello");
        status = "Sent";
    }
    else {
        System.out.println("ok");
    }
    return status;
}
    public Users update(UserDTO userDTO) throws Exception {
        Users user = userDao.findByusername(userDTO.getUsername());
        if (user != null) {
            user.setPassword(bcryptEncoder.encode(userDTO.getPassword()));
        }
        //System.out.println(user);
        return userDao.save(user);
    }
}

