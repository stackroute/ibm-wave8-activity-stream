package com.stackroute.model;
import com.stackroute.model.TwitterActor;
import com.stackroute.model.MyCustomTweet;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActivityTweet {
    private String timeStamp;
    private String uuid;
    private String verb;
    private TwitterActor actor;
    private String content;
    private MyCustomTweet object;
    private SentimentResult sentimentResult;
    private String domain;
    private String subdomain;
}