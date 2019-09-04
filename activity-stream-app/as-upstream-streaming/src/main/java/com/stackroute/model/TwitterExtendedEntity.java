package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterExtendedEntity {

    private Media[] media;

    public TwitterExtendedEntity() {}

    public TwitterExtendedEntity(Media[] media) {
        super();
        this.media = media;
    }

    public Media[] getMedia() {
        return media;
    }

    public void setMedia(Media[] media) {
        this.media = media;
    }

}