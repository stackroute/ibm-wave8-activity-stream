package com.stackroute.model;

import com.stackroute.SentimentResult;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AnalyzedActivityTweet {
  private String timeStamp;
  private String uuid;
  private String verb;
  private TwitterActor actor;
  private String content;
  private MyCustomTweet object;
  private SentimentResult sentimentResult;

}
