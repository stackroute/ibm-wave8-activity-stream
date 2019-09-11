package com.stackroute.Controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.domain.UserDetails;
import com.stackroute.exceptions.UserAlreadyExists;
import com.stackroute.exceptions.UserNotFound;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping(value="api/v1")
public class UserController {
    @Autowired
    private UserService userService;
    private  UserDetails userDetails;
    public UserController(UserService userService) {

        this.userService = userService;
    }
    @Autowired
    private KafkaTemplate<Object, String> kafkaTemplate;

    private static final String TOPIC = "User-Details";
    @PostMapping("user")
    public ResponseEntity<?> saveUser(@RequestBody UserDetails userDetails) throws UserAlreadyExists, JsonProcessingException {
        ResponseEntity responseEntity;
        try {
            userService.saveUser(userDetails);
            this.kafkaTemplate.send(TOPIC, new ObjectMapper().writeValueAsString(userDetails));
            responseEntity = new ResponseEntity(userDetails, HttpStatus.CREATED);
        } catch (UserAlreadyExists e) {

            throw new UserAlreadyExists("User Already Registered");
        }
        catch (Exception e)
        {
            responseEntity = new ResponseEntity<>("Error  !!!Try after sometime", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return responseEntity;
    }
    @GetMapping("users")
    public ResponseEntity<?> getAllUsers(){
        ResponseEntity responseEntity;
        try{
            userService.getAllUsers();
            responseEntity= new ResponseEntity<List<UserDetails>>(userService.getAllUsers(), HttpStatus.OK);
        } catch (Exception e){
            responseEntity=new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
    @GetMapping("user/{username}")
    public UserDetails getTrackById(@PathVariable("username") String username){
        ResponseEntity responseEntity;
        userDetails=userService.getUserByName(username);
        return userDetails;
    }

    @DeleteMapping("deleteUser/{username}")
    public ResponseEntity<?> deleteUser(@PathVariable("username") String username) throws UserNotFound {
        ResponseEntity responseEntity;
        try {
            userService.deleteUserByName(username);
            responseEntity = new ResponseEntity("Successfully deleted !!!", HttpStatus.OK);
        } catch (UserNotFound e) {

            throw new UserNotFound("User doesnt exists");
        } catch (Exception exception) {
            responseEntity = new ResponseEntity("Error !!! Try after sometime.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }
    @PutMapping("update/{username}")
    public ResponseEntity<UserDetails> updateUser(@RequestBody UserDetails userDetails){
        ResponseEntity responseEntity;
        try {
            userService.updateUser(userDetails);
            responseEntity= new ResponseEntity<String>("updated", HttpStatus.OK);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }

}
