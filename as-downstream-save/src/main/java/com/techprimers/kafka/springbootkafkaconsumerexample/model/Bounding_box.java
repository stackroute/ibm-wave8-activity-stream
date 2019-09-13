package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bounding_box {
    private String type;
    private double[][][] coordinates=new double[1][1][];

    public String getType() {
        return type;
    }

    public Bounding_box setType(String type) {
        this.type = type;
        return this;
    }

    public double[][][] getCoordinates() {
        return coordinates;
    }

    public Bounding_box setCoordinates(double[][][] coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @Override
    public String toString() {
        return "Bounding_box{" +
                "type='" + type + '\'' +
                ", coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
