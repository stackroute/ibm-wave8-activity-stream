package com.stackroute.politicalDomain.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PoliticalDomainActivityTweet {
    private String timeStamp;
    private String uuid;
    private String verb;
    private TwitterActor actor;
    private String content;
    private MyCustomTweet object;
    private SentimentResult sentimentResult;
    private String domain;
    private String subDomain;
}
