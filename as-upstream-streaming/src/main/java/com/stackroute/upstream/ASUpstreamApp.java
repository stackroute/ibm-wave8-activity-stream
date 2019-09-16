package com.stackroute.upstream;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
//import com.stackroute.adapter.IRCService;
//import com.stackroute.model.Tweet;
//import com.stackroute.service.TweetStreamRunner;
import com.stackroute.upstream.domain.MyCustomTweet;
import com.stackroute.upstream.service.DataFetcher;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.messaging.Message;
import twitter4j.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//import static com.stackroute.App.process;

@SpringBootApplication
//@Import({IRCService.class})
public class ASUpstreamApp {

  /*  static int i=0;
    static int PROCESS_LIMIT=5;

    @Autowired
    private static KafkaTemplate<String, Object> kafkaTemplate;

    private final static String TOPIC = "tweet";*/

//    public void process(String rawJSON) {
//        i++;
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//            mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
//            mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
//            mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
//            Tweet tweet = mapper.readValue(rawJSON, Tweet.class);
//            if(tweet.getLang().equals("en"))
//            {
////                System.out.println(tweet);
//                System.out.println(kafkaTemplate.getDefaultTopic());
//                kafkaTemplate.send(TOPIC, tweet);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
    public static void main(String[] args) throws IOException {

        SpringApplication.run(ASUpstreamApp.class,args);
//        SpringApplication.run(IRCService.class,args);

//        IRCService ircService=new IRCService();
//        ircService.getIRC();


//        DataFetcher dataFetcher=new DataFetcher();
//        dataFetcher.fetchData();
       /* TweetStreamRunner tweetStreamRunner=new TweetStreamRunner();
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

                            System.out.println(tweet);
                            System.out.println(kafkaTemplate);
                            kafkaTemplate.send(TOPIC, tweet);

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


        twitterStream.filter("India");*/

    }

}


