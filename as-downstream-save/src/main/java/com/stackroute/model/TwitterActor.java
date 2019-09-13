package com.stackroute.model;


import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@UserDefinedType("actor")
public class TwitterActor {
    String objectType;
    String id;
    String displayName;
}
