package com.stackroute.upstream.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown=true)
public class UserMention {

    private String screen_name;
    private String name;
    private long id;
    private String id_str;
    private int[] indices;

    public UserMention() {}

    public UserMention(String screen_name, String name, int id, String id_str, int[] indices) {
        super();
        this.screen_name = screen_name;
        this.name = name;
        this.id = id;
        this.id_str = id_str;
        this.indices = indices;
    }
    public String getScreen_name() {
        return screen_name;
    }
    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getId_str() {
        return id_str;
    }
    public void setId_str(String id_str) {
        this.id_str = id_str;
    }
    public int[] getIndices() {
        return indices;
    }
    public void setIndices(int[] indices) {
        this.indices = indices;
    }

    @Override
    public String toString() {
        return "UserMention{" +
                "screen_name='" + screen_name + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", id_str='" + id_str + '\'' +
                ", indices=" + Arrays.toString(indices) +
                '}';
    }
}