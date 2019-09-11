package com.stackroute;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.util.List;

@SpringBootApplication
public class SentimentAnalysis {
    public static void main(String args[]) throws Exception {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("/home/clinton/Videos/ibm-wave8-activity-stream/Sentiment-Analysis-Microservice/src/main/java/com/stackroute/favorite-tweets.txt");

        String text=(String) jsonObject.get("text");

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for(CoreSentence sentence : sentences) {

            String sentiment = sentence.sentiment();

            System.out.println(sentiment + "\t" + sentence);


        }
        SpringApplication.run(SentimentAnalysis.class,args);
    }
    public static Object readJsonSimpleDemo(String fileName) throws Exception{
      FileReader reader = new FileReader(fileName);
      JSONParser jsonParser = new JSONParser();
      return jsonParser.parse(reader);
    }
}
