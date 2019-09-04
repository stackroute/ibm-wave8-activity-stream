package com.techprimers.kafka.springbootkafkaconsumerexample.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TwitterURL {
    private String url;
    private String expanded_url;
    private String display_url;
    private int[] indices;

    public TwitterURL() {}

    public TwitterURL(String url, String expanded_url, String display_url, int[] indices) {
        super();
        this.url = url;
        this.expanded_url = expanded_url;
        this.display_url = display_url;
        this.indices = indices;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getExpanded_url() {
        return expanded_url;
    }
    public void setExpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
    }
    public String getDisplay_url() {
        return display_url;
    }
    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }
    public int[] getIndices() {
        return indices;
    }
    public void setIndices(int[] indices) {
        this.indices = indices;
    }

    @Override
    public String toString() {
        return "TwitterURL{" +
                "url='" + url + '\'' +
                ", expanded_url='" + expanded_url + '\'' +
                ", display_url='" + display_url + '\'' +
                ", indices=" + Arrays.toString(indices) +
                '}';
    }
}
