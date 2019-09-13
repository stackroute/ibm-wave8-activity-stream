package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Media {

    private long id;//": 1163372308586627000,
    private String id_str;//": "1163372308586627072",
    private int[] indices;
    private String media_url;//": "http://pbs.twimg.com/media/ECUg82rVAAA0AUG.jpg",
    private String media_url_https;//": "https://pbs.twimg.com/media/ECUg82rVAAA0AUG.jpg",
    private String url;//": "https://t.co/Rcb5HqVQUy",
    private String display_url;//": "pic.twitter.com/Rcb5HqVQUy",
    private String expanded_url;//": "https://twitter.com/glayhisashi626/status/1163372317910560768/photo/1",
    private String type;//": "photo",
    private Sizes sizes;

    public Media() {}
    public Media(long id, String id_str, int[] indices, String media_url, String media_url_https, String url,
                 String display_url, String expanded_url, String type, Sizes sizes) {
        super();
        this.id = id;
        this.id_str = id_str;
        this.indices = indices;
        this.media_url = media_url;
        this.media_url_https = media_url_https;
        this.url = url;
        this.display_url = display_url;
        this.expanded_url = expanded_url;
        this.type = type;
        this.sizes = sizes;
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
    public String getMedia_url() {
        return media_url;
    }
    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }
    public String getMedia_url_https() {
        return media_url_https;
    }
    public void setMedia_url_https(String media_url_https) {
        this.media_url_https = media_url_https;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDisplay_url() {
        return display_url;
    }
    public void setDisplay_url(String display_url) {
        this.display_url = display_url;
    }
    public String getExpanded_url() {
        return expanded_url;
    }
    public void setExpanded_url(String expanded_url) {
        this.expanded_url = expanded_url;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Sizes getSizes() {
        return sizes;
    }
    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", id_str='" + id_str + '\'' +
                ", indices=" + Arrays.toString(indices) +
                ", media_url='" + media_url + '\'' +
                ", media_url_https='" + media_url_https + '\'' +
                ", url='" + url + '\'' +
                ", display_url='" + display_url + '\'' +
                ", expanded_url='" + expanded_url + '\'' +
                ", type='" + type + '\'' +
                ", sizes=" + sizes +
                '}';
    }
}