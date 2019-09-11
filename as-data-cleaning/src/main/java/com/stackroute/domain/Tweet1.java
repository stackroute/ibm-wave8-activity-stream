package com.stackroute.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.stackroute.model.*;

@JsonFilter("tweetFilter")
public class Tweet1 extends Tweet {
    public Tweet1() {
        super();
    }

    public Tweet1(String created_at, String id, String id_str, String text, String source, boolean truncated, String in_reply_to_status_id, String in_reply_to_status_id_str, String in_reply_to_user_id, String in_reply_to_user_id_str, String in_reply_to_screen_name, User user, Coordinates coordinates, Place place, String contributors, boolean is_quote_status, int quote_count, int reply_count, int retweet_count, int favorite_count, TwitterEntity entities, TwitterExtendedEntity extended_entities, boolean favorited, boolean retweeted, boolean possibly_sensitive, String filter_level, String lang, String timestamp_ms) {
        super(created_at, id, id_str, text, source, truncated, in_reply_to_status_id, in_reply_to_status_id_str, in_reply_to_user_id, in_reply_to_user_id_str, in_reply_to_screen_name, user, coordinates, place, contributors, is_quote_status, quote_count, reply_count, retweet_count, favorite_count, entities, extended_entities, favorited, retweeted, possibly_sensitive, filter_level, lang, timestamp_ms);
    }

    @Override
    public Geo getGeo() {
        return super.getGeo();
    }

    @Override
    public Coordinates getCoordinates() {
        return super.getCoordinates();
    }

    @Override
    public Tweet setCoordinates(Coordinates coordinates) {
        return super.setCoordinates(coordinates);
    }

    @Override
    public Tweet setGeo(Geo geo) {
        return super.setGeo(geo);
    }

    @Override
    public String getCreated_at() {
        return super.getCreated_at();
    }

    @Override
    public Tweet setCreated_at(String created_at) {
        return super.setCreated_at(created_at);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public Tweet setId(String id) {
        return super.setId(id);
    }

    @Override
    public String getId_str() {
        return super.getId_str();
    }

    @Override
    public Tweet setId_str(String id_str) {
        return super.setId_str(id_str);
    }

    @Override
    public String getText() {
        return super.getText();
    }

    @Override
    public Tweet setText(String text) {
        return super.setText(text);
    }

    @Override
    public String getSource() {
        return super.getSource();
    }

    @Override
    public Tweet setSource(String source) {
        return super.setSource(source);
    }

    @Override
    public boolean isTruncated() {
        return super.isTruncated();
    }

    @Override
    public Tweet setTruncated(boolean truncated) {
        return super.setTruncated(truncated);
    }

    @Override
    public String getIn_reply_to_status_id() {
        return super.getIn_reply_to_status_id();
    }

    @Override
    public Tweet setIn_reply_to_status_id(String in_reply_to_status_id) {
        return super.setIn_reply_to_status_id(in_reply_to_status_id);
    }

    @Override
    public String getIn_reply_to_status_id_str() {
        return super.getIn_reply_to_status_id_str();
    }

    @Override
    public Tweet setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
        return super.setIn_reply_to_status_id_str(in_reply_to_status_id_str);
    }

    @Override
    public String getIn_reply_to_user_id() {
        return super.getIn_reply_to_user_id();
    }

    @Override
    public Tweet setIn_reply_to_user_id(String in_reply_to_user_id) {
        return super.setIn_reply_to_user_id(in_reply_to_user_id);
    }

    @Override
    public String getIn_reply_to_user_id_str() {
        return super.getIn_reply_to_user_id_str();
    }

