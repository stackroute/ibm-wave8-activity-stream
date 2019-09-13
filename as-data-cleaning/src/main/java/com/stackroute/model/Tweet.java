package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class Tweet {
    //@Column("created_at")
    private String created_at;
    //@PrimaryKey
    //@Column("id")
    private String id;
    //@Column("id_str")
    private String id_str;
  //  @Column("text")
    private String text;
   // @Column("source")
    private String source;
    //@Column("truncated")
    private boolean truncated;
  //  @Column("in_reply_to_status_id")
    private String in_reply_to_status_id;
  //  @Column("in_reply_to_status_id_str")
    private String in_reply_to_status_id_str;
  //  @Column("in_reply_to_user_id")
    private String in_reply_to_user_id;
   // @Column("in_reply_to_user_id_str")
    private String in_reply_to_user_id_str;
  //  @Column("in_reply_to_screen_name")
    private String in_reply_to_screen_name;
   // @Column("user")
    private User user;
   // @Column("geo")
    private Geo geo;
   /*@Column("coordinates")
    private Coordinates coordinates;*/
  /*  @Column("place")
    private Place place;*/
   // @Column("contributors")
    private String contributors;
   // @Column("is_quote_status")
    private boolean is_quote_status;
   // @Column("quote_count")
    private int quote_count;
   // @Column("reply_count")
    private int reply_count;
    //@Column("retweet_count")
    private int retweet_count;
   // @Column("favorite_count")
    private int favorite_count;
    /*@Column("entities")
    private TwitterEntity entities;*/
    /*@Column("extended_entities")
    private TwitterExtendedEntity extended_entities;*/
  //  @Column("favorited")
    private boolean favorited;
 //   @Column("retweeted")
    private boolean retweeted;
  //  @Column("possibly_sensitive")
    private boolean possibly_sensitive;
  //  @Column("filter_level")
    private String filter_level;
  //  @Column("lang")
    private String lang;
   // @Column("timestamp_ms")
    private String timestamp_ms;
}
