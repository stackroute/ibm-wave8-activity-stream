package com.stackroute.model;


import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@UserDefinedType("object")
public class MyCustomTweet {
  String objectType;
  String id;
}
