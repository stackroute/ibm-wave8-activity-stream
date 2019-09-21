package com.stackroute.upstream.service;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.ibm.common.activitystreams.Activity;
import static  com.ibm.common.activitystreams.Makers.activity;
import static com.ibm.common.activitystreams.Makers.object;


import com.stackroute.service.TweetStreamRunner;
import com.stackroute.upstream.domain.ActivityTweet;
import com.stackroute.upstream.model.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import twitter4j.RawStreamListener;
import twitter4j.TwitterStream;
import java.io.IOException;
import java.util.UUID;

@Service
public class DataFetcher {
    int i=0;
    int PROCESS_LIMIT=5;

    @Autowired
    private KafkaTemplate<String, ActivityTweet> kafkaTemplate;

    private ObjectMapper mapper = new ObjectMapper();


    //    private final static String TOPIC = "tweet";
    public void fetchData(String domain)
    {
        System.out.println(kafkaTemplate);
        TweetStreamRunner tweetStreamRunner=new TweetStreamRunner();
        TwitterStream twitterStream=tweetStreamRunner.stream();
        twitterStream.addListener(new RawStreamListener() {

            @Override
            public void onMessage(String rawJSON) {
                if (rawJSON.startsWith("{\"created_at\"")) {
                    i++;
                    try {
                        ObjectMapper mapper = new ObjectMapper();
                        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
                        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
                        mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
                        Tweet tweet = mapper.readValue(rawJSON, Tweet.class);
                        if(tweet.getLang().equals("en"))
                        {
                            Activity activity =  activity()
                                    .verb("NDA")
                                    .content(tweet.getText())
                                    .object(object("tweet").id(tweet.getId_str()))
                                    .actor(object("person").id(tweet.getUser().getName()).displayName(tweet.getUser().getScreen_name()))
                                    .get();

                            ActivityTweet as_tweet = mapper.readValue(activity.toString(), ActivityTweet.class);
                            UUID uuid=UUID.randomUUID();
                            as_tweet.setUuid(uuid.toString());
                            as_tweet.setTimeStamp(tweet.getTimestamp_ms());
                            if(domain.equals("Politics"))

                                System.out.println("Indiaaaaaaaaaaaaaaaaaaaaaaaa  "+as_tweet.toString());
                            else if(domain.equals("IBM"))
                                System.out.println("Tech companies:- "+as_tweet.toString());


//                          ActivityTweet activityTweet=new ActivityTweet();
//                          activityTweet.setActor(tweet.getUser().getName());
//                          activityTweet.setContent(tweet.getText());
//                          activityTweet.setObject(tweet.getId_str());
//                          activityTweet.setVerb("POST");
////                            System.out.println(activity);
//
                            kafkaTemplate.send("tweet1", as_tweet);
                            kafkaTemplate.send("raw",as_tweet);

//                            System.out.println("}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}");


                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
//                    process(rawJSON);

                }
            }

            @Override
            public void onException(Exception ex) {
                System.out.println("onException: ");
                ex.printStackTrace();
            }
        });

        //FilterQuery tweetFilter=new FilterQuery();


//        twitterStream.filter("India");
        twitterStream.filter(domain);
    }
}
