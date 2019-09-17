package com.stackroute.model;

import lombok.*;

@Data
<<<<<<< HEAD
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
=======
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TweetAfterCleansing {
    private String timeStamp;
    private String uuid;
    private String verb;
    private TwitterActor actor;
    private String content;
    private MyCustomTweet object;

    }
>>>>>>> bef27849eac8d7aee085a8ad3d42a6c8c2e8877b
