package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TwitterEntity {
    private HashTag[] hashtags;
    private TwitterURL[] urls;
    private UserMention[] user_mentions;
    private Object[] symbols;
    private Media[] media;

    public Object[] getSymbols() {
        return symbols;
    }

    public TwitterEntity setSymbols(Object[] symbols) {
        this.symbols = symbols;
        return this;
    }

    public HashTag[] getHashtags() {
        return hashtags;
    }

    public TwitterEntity setHashtags(HashTag[] hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    public TwitterURL[] getUrls() {
        return urls;
    }

    public TwitterEntity setUrls(TwitterURL[] urls) {
        this.urls = urls;
        return this;
    }

    public UserMention[] getUser_mentions() {
        return user_mentions;
    }

    public TwitterEntity setUser_mentions(UserMention[] user_mentions) {
        this.user_mentions = user_mentions;
        return this;
    }

//    public String[] getSymbols() {
//        return symbols;
//    }

//    public TwitterEntity setSymbols(String[] symbols) {
//        this.symbols = symbols;
//        return this;
//    }

    public Media[] getMedia() {
        return media;
    }

    public TwitterEntity setMedia(Media[] media) {
        this.media = media;
        return this;
    }

    @Override
    public String toString() {
        return "TwitterEntity{" +
                "hashtags=" + Arrays.toString(hashtags) +
                ", urls=" + Arrays.toString(urls) +
                ", user_mentions=" + Arrays.toString(user_mentions) +
                ", symbols=" + Arrays.toString(symbols) +
                ", media=" + Arrays.toString(media) +
                '}';
    }
}
