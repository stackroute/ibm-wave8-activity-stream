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
@UserDefinedType("urls")
public class TwitterURL {
    private String url;
    private String expanded_url;
    private String display_url;
    // private int[] indices;
    private List<Integer> indices;

}
