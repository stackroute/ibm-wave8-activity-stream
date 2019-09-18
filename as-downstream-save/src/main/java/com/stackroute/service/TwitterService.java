package com.stackroute.service;

import com.stackroute.model.ActivityTweet;
import com.stackroute.model.ProcessedTweet;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface TwitterService {
    public ActivityTweet save(ActivityTweet activityTweet);
    public ProcessedTweet saveProcessedTweet(ProcessedTweet processedTweet);
    public List<ProcessedTweet> getAll();

    public List<ProcessedTweet> getAllPolitics();
}
