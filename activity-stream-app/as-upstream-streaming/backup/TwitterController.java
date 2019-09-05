package com.stackroute.upstream.controller;

import com.stackroute.upstream.model.Tweet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/twitter")
public class TwitterController {
  @GetMapping
  public List<Tweet> getAll() throws Exception {

  //  return new TwitterMicroserviceApplication().getTweets();
    return  null;
  }


}
