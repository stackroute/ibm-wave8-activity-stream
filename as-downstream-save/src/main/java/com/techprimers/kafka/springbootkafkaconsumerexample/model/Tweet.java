package com.techprimers.kafka.springbootkafkaconsumerexample.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeId;
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

    /*
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
    } */

    public Geo getGeo() {
        return geo;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;

    }


    public void setGeo(Geo geo) {
        this.geo = geo;

    }
    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public String getId_str() {
        return id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;

    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;

    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;

    }

    public String getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    public void setIn_reply_to_status_id(String in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;

    }

    public String getIn_reply_to_status_id_str() {
        return in_reply_to_status_id_str;
    }

    public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;

    }

    public String getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public void setIn_reply_to_user_id(String in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;

    }

    public String getIn_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;

    }

    public String getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;

    }




    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;

    }

    public String getContributors() {
        return contributors;
    }

    public void setContributors(String contributors) {
        this.contributors = contributors;

    }

    public boolean isIs_quote_status() {
        return is_quote_status;
    }

    public void setIs_quote_status(boolean is_quote_status) {
        this.is_quote_status = is_quote_status;

    }

    public int getQuote_count() {
        return quote_count;
    }

    public void setQuote_count(int quote_count) {
        this.quote_count = quote_count;

    }

    public int getReply_count() {
        return reply_count;
    }

    public void setReply_count(int reply_count) {
        this.reply_count = reply_count;

    }

    public int getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(int retweet_count) {
        this.retweet_count = retweet_count;

    }

    public int getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(int favorite_count) {
        this.favorite_count = favorite_count;

    }

    public TwitterEntity getEntities() {
        return entities;
    }

    public void setEntities(TwitterEntity entities) {
        this.entities = entities;

    }

    public TwitterExtendedEntity getExtended_entities() {
        return extended_entities;
    }

    public void setExtended_entities(TwitterExtendedEntity extended_entities) {
        this.extended_entities = extended_entities;

    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;

    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;

    }

    public boolean isPossibly_sensitive() {
        return possibly_sensitive;
    }

    public void setPossibly_sensitive(boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;

    }

    public String getFilter_level() {
        return filter_level;
    }

    public void setFilter_level(String filter_level) {
        this.filter_level = filter_level;

    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;

    }

    public String getTimestamp_ms() {
        return timestamp_ms;
    }

    public void setTimestamp_ms(String timestamp_ms) {
        this.timestamp_ms = timestamp_ms;

    }

    @Override
    public String toString() {
        return "Tweet{" +
                "'created_at':'" + created_at + '\'' +
                ", 'id':'" + id + '\'' +
                ", 'id_str':'" + id_str + '\'' +
                ", 'text':'" + text + '\'' +
                ", 'source':'" + source + '\'' +
                ", 'truncated':" + truncated +
                ", 'in_reply_to_status_id':'" + in_reply_to_status_id + '\'' +
                ", 'in_reply_to_status_id_str':'" + in_reply_to_status_id_str + '\'' +
                ", 'in_reply_to_user_id':'" + in_reply_to_user_id + '\'' +
                ", 'in_reply_to_user_id_str':'" + in_reply_to_user_id_str + '\'' +
                ", 'in_reply_to_screen_name':'" + in_reply_to_screen_name + '\'' +
//                ", 'user':" + user +
                ", 'geo':" + geo +
//                ", 'coordinates':'" + coordinates + '\'' +
//                ", 'place':" + place +
//                ", 'contributors':'" + contributors + '\'' +
                ", 'is_quote_status':" + is_quote_status +
                ", 'quote_count':" + quote_count +
                ", 'reply_count':" + reply_count +
                ", 'retweet_count':" + retweet_count +
                ", 'favorite_count':" + favorite_count +
//                ", 'entities':" + entities +
//                ", 'extended_entities':" + extended_entities +
                ", 'favorited':" + favorited +
                ", 'retweeted':" + retweeted +
                ", 'possibly_sensitive':" + possibly_sensitive +
                ", 'filter_level':'" + filter_level + '\'' +
                ", 'lang':'" + lang + '\'' +
                ", 'timestamp_ms':'" + timestamp_ms + '\'' +
                '}';
    }
}
