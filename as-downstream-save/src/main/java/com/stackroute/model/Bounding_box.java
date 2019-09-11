package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@UserDefinedType("bounding_box")
public class Bounding_box {
    private String type;
    /*    private double[][][] coordinates=new double[1][1][];*/
    private List<Double> coordinates=new ArrayList<>();

    public String getType() {
        return type;
    }

    public Bounding_box setType(String type) {
        this.type = type;
        return this;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public Bounding_box setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @Override
    public String toString() {
        return "Bounding_box{" +
                "type='" + type + '\'' +
                ", coordinates=" + Arrays.toString(new List[]{coordinates}) +
                '}';
    }
}
