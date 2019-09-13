package com.stackroute.model;

import lombok.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Geo {
    private String type;
    //    private double[] coordinates=new double[2];
    private List<Double> coordinates=new ArrayList<>();
}
