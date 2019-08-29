package com.stackroute.service;

import com.stackroute.domain.UserDetails;

import java.util.List;

public interface UserService {

    public UserDetails saveUser(UserDetails userDetails);
    public UserDetails getUserByName(String name);
    public boolean deleteUserByName(String username);
    public boolean updateUser(UserDetails userDetails);
    public List<UserDetails> getAllUsers();
}
