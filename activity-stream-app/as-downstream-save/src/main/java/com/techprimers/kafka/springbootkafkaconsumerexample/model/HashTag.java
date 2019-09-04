package com.techprimers.kafka.springbootkafkaconsumerexample.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HashTag {
    private String text;
    private int[] indices;

    public HashTag() {}

    public HashTag(String text, int[] indices) {
        super();
        this.text = text;
        this.indices = indices;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int[] getIndices() {
        return indices;
    }

    public void setIndices(int[] indices) {
        this.indices = indices;
    }

    @Override
    public String toString() {
        return "HashTag{" +
                "text='" + text + '\'' +
                ", indices=" + Arrays.toString(indices) +
                '}';
    }
}
