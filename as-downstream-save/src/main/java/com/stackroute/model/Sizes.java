package com.stackroute.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@JsonIgnoreProperties(ignoreUnknown = true)
@UserDefinedType("sizes")
public class Sizes {

    private Size thumb;
    private Size large;
    private Size medium;
    private Size small;

    public Sizes() {}
    public Sizes(Size thumb, Size large, Size medium, Size small) {
        super();
        this.thumb = thumb;
        this.large = large;
        this.medium = medium;
        this.small = small;
    }
    public Size getThumb() {
        return thumb;
    }
    public void setThumb(Size thumb) {
        this.thumb = thumb;
    }
    public Size getLarge() {
        return large;
    }
    public void setLarge(Size large) {
        this.large = large;
    }
    public Size getMedium() {
        return medium;
    }
    public void setMedium(Size medium) {
        this.medium = medium;
    }
    public Size getSmall() {
        return small;
    }
    public void setSmall(Size small) {
        this.small = small;
    }

    @Override
    public String toString() {
        return "Sizes{" +
                "thumb=" + thumb +
                ", large=" + large +
                ", medium=" + medium +
                ", small=" + small +
                '}';
    }
}
