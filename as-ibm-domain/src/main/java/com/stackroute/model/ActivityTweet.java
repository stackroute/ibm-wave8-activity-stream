package com.stackroute.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ActivityTweet {
   String verb;
   TwitterActor actor;
   String content;
   MyCustomTweet object;


}
