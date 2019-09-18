package com.techprimers.springbootwebsocketexample.model;


import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TwitterActor {
    String objectType;
    String id;
    String displayName;
}