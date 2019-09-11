package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.Arrays;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
@UserDefinedType("user_mentions")
public class UserMention {

    private String screen_name;
    private String name;
    private long id;
    private String id_str;
    // private int[] indices;
    private List<Integer> indices;

}