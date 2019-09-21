package com.stackroute.controller;

import com.stackroute.model.ProcessedTweet;
import com.stackroute.service.DataFetcher;
import com.stackroute.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@CrossOrigin("*")
public class DSController {

    @Autowired
    DataFetcher dataFetcher;
    @Autowired
    TwitterService twitterService;

    @RequestMapping("/fetchIBM")
    public ResponseEntity<List<ProcessedTweet>> fetchIBM()
    {
        ResponseEntity<List<ProcessedTweet>> responseEntity;
        List<ProcessedTweet> processedTweets=twitterService.getAll();
        responseEntity=new ResponseEntity<List<ProcessedTweet>>(processedTweets, HttpStatus.CREATED);
        return responseEntity;
    }
    @RequestMapping("/fetchPolitics")
    public ResponseEntity<List<ProcessedTweet>> fetchPolitics()
    {
        ResponseEntity<List<ProcessedTweet>> responseEntity;
        List<ProcessedTweet> processedTweets=twitterService.getAllPolitics();
        responseEntity=new ResponseEntity<List<ProcessedTweet>>(processedTweets, HttpStatus.CREATED);
        return responseEntity;
    }



    @PostConstruct
    public void getAll()
    {
       dataFetcher.fetchData();
    }
}
