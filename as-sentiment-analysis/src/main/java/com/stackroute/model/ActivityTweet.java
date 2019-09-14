package com.stackroute.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ActivityTweet {
   private String verb;
   private String timeStamp;
   private String uuid;
   private TwitterActor actor;
   private String content;
   private MyCustomTweet object;


}
