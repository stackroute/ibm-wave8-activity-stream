package com.stackroute.model;

import com.stackroute.SentimentResult;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AnalyzedActivityTweet {
  String verb;
  TwitterActor actor;
  String content;
  MyCustomTweet object;
  SentimentResult sentimentResult;

}
