package com.stackroute.service;

import com.stackroute.model.Tweet;
import com.stackroute.repository.TwitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TwitterServiceImpl implements TwitterService  {
  @Autowired
  private TwitterRepository twitterRepository;

    @Override
    public Tweet save(Tweet tweet) {
        return twitterRepository.save(tweet);
    }
}
