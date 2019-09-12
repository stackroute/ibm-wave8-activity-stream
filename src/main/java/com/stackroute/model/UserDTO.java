package com.stackroute.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {
    //setting and getting the fields of user

    private String username;
    private String password;


    public UserDTO() {
    }
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
