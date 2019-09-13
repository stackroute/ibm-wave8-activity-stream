package com.stackroute.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.stackroute.model.User;



@JsonFilter("Userfilter")

public  class User1 extends User {
    public User1() {
        super();
    }


    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public String getId_str() {
        return super.getId_str();
    }

    @Override
    public void setId_str(String id_str) {
        super.setId_str(id_str);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getScreen_name() {
        return super.getScreen_name();
    }

    @Override
    public void setScreen_name(String screen_name) {
        super.setScreen_name(screen_name);
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    @Override
    public String getUrl() {
        return super.getUrl();
    }

    @Override
    public void setUrl(String url) {
        super.setUrl(url);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public String getTranslator_type() {
        return super.getTranslator_type();
    }

    @Override
    public void setTranslator_type(String translator_type) {
        super.setTranslator_type(translator_type);
    }

    @Override
    public boolean isVerified() {
        return super.isVerified();
    }

    @Override
    public void setVerified(boolean verified) {
        super.setVerified(verified);
    }

    @Override
    public int getFollowers_count() {
        return super.getFollowers_count();
    }

    @Override
    public void setFollowers_count(int followers_count) {
        super.setFollowers_count(followers_count);
    }

    @Override
    public int getFriends_count() {
        return super.getFriends_count();
    }

    @Override
    public void setFriends_count(int friends_count) {
        super.setFriends_count(friends_count);
    }

    @Override
    public int getListed_count() {
        return super.getListed_count();
    }

    @Override
    public void setListed_count(int listed_count) {
        super.setListed_count(listed_count);
    }

    @Override
    public int getFavourites_count() {
        return super.getFavourites_count();
    }

    @Override
    public void setFavourites_count(int favourites_count) {
        super.setFavourites_count(favourites_count);
    }

    @Override
    public int getStatuses_count() {
        return super.getStatuses_count();
    }

    @Override
    public void setStatuses_count(int statuses_count) {
        super.setStatuses_count(statuses_count);
    }

    @Override
    public String getCreated_at() {
        return super.getCreated_at();
    }

    @Override
    public void setCreated_at(String created_at) {
        super.setCreated_at(created_at);
    }

    @Override
    public String getUtc_offset() {
        return super.getUtc_offset();
    }

    @Override
    public void setUtc_offset(String utc_offset) {
        super.setUtc_offset(utc_offset);
    }

    @Override
    public String getTime_zone() {
        return super.getTime_zone();
    }

    @Override
    public void setTime_zone(String time_zone) {
        super.setTime_zone(time_zone);
    }

    @Override
    public boolean isGeo_enabled() {
        return super.isGeo_enabled();
    }

    @Override
    public void setGeo_enabled(boolean geo_enabled) {
        super.setGeo_enabled(geo_enabled);
    }

    @Override
    public String getLang() {
        return super.getLang();
    }

    @Override
    public void setLang(String lang) {
        super.setLang(lang);
    }

    @Override
    public boolean isContributors_enabled() {
        return super.isContributors_enabled();
    }

    @Override
    public void setContributors_enabled(boolean contributors_enabled) {
        super.setContributors_enabled(contributors_enabled);
    }

    @Override
    public boolean isIs_translator() {
        return super.isIs_translator();
    }

    @Override
    public void setIs_translator(boolean is_translator) {
        super.setIs_translator(is_translator);
    }

    @Override
    public String getProfile_background_color() {
        return super.getProfile_background_color();
    }

    @Override
    public void setProfile_background_color(String profile_background_color) {
        super.setProfile_background_color(profile_background_color);
    }

    @Override
    public String getProfile_background_image_url() {
        return super.getProfile_background_image_url();
    }

    @Override
    public void setProfile_background_image_url(String profile_background_image_url) {
        super.setProfile_background_image_url(profile_background_image_url);
    }

    @Override
    public String getProfile_background_image_url_https() {
        return super.getProfile_background_image_url_https();
    }

    @Override
    public void setProfile_background_image_url_https(String profile_background_image_url_https) {
        super.setProfile_background_image_url_https(profile_background_image_url_https);
    }

    @Override
    public boolean isProfile_background_tile() {
        return super.isProfile_background_tile();
    }

    @Override
    public void setProfile_background_tile(boolean profile_background_tile) {
        super.setProfile_background_tile(profile_background_tile);
    }

    @Override
    public String getProfile_link_color() {
        return super.getProfile_link_color();
    }

    @Override
    public void setProfile_link_color(String profile_link_color) {
        super.setProfile_link_color(profile_link_color);
    }

    @Override
    public String getProfile_sidebar_border_color() {
        return super.getProfile_sidebar_border_color();
    }

    @Override
    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        super.setProfile_sidebar_border_color(profile_sidebar_border_color);
    }

    @Override
    public String getProfile_sidebar_fill_color() {
        return super.getProfile_sidebar_fill_color();
    }

    @Override
    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        super.setProfile_sidebar_fill_color(profile_sidebar_fill_color);
    }

    @Override
    public String getProfile_text_color() {
        return super.getProfile_text_color();
    }

    @Override
    public void setProfile_text_color(String profile_text_color) {
        super.setProfile_text_color(profile_text_color);
    }

    @Override
    public boolean isProfile_use_background_image() {
        return super.isProfile_use_background_image();
    }

    @Override
    public void setProfile_use_background_image(boolean profile_use_background_image) {
        super.setProfile_use_background_image(profile_use_background_image);
    }

    @Override
    public String getProfile_image_url() {
        return super.getProfile_image_url();
    }

    @Override
    public void setProfile_image_url(String profile_image_url) {
        super.setProfile_image_url(profile_image_url);
    }

    @Override
    public String getProfile_image_url_https() {
        return super.getProfile_image_url_https();
    }

    @Override
    public void setProfile_image_url_https(String profile_image_url_https) {
        super.setProfile_image_url_https(profile_image_url_https);
    }

    @Override
    public String getProfile_banner_url() {
        return super.getProfile_banner_url();
    }

    @Override
    public void setProfile_banner_url(String profile_banner_url) {
        super.setProfile_banner_url(profile_banner_url);
    }

    @Override
    public boolean isDefault_profile() {
        return super.isDefault_profile();
    }

    @Override
    public void setDefault_profile(boolean default_profile) {
        super.setDefault_profile(default_profile);
    }

    @Override
    public boolean isDefault_profile_image() {
        return super.isDefault_profile_image();
    }

    @Override
    public void setDefault_profile_image(boolean default_profile_image) {
        super.setDefault_profile_image(default_profile_image);
    }

    @Override
    public String getFollowing() {
        return super.getFollowing();
    }

    @Override
    public void setFollowing(String following) {
        super.setFollowing(following);
    }

    @Override
    public String getFollow_request_sent() {
        return super.getFollow_request_sent();
    }

    @Override
    public void setFollow_request_sent(String follow_request_sent) {
        super.setFollow_request_sent(follow_request_sent);
    }

    @Override
    public String getNotifications() {
        return super.getNotifications();
    }

    @Override
    public void setNotifications(String notifications) {
        super.setNotifications(notifications);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public SimpleFilterProvider userFilter() throws JsonProcessingException {
        SimpleFilterProvider filterProvider=new SimpleFilterProvider();
        filterProvider.addFilter("Userfilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("created_at","name","location","id_str"));
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.setFilterProvider(filterProvider);
        User1 user1=new User1();
        user1.setId(user1.getId());
        user1.setId_str(user1.getId_str());
        user1.setName(user1.getName());
        user1.setScreen_name(user1.getScreen_name());
        user1.setLocation(user1.getLocation());
        user1.setUrl(user1.getUrl());
        user1.setDescription(user1.getDescription());
        user1.setTranslator_type(user1.getTranslator_type());
        user1.setVerified(user1.isVerified());
        user1.setFollowers_count(user1.getFollowers_count());
        user1.setFriends_count(user1.getFriends_count());
        user1.setListed_count(user1.getListed_count());
        user1.setFavourites_count(user1.getFavourites_count());
        user1.setStatuses_count(user1.getStatuses_count());
        user1.setCreated_at(user1.getCreated_at());
        user1.setUtc_offset(user1.getUtc_offset());
        user1.setTime_zone(user1.getTime_zone());
        user1.setGeo_enabled(user1.isGeo_enabled());
        user1.setLang(user1.getLang());
        user1.setContributors_enabled(user1.isContributors_enabled());
        user1.setIs_translator(user1.isIs_translator());
        user1.setProfile_background_color(user1.getProfile_background_color());
        user1.setProfile_background_image_url(user1.getProfile_background_image_url());
        user1.setProfile_background_image_url_https(user1.getProfile_background_image_url());
        user1.setProfile_background_tile(user1.isProfile_background_tile());
        user1.setProfile_link_color(user1.getProfile_link_color());
        user1.setProfile_sidebar_border_color(user1.getProfile_sidebar_border_color());
        user1.setProfile_sidebar_fill_color(user1.getProfile_sidebar_fill_color());
        user1.setProfile_text_color(user1.getProfile_text_color());
        user1.setProfile_use_background_image(user1.isProfile_use_background_image());
        user1.setProfile_image_url(user1.getProfile_image_url());
        user1.setProfile_image_url_https(user1.getProfile_background_image_url_https());
        user1.setProfile_banner_url(user1.getProfile_banner_url());
        user1.setDefault_profile(user1.isDefault_profile());
        user1.setDefault_profile_image(user1.isDefault_profile_image());
        user1.setFollowing(user1.getFollowing());
        user1.setFollow_request_sent(user1.getFollow_request_sent());
        user1.setNotifications(user1.getNotifications());

        String string=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user1);

        System.out.println(string);
        return filterProvider;
    }

}
