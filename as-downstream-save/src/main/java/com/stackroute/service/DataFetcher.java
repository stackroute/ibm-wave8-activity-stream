package com.stackroute.service;

import com.stackroute.model.ProcessedTweet;
import com.stackroute.repository.TwitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataFetcher {
    List<ProcessedTweet> processedTweets;
    @Autowired
    private TwitterRepository twitterRepository;
    @Autowired
    private TwitterService twitterService;
    public void fetchData()
    {
        processedTweets=twitterService.getAll();
        for (int i=0;i<processedTweets.size();i++)
            System.out.println("Tweet fetched from Database  "+processedTweets.get(i));
    }
}
