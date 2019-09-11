package com.stackroute.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@UserDefinedType("geo")
public class Geo {
    private String type;
    //    private double[] coordinates=new double[2];
    private List<Double> coordinates=new ArrayList<>();
}
