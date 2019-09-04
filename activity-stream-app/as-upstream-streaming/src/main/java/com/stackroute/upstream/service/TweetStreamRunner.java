package com.stackroute.upstream.service;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.stackroute.upstream.config.TwitterConfig;
import com.stackroute.upstream.model.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.RawStreamListener;
import twitter4j.TwitterStream;

import java.io.IOException;

@Service
public class TweetStreamRunner {

    public static int i = 0;
    private final static int PROCESS_LIMIT = 5;

//    @Autowired
//    private static KafkaTemplate<String, String> kafkaTemplate;
//
    @Autowired
    private UpstreamPublishService upstreamPublishService;

//    public TweetStreamRunner() {
//
//    }
//
//    public TweetStreamRunner(UpstreamPublishService upstreamPublishService) {
//        this.upstreamPublishService = upstreamPublishService;
//    }

    private void process(String rawJSON) {

        i++;
        if(i > PROCESS_LIMIT) return;

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
            mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);

            mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

            Tweet tweet = mapper.readValue(rawJSON, Tweet.class);

           // System.out.println(tweet);
            System.out.println(tweet);
         //  kafkaTemplate.send("tweet",tweet.toString());
//            KafkaService

            System.out.println("***************************************** Sending to KAFKA Sstem");
            System.out.println("--------- response=" + upstreamPublishService.send(tweet));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void stream()
    {
        try {
            TwitterStream twitterStream = TwitterConfig.getTwitterStreamInstance();
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

        } catch (Exception e) {
            System.out.println("main Exception e: " + e);
            e.printStackTrace();
        }
    }

}
