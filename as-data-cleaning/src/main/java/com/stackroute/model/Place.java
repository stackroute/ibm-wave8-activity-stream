package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class Place {

    private String id;
    private String url;
    private String place_type;
    private String name;
    private String full_name;
    private String country_code;
    private String country;
    private Bounding_box bounding_box;


    public String getId() {
        return id;
    }

    public Place setId(String id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Place setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPlace_type() {
        return place_type;
    }

    public Place setPlace_type(String place_type) {
        this.place_type = place_type;
        return this;
    }

    public String getName() {
        return name;
    }

    public Place setName(String name) {
        this.name = name;
        return this;
    }

    public String getFull_name() {
        return full_name;
    }

    public Place setFull_name(String full_name) {
        this.full_name = full_name;
        return this;
    }

    public String getCountry_code() {
        return country_code;
    }

    public Place setCountry_code(String country_code) {
        this.country_code = country_code;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Place setCountry(String country) {
        this.country = country;
        return this;
    }

    public Bounding_box getBounding_box() {
        return bounding_box;
    }

    public Place setBounding_box(Bounding_box bounding_box) {
        this.bounding_box = bounding_box;
        return this;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", place_type='" + place_type + '\'' +
                ", name='" + name + '\'' +
                ", full_name='" + full_name + '\'' +
                ", country_code='" + country_code + '\'' +
                ", country='" + country + '\'' +
                ", bounding_box=" + bounding_box +
                '}';
    }
}
