package com.stackroute.model;

import com.stackroute.SentimentCalculator.SentimentResult;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AnalyzedActivityTweet {
  String timeStamp;
  String uuid;
  String verb;
  TwitterActor actor;
  String content;
  MyCustomTweet object;
  SentimentResult sentimentResult;


}
