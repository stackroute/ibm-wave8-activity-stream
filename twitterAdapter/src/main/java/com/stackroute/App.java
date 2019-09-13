
package com.stackroute;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.stackroute.credentials.TwitterConst;
import com.stackroute.model.Tweet;
import com.stackroute.service.TweetStreamRunner;
import com.stackroute.service.UpstreamPublishService;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.IOException;
public class App
{
    static int i=0;
    static int PROCESS_LIMIT=5;
    public static void process(String rawJSON) {

        i++;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
            mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
            mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

            Tweet tweet = mapper.readValue(rawJSON, Tweet.class);
            if(tweet.getLang().equals("en")){
                UpstreamPublishService upstreamPublishService=new UpstreamPublishService();
                upstreamPublishService.send(tweet);
            System.out.println(rawJSON);}
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        TweetStreamRunner tweetStreamRunner=new TweetStreamRunner();
        TwitterStream twitterStream=tweetStreamRunner.stream();
        twitterStream.addListener(new RawStreamListener() {

            @Override
            public void onMessage(String rawJSON) {
                if (rawJSON.startsWith("{\"created_at\"")) {
                    process(rawJSON);
                }
            }

            @Override
            public void onException(Exception ex) {
                System.out.println("onException: ");
                ex.printStackTrace();
            }
        });

        twitterStream.sample();

    }
}

/*twitterStream.addListener(new RawStreamListener() {

                @Override
                public void onMessage(String rawJSON) {

                    if (rawJSON.startsWith("{\"created_at\"")) {
                        process(rawJSON);
                    }
                }

                @Override
                public void onException(Exception ex) {
                    System.out.println("onException: ");
                    ex.printStackTrace();
                }
            });

            twitterStream.sample();
*/
