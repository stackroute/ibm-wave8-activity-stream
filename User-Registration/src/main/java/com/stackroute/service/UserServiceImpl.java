package com.stackroute.service;

import com.stackroute.domain.UserDetails;
import com.stackroute.exceptions.UserAlreadyExists;
import com.stackroute.exceptions.UserNotFound;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails saveUser(UserDetails userDetails) throws UserAlreadyExists {
        UserDetails saveDetails;
        Optional optional=userRepository.findById(userDetails.getUsername());
        if((optional.isPresent())){
            throw new UserAlreadyExists("User Already Registered");
        }

        else {
            saveDetails = userRepository.save(userDetails);
        }
        return saveDetails;
    }
    @Override
    public boolean deleteUserByName(String username) throws UserNotFound {
        boolean status = false;
        Optional optional = userRepository.findById(username);
        if(optional.isPresent()) {
            userRepository.delete(getUserByName(username));
            status = true;
        }
        else{
            throw new UserNotFound("User Doesnt exists");
        }
        return status;
    }

    @Override
    public boolean updateUser(UserDetails userDetails) {
        UserDetails updateUser = userRepository.findById(userDetails.getUsername()).get();
        if (updateUser != null) {
            updateUser.setUsername(userDetails.getUsername());
            updateUser.setPassword(userDetails.getPassword());
            updateUser.setPhonenumber(userDetails.getPhonenumber());
            updateUser.setEmailid(userDetails.getEmailid());
            updateUser.setSubscribed_topic(userDetails.getSubscribed_topic());
            userRepository.save(updateUser);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public UserDetails getUserByName(String username) {
        Optional<UserDetails> userbyname=userRepository.findById(username);
        if(userbyname.isPresent()){
            return userbyname.get();

        }
        else {
            return null;
        }
    }
    @Override
    public List<UserDetails> getAllUsers() {
        return userRepository.findAll();
    }
}
