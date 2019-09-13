package com.stackroute.upstream.domain;

import lombok.*;
import org.springframework.stereotype.Service;

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
