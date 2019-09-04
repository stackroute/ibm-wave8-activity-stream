package com.stackroute.exceptions;

public class UserAlreadyExists extends Exception {
    String message;
    public UserAlreadyExists(){

    }
    public UserAlreadyExists(String message){
        super(message);
        this.message=message;
    }
}
