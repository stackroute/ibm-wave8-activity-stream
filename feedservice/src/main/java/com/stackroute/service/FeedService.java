package com.stackroute.service;

import com.stackroute.model.ActivityTweet;
import org.springframework.stereotype.Service;

@Service
public interface FeedService {
public ActivityTweet save(ActivityTweet activityTweet);
}
