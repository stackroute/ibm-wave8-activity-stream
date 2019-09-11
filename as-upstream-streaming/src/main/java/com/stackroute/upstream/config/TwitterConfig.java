package com.stackroute.upstream.config;

import com.stackroute.upstream.credentials.TwitterConst;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterConfig {


  public static TwitterStream getTwitterStreamInstance() throws Exception {
    try {
      ConfigurationBuilder cb = new ConfigurationBuilder();
      cb.setDebugEnabled(true)
        .setOAuthConsumerKey(TwitterConst.CONSUMER_KEY)
        .setOAuthConsumerSecret(TwitterConst.CONSUMER_SECRET)
        .setOAuthAccessToken(TwitterConst.ACCESS_TOKEN)
        .setOAuthAccessTokenSecret(TwitterConst.ACCESS_TOKEN_SECRET);

      TwitterStreamFactory tf = new TwitterStreamFactory(cb.build());
      return tf.getInstance();
    } catch (Exception e) {
      System.out.println("getTwitterStreamInstance: Exception e");
      e.printStackTrace();
      throw e;
    }
  }
}
