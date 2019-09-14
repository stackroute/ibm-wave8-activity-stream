package com.techprimers.springbootwebsocketexample.service;

import com.techprimers.springbootwebsocketexample.model.ActivityTweet;
import org.springframework.stereotype.Service;

@Service
public interface FeedService {
public ActivityTweet save(ActivityTweet activityTweet);
}
