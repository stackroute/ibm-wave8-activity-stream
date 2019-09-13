package com.stackroute.model;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Coordinates {
    private String type;
    // private double[] coordinates=new double[2];
    private List<Double> coordinates=new ArrayList<>();
    public Coordinates() {
    }

    public Coordinates(String type, List<Double> coordinates) {
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

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public Coordinates setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "type='" + type + '\'' +
                ", coordinates=" + Arrays.toString(new List[]{coordinates}) +
                '}';
    }
}
