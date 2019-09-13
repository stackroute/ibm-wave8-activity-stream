package com.stackroute.service;

import com.stackroute.domain.UserDetails;
import com.stackroute.exceptions.UserAlreadyExists;
import com.stackroute.exceptions.UserNotFound;

import java.util.List;

public interface UserService {
    public UserDetails saveUser(UserDetails userDetails) throws UserAlreadyExists;
    public UserDetails getUserByName(String name);
    public boolean deleteUserByName(String username) throws UserNotFound;
    public boolean updateUser(UserDetails userDetails);
    public List<UserDetails> getAllUsers();
}
