package com.stackroute.service;

import com.stackroute.model.ActivityTweet;

import java.io.IOException;

//@Service
public interface CleaningService {
    public String save(ActivityTweet tweet) throws IOException;

}
