package com.stackroute.upstream.model;

import java.util.Arrays;

public class Geo {
    private String type;
    private double[] coordinates=new double[2];

    public Geo() {
    }

    public Geo(String type, double[] coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public Geo setType(String type) {
        this.type = type;
        return this;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public Geo setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "type='" + type + '\'' +
                ", coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
