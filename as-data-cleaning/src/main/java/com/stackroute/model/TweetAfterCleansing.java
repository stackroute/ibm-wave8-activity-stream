package com.stackroute.model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TweetAfterCleansing {
    private String timeStamp;
    private String uuid;
    String verb;
    TwitterActor actor;
    String content;
    MyCustomTweet object;

  }
