package com.stackroute.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class SentimentTweet {

  String verb;
  TwitterActor actor;
  String content;
  MyCustomTweet object;
//  private SentimentResult sentimentResult;

}
