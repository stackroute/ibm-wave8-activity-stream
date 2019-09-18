package com.techprimers.springbootwebsocketexample.model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActivityTweet {
    String timeStamp;
    String uuid;
    String verb;
    TwitterActor actor;
    String content;
    MyCustomTweet object;


}