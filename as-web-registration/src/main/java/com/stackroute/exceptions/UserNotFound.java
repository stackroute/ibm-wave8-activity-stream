package com.stackroute.exceptions;

public class UserNotFound extends Exception{
    String message;
    public UserNotFound(){

    }
    public UserNotFound(String message){
        super(message);
        this.message=message;
    }
}
