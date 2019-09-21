package com.stackroute.resource;


import com.stackroute.model.User;
import com.stackroute.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


    @MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {

        return new UserResponse("Hi " + user.getName());
    }

    @MessageMapping("/user1")
    @SendTo("/topic/user1")
    public UserResponse getContent(User user) {

        return new UserResponse("Hello " + user.getName());
    }

}
