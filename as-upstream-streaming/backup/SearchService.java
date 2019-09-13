package com.stackroute.service;

import com.stackroute.credentials.TwitterConst;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class SearchService
{

  public static Twitter getTwitterInstance() throws Exception {
    try {
      ConfigurationBuilder cb = new ConfigurationBuilder();
      cb.setDebugEnabled(true)
        .setOAuthConsumerKey(TwitterConst.CONSUMER_KEY)
        .setOAuthConsumerSecret(TwitterConst.CONSUMER_SECRET)
        .setOAuthAccessToken(TwitterConst.ACCESS_TOKEN)
        .setOAuthAccessTokenSecret(TwitterConst.ACCESS_TOKEN_SECRET);
      TwitterFactory tf = new TwitterFactory(cb.build());
      return tf.getInstance();
    } catch (Exception e) {
      System.out.println("getTwitterinstance: Exception e");
      e.printStackTrace();
      throw e;
    }
  }

  private static final String HASH_TAG = "flood";

  public static void searchTweets() throws TwitterException, Exception  {

    try {
      Twitter twitter = getTwitterInstance();
      Query query = new Query(HASH_TAG).count(100).resultType(Query.ResultType.recent);
      QueryResult result = twitter.search(query);

      List<String> list = result.getTweets().stream()
        .map(item -> item.getText())
        .collect(Collectors.toList());

      System.out.println("Twitter: list = " + list.size());

      for(String s: list)
        System.out.println("Twitter: " + s);

    } catch (TwitterException e) {
      throw e;
    } catch (Exception e) {
      throw e;
    }
  }

 /* public static void userTimeline() throws TwitterException, Exception  {

    try {
      Twitter twitter = getTwitterInstance();
      List<Status> statuses = twitter.getUserTimeline("baeldung");

      System.out.println("Twitter: statuses = " + statuses.size());

      for (Status status : statuses) {
        String fmt = "@" + status.getUser().getScreenName() + " - " + status.getText();
        System.out.println(fmt);
      }

    } catch (TwitterException e) {
      throw e;
    } catch (Exception e) {
      throw e;
    }
  }
*/

  }



