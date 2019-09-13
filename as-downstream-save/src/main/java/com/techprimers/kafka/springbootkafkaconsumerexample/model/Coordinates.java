package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import java.util.Arrays;

public class Coordinates {
    private String type;
    private double[] coordinates=new double[2];

    public Coordinates() {
    }

    public Coordinates(String type, double[] coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public Coordinates setType(String type) {
        this.type = type;
        return this;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public Coordinates setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "type='" + type + '\'' +
                ", coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
