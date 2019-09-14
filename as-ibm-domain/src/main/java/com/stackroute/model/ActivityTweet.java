package com.stackroute.model;

import lombok.*;

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
