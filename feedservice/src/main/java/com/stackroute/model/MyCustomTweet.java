package com.techprimers.springbootwebsocketexample.model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyCustomTweet {
    String objectType;
    String id;
}