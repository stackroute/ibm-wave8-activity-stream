package com.stackroute.service;

import com.stackroute.model.ActivityTweet;
import com.stackroute.model.ProcessedTweet;
import com.stackroute.model.Tweet;
import com.stackroute.repository.ProcessedTweetRepository;
import com.stackroute.repository.TwitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwitterServiceImpl implements TwitterService  {
  @Autowired
  private TwitterRepository twitterRepository;

  @Autowired
  ProcessedTweetRepository processedTweetRepository;
  @Override
  public ActivityTweet save(ActivityTweet activityTweet) {
    System.out.println("INSIDE SAVEEEEEEEEEEEEEE   "+activityTweet.toString());
    return twitterRepository.save(activityTweet);
  }

  @Override
  public ProcessedTweet saveProcessedTweet(ProcessedTweet processedTweet) {
    return processedTweetRepository.save(processedTweet);

  }
  @Override
  public List<ProcessedTweet> getAll()
  {
    return processedTweetRepository.getAll();
  }

  @Override
  public List<ProcessedTweet> getAllPolitics() {
    return processedTweetRepository.getPoliticalTweets();
  }
}
