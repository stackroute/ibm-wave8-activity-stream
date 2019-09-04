package com.stackroute.controller;

import com.stackroute.service.SearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.Twitter;

import java.util.Collection;

@RestController
@RequestMapping("/rest/twitter")
public class TwitterController {
  @GetMapping
  public Twitter getAll() throws Exception {

    return SearchService.getTwitterInstance();
  }


}
