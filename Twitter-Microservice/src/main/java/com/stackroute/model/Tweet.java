package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jdk.nashorn.internal.ir.annotations.Ignore;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tweet {
    private String created_at;
    private String id;
    private String id_str;
    private String text;
    private String source;
    private boolean truncated;
    private String in_reply_to_status_id;
    private String in_reply_to_status_id_str;
    private String in_reply_to_user_id;
    private String in_reply_to_user_id_str;
    private String in_reply_to_screen_name;
    private User user;
    private Geo geo;
    private Coordinates coordinates;
    private Place place;
    private String contributors;
    private boolean is_quote_status;
    private int quote_count;
    private int reply_count;
    private int retweet_count;
    private int favorite_count;
    private TwitterEntity entities;
    private TwitterExtendedEntity extended_entities;
    private boolean favorited;
    private boolean retweeted;
    private boolean possibly_sensitive;
    private String filter_level;
    private String lang;
    private String timestamp_ms;

    public Tweet() {
    }

    public Tweet(String created_at, String id, String id_str, String text, String source, boolean truncated, String in_reply_to_status_id, String in_reply_to_status_id_str, String in_reply_to_user_id, String in_reply_to_user_id_str, String in_reply_to_screen_name, User user, Coordinates coordinates, Place place, String contributors, boolean is_quote_status, int quote_count, int reply_count, int retweet_count, int favorite_count, TwitterEntity entities, TwitterExtendedEntity extended_entities, boolean favorited, boolean retweeted, boolean possibly_sensitive, String filter_level, String lang, String timestamp_ms) {
        this.created_at = created_at;
        this.id = id;
        this.id_str = id_str;
        this.text = text;
        this.source = source;
        this.truncated = truncated;
        this.in_reply_to_status_id = in_reply_to_status_id;
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
        this.in_reply_to_user_id = in_reply_to_user_id;
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
        this.in_reply_to_screen_name = in_reply_to_screen_name;
        this.user = user;

        this.coordinates = coordinates;
        this.place = place;
        this.contributors = contributors;
        this.is_quote_status = is_quote_status;
        this.quote_count = quote_count;
        this.reply_count = reply_count;
        this.retweet_count = retweet_count;
        this.favorite_count = favorite_count;
        this.entities = entities;
        this.extended_entities = extended_entities;
        this.favorited = favorited;
        this.retweeted = retweeted;
        this.possibly_sensitive = possibly_sensitive;
        this.filter_level = filter_level;
        this.lang = lang;
        this.timestamp_ms = timestamp_ms;
    }
    public Geo getGeo() {
        return geo;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Tweet setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }


    public Tweet setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }
    public String getCreated_at() {
        return created_at;
    }

    public Tweet setCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
    }

    public String getId() {
        return id;
    }

    public Tweet setId(String id) {
        this.id = id;
        return this;
    }

    public String getId_str() {
        return id_str;
    }

    public Tweet setId_str(String id_str) {
        this.id_str = id_str;
        return this;
    }

    public String getText() {
        return text;
    }

    public Tweet setText(String text) {
        this.text = text;
        return this;
    }

    public String getSource() {
        return source;
    }

    public Tweet setSource(String source) {
        this.source = source;
        return this;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public Tweet setTruncated(boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    public String getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    public Tweet setIn_reply_to_status_id(String in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
        return this;
    }

    public String getIn_reply_to_status_id_str() {
        return in_reply_to_status_id_str;
    }

    public Tweet setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
        return this;
    }

    public String getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public Tweet setIn_reply_to_user_id(String in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
        return this;
    }

    public String getIn_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    public Tweet setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
        return this;
    }

    public String getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    public Tweet setIn_reply_to_screen_name(String in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Tweet setUser(User user) {
        this.user = user;
        return this;
    }




    public Place getPlace() {
        return place;
    }

    public Tweet setPlace(Place place) {
        this.place = place;
        return this;
    }

    public String getContributors() {
        return contributors;
    }

    public Tweet setContributors(String contributors) {
        this.contributors = contributors;
        return this;
    }

    public boolean isIs_quote_status() {
        return is_quote_status;
    }

    public Tweet setIs_quote_status(boolean is_quote_status) {
        this.is_quote_status = is_quote_status;
        return this;
    }

    public int getQuote_count() {
        return quote_count;
    }

    public Tweet setQuote_count(int quote_count) {
        this.quote_count = quote_count;
        return this;
    }

    public int getReply_count() {
        return reply_count;
    }

    public Tweet setReply_count(int reply_count) {
        this.reply_count = reply_count;
        return this;
    }

    public int getRetweet_count() {
        return retweet_count;
    }

    public Tweet setRetweet_count(int retweet_count) {
        this.retweet_count = retweet_count;
        return this;
    }

    public int getFavorite_count() {
        return favorite_count;
    }

    public Tweet setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;
        return this;
    }

    public TwitterEntity getEntities() {
        return entities;
    }

    public Tweet setEntities(TwitterEntity entities) {
        this.entities = entities;
        return this;
    }

    public TwitterExtendedEntity getExtended_entities() {
        return extended_entities;
    }

    public Tweet setExtended_entities(TwitterExtendedEntity extended_entities) {
        this.extended_entities = extended_entities;
        return this;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public Tweet setFavorited(boolean favorited) {
        this.favorited = favorited;
        return this;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public Tweet setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
        return this;
    }

    public boolean isPossibly_sensitive() {
        return possibly_sensitive;
    }

    public Tweet setPossibly_sensitive(boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
        return this;
    }

    public String getFilter_level() {
        return filter_level;
    }

    public Tweet setFilter_level(String filter_level) {
        this.filter_level = filter_level;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public Tweet setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getTimestamp_ms() {
        return timestamp_ms;
    }

    public Tweet setTimestamp_ms(String timestamp_ms) {
        this.timestamp_ms = timestamp_ms;
        return this;
    }
    @Override
    public String toString() {
        return "Tweet{" +
                "created_at='" + created_at + '\'' +
                ", id='" + id + '\'' +
                ", id_str='" + id_str + '\'' +
                ", text='" + text + '\'' +
                ", source='" + source + '\'' +
                ", truncated=" + truncated +
                ", in_reply_to_status_id='" + in_reply_to_status_id + '\'' +
                ", in_reply_to_status_id_str='" + in_reply_to_status_id_str + '\'' +
                ", in_reply_to_user_id='" + in_reply_to_user_id + '\'' +
                ", in_reply_to_user_id_str='" + in_reply_to_user_id_str + '\'' +
                ", in_reply_to_screen_name='" + in_reply_to_screen_name + '\'' +
                ", user=" + user +
                ", geo=" + geo +
                ", coordinates='" + coordinates + '\'' +
                ", place=" + place +
                ", contributors='" + contributors + '\'' +
                ", is_quote_status=" + is_quote_status +
                ", quote_count=" + quote_count +
                ", reply_count=" + reply_count +
                ", retweet_count=" + retweet_count +
                ", favorite_count=" + favorite_count +
                ", entities=" + entities +
                ", extended_entities=" + extended_entities +
                ", favorited=" + favorited +
                ", retweeted=" + retweeted +
                ", possibly_sensitive=" + possibly_sensitive +
                ", filter_level='" + filter_level + '\'' +
                ", lang='" + lang + '\'' +
                ", timestamp_ms='" + timestamp_ms + '\'' +
                '}';
    }


}
