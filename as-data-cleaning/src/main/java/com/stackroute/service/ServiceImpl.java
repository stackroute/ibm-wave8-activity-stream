package com.stackroute.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.Pipeline;
import com.stackroute.model.ActivityTweet;
import com.stackroute.model.Tweet;
import com.stackroute.model.TweetAfterCleansing;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class ServiceImpl implements CleaningService {







    byte[] bytes;

    @Autowired
    CleaningService cleaningService;


String  newStr="a";
    @Override
    public String  save(ActivityTweet activityTweet) throws IOException {

        ActivityTweet tweetOriginal=activityTweet;
        ActivityTweet tweetFinal=new ActivityTweet();
        ActivityTweet tweetToFilter=new ActivityTweet();
        tweetToFilter=getTweetData(tweetOriginal,tweetFinal);
        String content=tweetToFilter.getContent();
        /*System.out.println("*************activity object content showing*******");
        System.out.println(content);*/
        content=content.replaceAll("[^A-Za-z0-9-_'\":\\s]", "");

        String lemma="";

        String  words=content;

        String newStr="";

        words = Normalizer.normalize(words, Normalizer.Form.NFKD).trim();

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        CoreDocument coreDocument = new CoreDocument(words);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();

        for(CoreLabel coreLabel : coreLabelList) {
            //newStr +=String.valueOf(coreLabel);
            lemma = lemma + coreLabel.lemma()+" ";

        }

        System.out.println("*****showing lemma******");
        System.out.println(lemma);
        TweetAfterCleansing tweetAfterCleansing=new TweetAfterCleansing();

        tweetAfterCleansing.setContent(lemma);

       /* Tweet tweetOriginal = tweet;
        ObjectMapper objectMapper = new ObjectMapper();
        tweetFiltered = getTweetData(tweetOriginal, tweetSnt);
        String textFilter = tweetFiltered.getText();
        textFilter = textFilter.replaceAll("[^A-Za-z0-9-_@#'\":\\s]", "");
        String[] wordsArray = textFilter.split("\\s+");
        String tweetData = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(tweetFiltered);
        // ignoring non-english text
        tweetData = tweetData.replaceAll("[^A-Za-z0-9-_@#'\":\\s]", "");
        System.out.println("tweet ====== " + tweetData);
        *//*System.out.println("list of words");
        for(int i=0;i<words.length;i++)
            System.out.println(words[i]);*//*
        // search(words);
        sendData();
        String tweetText = tweetFiltered.getText();
        tweetText = tweetText.replaceAll("[^A-Za-z0-9-_'\":\\s]", "");
      //  System.out.println(tweetText);

       *//* Pattern pt = Pattern.compile("[^a-zA-Z0-9 ]");
        Matcher match = pt.matcher(tweetText);
        while (match.find()) {
            String s = match.group();
            tweetData = tweetData.replaceAll("\\s", "");
        }*//*
        String lemma="";
        //String words=tweet.getObject().getContent();
       String  words=tweetText;

       String newStr="";

        words = Normalizer.normalize(words, Normalizer.Form.NFKD).trim();

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        CoreDocument coreDocument = new CoreDocument(words);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();
        for(CoreLabel l:coreLabelList)
        System.out.println("out" + l);

        for(CoreLabel coreLabel : coreLabelList) {
            newStr +=String.valueOf(coreLabel);
            //lemma = lemma + coreLabel.lemma()+" ";
            System.out.println("*****know type");
            System.out.println(newStr);
            System.out.println(newStr.getClass().getName());
        }

        System.out.println("showing lemma");
        System.out.println(lemma);
       *//* System.out.println("new Str");
        System.out.println(newStr);*//*
displayLemma();
        return tweetData;*/
return lemma;

    }

   /* @Override
    public Tweet2 produceKafka() {
        //  System.out.println(tweetFiltered);
        return tweetFiltered;
    }

    @Override
    public void displayLemma() {
        System.out.println("newStr");
        System.out.println(newStr);
    }*/

  /*  @Override
    public String searchDictionary() {

        return null;
    }*/

   private static ActivityTweet getTweetData(ActivityTweet tweet, ActivityTweet tweet2) {
      tweet2.setContent(tweet.getContent());

       return tweet2;
   }






}
