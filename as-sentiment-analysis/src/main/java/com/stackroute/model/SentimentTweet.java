package com.stackroute.model;

import com.stackroute.SentimentResult;
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
  private SentimentResult sentimentResult;

}
