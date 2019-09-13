package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


import java.util.Arrays;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)

public class UserMention {

    private String screen_name;
    private String name;
    private long id;
    private String id_str;
    private List<Integer> indices;

}