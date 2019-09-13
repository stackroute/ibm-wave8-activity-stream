package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


import javax.persistence.Embeddable;
import java.util.Arrays;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class HashTag {
    private String text;
    //private int[] indices;
    private List<Integer> indices;

}
