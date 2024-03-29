package com.stackroute.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class User {

    private long id;
    private String id_str;
    private String name;//": "アニクリペトラの戦士長ドナクリ@なこ信者",
    private String screen_name;//": "glayhisashi626",
    private String location;//": "サンドラたん、ジェシカたんの屋敷",
    private String url;//": null,
    private String description;/*": "サンドラ＆ジェシカ&ミカ使います\nペルソナ1、2罪罰、3(3F)、4、5、Qクリア済  閃の軌跡(1、2)クリア済 テイルズシリーズ全作品クリア済\nゲキタク頑張ってます\nシノアリスはスノウ大好きちゃんです\nドナちょすでYouTubeに動画してます", */
    private String translator_type;//": "none",
    //private boolean protected;//": false,
    private boolean verified;//": false,
    private int followers_count;//": 1305,
    private int friends_count;//": 2143,
    private int listed_count;//": 11,
    private int favourites_count;//": 4834,
    private int statuses_count;//": 13913,
    private String created_at;//": "Sun Sep 28 12:59:08 +0000 2014",
    private String utc_offset;//": null,
    private String time_zone;//": null,
    private boolean geo_enabled;//": false,
    private String lang;//": null,
    private boolean contributors_enabled;//": false,
    private boolean is_translator;//": false,
    private String profile_background_color;//": "C0DEED",
    private String profile_background_image_url;//": "http://abs.twimg.com/images/themes/theme1/bg.png",
    private String profile_background_image_url_https;//": "https://abs.twimg.com/images/themes/theme1/bg.png",
    private boolean profile_background_tile;//": false,
    private String profile_link_color;//": "1DA1F2",
    private String profile_sidebar_border_color;//": "C0DEED",
    private String profile_sidebar_fill_color;//": "DDEEF6",
    private String profile_text_color;//": "333333",
    private boolean profile_use_background_image;//": true,
    private String profile_image_url;//": "http://pbs.twimg.com/profile_images/1160828217227218944/kynCi9ot_normal.jpg",
    private String profile_image_url_https;//": "https://pbs.twimg.com/profile_images/1160828217227218944/kynCi9ot_normal.jpg",
    private String profile_banner_url;//": "https://pbs.twimg.com/profile_banners/2835026580/1565600373",
    private boolean default_profile;//": true,
    private boolean default_profile_image;//": false,
    private String following;//": null,
    private String follow_request_sent;//": null,
    private String notifications;//": null

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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getScreen_name() {
        return screen_name;
    }
    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTranslator_type() {
        return translator_type;
    }
    public void setTranslator_type(String translator_type) {
        this.translator_type = translator_type;
    }
    public boolean isVerified() {
        return verified;
    }
    public void setVerified(boolean verified) {
        this.verified = verified;
    }
    public int getFollowers_count() {
        return followers_count;
    }
    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }
    public int getFriends_count() {
        return friends_count;
    }
    public void setFriends_count(int friends_count) {
        this.friends_count = friends_count;
    }
    public int getListed_count() {
        return listed_count;
    }
    public void setListed_count(int listed_count) {
        this.listed_count = listed_count;
    }
    public int getFavourites_count() {
        return favourites_count;
    }
    public void setFavourites_count(int favourites_count) {
        this.favourites_count = favourites_count;
    }
    public int getStatuses_count() {
        return statuses_count;
    }
    public void setStatuses_count(int statuses_count) {
        this.statuses_count = statuses_count;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public String getUtc_offset() {
        return utc_offset;
    }
    public void setUtc_offset(String utc_offset) {
        this.utc_offset = utc_offset;
    }
    public String getTime_zone() {
        return time_zone;
    }
    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }
    public boolean isGeo_enabled() {
        return geo_enabled;
    }
    public void setGeo_enabled(boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }
    public boolean isContributors_enabled() {
        return contributors_enabled;
    }
    public void setContributors_enabled(boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
    }
    public boolean isIs_translator() {
        return is_translator;
    }
    public void setIs_translator(boolean is_translator) {
        this.is_translator = is_translator;
    }
    public String getProfile_background_color() {
        return profile_background_color;
    }
    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }
    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }
    public void setProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }
    public String getProfile_background_image_url_https() {
        return profile_background_image_url_https;
    }
    public void setProfile_background_image_url_https(String profile_background_image_url_https) {
        this.profile_background_image_url_https = profile_background_image_url_https;
    }
    public boolean isProfile_background_tile() {
        return profile_background_tile;
    }
    public void setProfile_background_tile(boolean profile_background_tile) {
        this.profile_background_tile = profile_background_tile;
    }
    public String getProfile_link_color() {
        return profile_link_color;
    }
    public void setProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
    }
    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }
    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }
    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }
    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
    }
    public String getProfile_text_color() {
        return profile_text_color;
    }
    public void setProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
    }
    public boolean isProfile_use_background_image() {
        return profile_use_background_image;
    }
    public void setProfile_use_background_image(boolean profile_use_background_image) {
        this.profile_use_background_image = profile_use_background_image;
    }
    public String getProfile_image_url() {
        return profile_image_url;
    }
    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }
    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }
    public void setProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
    }
    public String getProfile_banner_url() {
        return profile_banner_url;
    }
    public void setProfile_banner_url(String profile_banner_url) {
        this.profile_banner_url = profile_banner_url;
    }
    public boolean isDefault_profile() {
        return default_profile;
    }
    public void setDefault_profile(boolean default_profile) {
        this.default_profile = default_profile;
    }
    public boolean isDefault_profile_image() {
        return default_profile_image;
    }
    public void setDefault_profile_image(boolean default_profile_image) {
        this.default_profile_image = default_profile_image;
    }
    public String getFollowing() {
        return following;
    }
    public void setFollowing(String following) {
        this.following = following;
    }
    public String getFollow_request_sent() {
        return follow_request_sent;
    }
    public void setFollow_request_sent(String follow_request_sent) {
        this.follow_request_sent = follow_request_sent;
    }
    public String getNotifications() {
        return notifications;
    }
    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", id_str='" + id_str + '\'' +
                ", name='" + name + '\'' +
                ", screen_name='" + screen_name + '\'' +
                ", location='" + location + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", translator_type='" + translator_type + '\'' +
                ", verified=" + verified +
                ", followers_count=" + followers_count +
                ", friends_count=" + friends_count +
                ", listed_count=" + listed_count +
                ", favourites_count=" + favourites_count +
                ", statuses_count=" + statuses_count +
                ", created_at='" + created_at + '\'' +
                ", utc_offset='" + utc_offset + '\'' +
                ", time_zone='" + time_zone + '\'' +
                ", geo_enabled=" + geo_enabled +
                ", lang='" + lang + '\'' +
                ", contributors_enabled=" + contributors_enabled +
                ", is_translator=" + is_translator +
                ", profile_background_color='" + profile_background_color + '\'' +
                ", profile_background_image_url='" + profile_background_image_url + '\'' +
                ", profile_background_image_url_https='" + profile_background_image_url_https + '\'' +
                ", profile_background_tile=" + profile_background_tile +
                ", profile_link_color='" + profile_link_color + '\'' +
                ", profile_sidebar_border_color='" + profile_sidebar_border_color + '\'' +
                ", profile_sidebar_fill_color='" + profile_sidebar_fill_color + '\'' +
                ", profile_text_color='" + profile_text_color + '\'' +
                ", profile_use_background_image=" + profile_use_background_image +
                ", profile_image_url='" + profile_image_url + '\'' +
                ", profile_image_url_https='" + profile_image_url_https + '\'' +
                ", profile_banner_url='" + profile_banner_url + '\'' +
                ", default_profile=" + default_profile +
                ", default_profile_image=" + default_profile_image +
                ", following='" + following + '\'' +
                ", follow_request_sent='" + follow_request_sent + '\'' +
                ", notifications='" + notifications + '\'' +
                '}';
    }
}
