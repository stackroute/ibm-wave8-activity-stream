package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import javax.persistence.Embeddable;
import java.util.Arrays;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@UserDefinedType("hashtags")
@Embeddable
public class HashTag {
    private String text;
    //private int[] indices;
    private List<Integer> indices;

}
