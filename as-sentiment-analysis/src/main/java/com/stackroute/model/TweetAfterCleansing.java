package com.stackroute.model;

import lombok.*;

@Data
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
