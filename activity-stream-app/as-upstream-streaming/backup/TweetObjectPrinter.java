package com.stackroute.service;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.stackroute.config.TwitterConfig;
import com.stackroute.model.Tweet;
import twitter4j.RawStreamListener;
import twitter4j.TwitterStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TweetObjectPrinter {

    public static List<Tweet> list=new ArrayList<>();
    public static int i=0;
    public static List<Tweet> tweetList=new ArrayList<>();
    private static long PROCESS_LIMIT = 0;

    public static void process(String rawJSON) {

        PROCESS_LIMIT++;

        //if (PROCESS_LIMIT > 10) return;
        //	System.out.println("----------------------------------------------------------------");
        //	System.out.println(rawJSON);
        try {
            ObjectMapper mapper = new ObjectMapper();
            //	System.out.println(rawJSON);
            Tweet tweet = mapper.readValue(rawJSON, Tweet.class);
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
            mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
            mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);


            if(true){

                tweetList.add(tweet);
             //   System.out.println(tweet);
           //     System.out.println(tweetList);
                if(tweetList.size()==10)
                    return; // tweetList;
             //  System.out.println(tweetList.size());
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //	System.out.println("----------------------------------------------------------------");
        return;
    }

    public void testStreamTweetObjects()
    {
        streamAndTestTweetObjects();
    }

    public void streamAndTestTweetObjects()
    {
        try {

            TwitterStream twitterStream = TwitterConfig.getTwitterStreamInstance();

            twitterStream.addListener(new RawStreamListener() {

                @Override
                public void onMessage(String rawJSON) {

                    //if(rawJSON.contains("Kashmir")) {

//					download_limit++;

                    if (rawJSON.startsWith("{\"created_at\"")) {
                        process(rawJSON);

                        if (list.size()==10)
                        {
                            twitterStream.clearListeners();
//                             new TwitterMicroserviceApplication().setTweets(list);
                        }
                    }
                    //	}

                }

                @Override
                public void onException(Exception ex) {
                    System.out.println("onException: ");
                    ex.printStackTrace();
                }
            });

            twitterStream.sample();
//	        twitterStream.filter(arg0);
        } catch (Exception e) {
            System.out.println("main Exception e: " + e);
            e.printStackTrace();
        }

        System.out.println(list);
    }

    public void streamTweetObjects(boolean isTest)
    {

    }

    private void printTweetObjects()
    {
       // SpringApplication.run(TwitterMicroserviceApplication.class);
        try {
            TwitterStream twitterStream = TwitterConfig.getTwitterStreamInstance();

            twitterStream.addListener(new RawStreamListener() {

                @Override
                public void onMessage(String rawJSON) {
                    //if(rawJSON.contains("Kashmir")) {

//					download_limit++;
//					System.out.println("****************** download_limit " + download_limit);

                    if (rawJSON.startsWith("{\"created_at\"")) {
//						System.out.println("*****************************************");
//						System.out.println(rawJSON);
//						System.out.println("*****************************************");
                        process(rawJSON);
                    }
                    //	}

                }

                @Override
                public void onException(Exception ex) {
                    System.out.println("onException: ");
                    ex.printStackTrace();
                }
            });
            twitterStream.sample();
//	        twitterStream.filter(arg0);
        } catch (Exception e) {
            System.out.println("main Exception e: " + e);
            e.printStackTrace();
        }

    }
    }

