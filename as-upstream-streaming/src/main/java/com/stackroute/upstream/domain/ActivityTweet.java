package com.stackroute.upstream.domain;

import lombok.*;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ActivityTweet {
   private String timeStamp;
   private String uuid;
   private String verb;
   private TwitterActor actor;
   private String content;
   private MyCustomTweet object;


}