    @Override
    public Tweet setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
        return super.setIn_reply_to_user_id_str(in_reply_to_user_id_str);
    }

    @Override
    public String getIn_reply_to_screen_name() {
        return super.getIn_reply_to_screen_name();
    }

    @Override
    public Tweet setIn_reply_to_screen_name(String in_reply_to_screen_name) {
        return super.setIn_reply_to_screen_name(in_reply_to_screen_name);
    }

    @Override
    public User getUser() {
        return super.getUser();
    }

    @Override
    public Tweet setUser(User user) {
        return super.setUser(user);
    }

    @Override
    public Place getPlace() {
        return super.getPlace();
    }

    @Override
    public Tweet setPlace(Place place) {
        return super.setPlace(place);
    }

    @Override
    public String getContributors() {
        return super.getContributors();
    }

    @Override
    public Tweet setContributors(String contributors) {
        return super.setContributors(contributors);
    }

    @Override
    public boolean isIs_quote_status() {
        return super.isIs_quote_status();
    }

    @Override
    public Tweet setIs_quote_status(boolean is_quote_status) {
        return super.setIs_quote_status(is_quote_status);
    }

    @Override
    public int getQuote_count() {
        return super.getQuote_count();
    }

    @Override
    public Tweet setQuote_count(int quote_count) {
        return super.setQuote_count(quote_count);
    }

    @Override
    public int getReply_count() {
        return super.getReply_count();
    }

    @Override
    public Tweet setReply_count(int reply_count) {
        return super.setReply_count(reply_count);
    }

    @Override
    public int getRetweet_count() {
        return super.getRetweet_count();
    }

    @Override
    public Tweet setRetweet_count(int retweet_count) {
        return super.setRetweet_count(retweet_count);
    }

    @Override
    public int getFavorite_count() {
        return super.getFavorite_count();
    }

    @Override
    public Tweet setFavorite_count(int favorite_count) {
        return super.setFavorite_count(favorite_count);
    }

    @Override
    public TwitterEntity getEntities() {
        return super.getEntities();
    }

    @Override
    public Tweet setEntities(TwitterEntity entities) {
        return super.setEntities(entities);
    }

    @Override
    public TwitterExtendedEntity getExtended_entities() {
        return super.getExtended_entities();
    }

    @Override
    public Tweet setExtended_entities(TwitterExtendedEntity extended_entities) {
        return super.setExtended_entities(extended_entities);
    }

    @Override
    public boolean isFavorited() {
        return super.isFavorited();
    }

    @Override
    public Tweet setFavorited(boolean favorited) {
        return super.setFavorited(favorited);
    }

    @Override
    public boolean isRetweeted() {
        return super.isRetweeted();
    }

    @Override
    public Tweet setRetweeted(boolean retweeted) {
        return super.setRetweeted(retweeted);
    }

    @Override
    public boolean isPossibly_sensitive() {
        return super.isPossibly_sensitive();
    }

    @Override
    public Tweet setPossibly_sensitive(boolean possibly_sensitive) {
        return super.setPossibly_sensitive(possibly_sensitive);
    }

    @Override
    public String getFilter_level() {
        return super.getFilter_level();
    }

    @Override
    public Tweet setFilter_level(String filter_level) {
        return super.setFilter_level(filter_level);
    }

    @Override
    public String getLang() {
        return super.getLang();
    }

    @Override
    public Tweet setLang(String lang) {
        return super.setLang(lang);
    }

    @Override
    public String getTimestamp_ms() {
        return super.getTimestamp_ms();
    }

    @Override
    public Tweet setTimestamp_ms(String timestamp_ms) {
        return super.setTimestamp_ms(timestamp_ms);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public SimpleFilterProvider tweetFilter() throws JsonProcessingException {
        SimpleFilterProvider filterProvider=new SimpleFilterProvider();
        filterProvider.addFilter("tweetFilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("created_at","id_str","text"));
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.setFilterProvider(filterProvider);
        Tweet1 tweet1=new Tweet1();
        tweet1.setCreated_at(tweet1.getCreated_at());
        tweet1.setId(tweet1.getId());
        tweet1.setId_str(tweet1.getId_str());
        tweet1.setText(tweet1.getText());
        tweet1.setSource(tweet1.getSource());
        tweet1.setTruncated(tweet1.isTruncated());
        tweet1.setIn_reply_to_status_id(tweet1.getIn_reply_to_status_id());
        tweet1.setIn_reply_to_status_id_str(tweet1.getIn_reply_to_status_id_str());
        tweet1.setIn_reply_to_user_id(tweet1.getIn_reply_to_user_id());
        tweet1.setIn_reply_to_user_id_str(tweet1.getIn_reply_to_user_id_str());
        tweet1.setIn_reply_to_screen_name(tweet1.getIn_reply_to_screen_name());
        tweet1.setUser(tweet1.getUser());
        tweet1.setGeo(tweet1.getGeo());
        tweet1.setCoordinates(tweet1.getCoordinates());
        tweet1.setPlace(tweet1.getPlace());
        tweet1.setContributors(tweet1.getContributors());
        tweet1.setIs_quote_status(tweet1.isIs_quote_status());
        tweet1.setQuote_count(tweet1.getQuote_count());
        tweet1.setReply_count(tweet1.getReply_count());
        tweet1.setRetweet_count(tweet1.getRetweet_count());
        tweet1.setFavorite_count(tweet1.getFavorite_count());
        tweet1.setEntities(tweet1.getEntities());
        tweet1.setExtended_entities(tweet1.getExtended_entities());
        tweet1.setFavorited(tweet1.isFavorited());
        tweet1.setRetweeted(tweet1.isRetweeted());
        tweet1.setPossibly_sensitive(tweet1.isPossibly_sensitive());
        tweet1.setFilter_level(tweet1.getFilter_level());
        tweet1.setLang(tweet1.getLang());
        tweet1.setTimestamp_ms(tweet1.getTimestamp_ms());
        String string=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(tweet1);

        System.out.println(string);
      return filterProvider;
    }
}
