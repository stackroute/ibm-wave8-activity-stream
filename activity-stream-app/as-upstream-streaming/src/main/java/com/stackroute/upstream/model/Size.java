package com.stackroute.upstream.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Size {

    private int w;
    private int h;
    private String resize;

    public Size() {}

    public Size(int w, int h, String resize) {
        super();
        this.w = w;
        this.h = h;
        this.resize = resize;
    }
    public int getW() {
        return w;
    }
    public void setW(int w) {
        this.w = w;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public String getResize() {
        return resize;
    }
    public void setResize(String resize) {
        this.resize = resize;
    }

    @Override
    public String toString() {
        return "Size{" +
                "w=" + w +
                ", h=" + h +
                ", resize='" + resize + '\'' +
                '}';
    }
}