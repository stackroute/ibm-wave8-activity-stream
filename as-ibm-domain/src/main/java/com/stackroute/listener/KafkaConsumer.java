package com.stackroute.listener;

import com.stackroute.domain.DomainGenerator;
import com.stackroute.model.AnalyzedActivityTweet;
import com.stackroute.model.IBMDomainActivityTweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
  int POSITIVE;
  int NEGATIVE;
  int NEUTRAL;

  @Autowired
  KafkaTemplate<String, IBMDomainActivityTweet> kafkaTemplate;
  @Autowired
  KafkaTemplate<String,String> kafkaTemplate2;

    @KafkaListener(topics = "tweet3", groupId = "group_id")
      public void consume(AnalyzedActivityTweet message){

      System.out.println("Analyzed data:-   "+message);
      DomainGenerator domainGenerator=new DomainGenerator();
      String domain = domainGenerator.findDomain(message);
      double score = message.getSentimentResult().getSentimentScore();
      System.out.println("Domain data:-   "+ domain);
      IBMDomainActivityTweet ibmDomainActivityTweet=new IBMDomainActivityTweet();
      ibmDomainActivityTweet.setTimeStamp(message.getTimeStamp());
      ibmDomainActivityTweet.setUuid(message.getUuid());
      ibmDomainActivityTweet.setActor(message.getActor());
      ibmDomainActivityTweet.setVerb(message.getVerb());
      ibmDomainActivityTweet.setContent(message.getContent());
      ibmDomainActivityTweet.setObject(message.getObject());
      ibmDomainActivityTweet.setSentimentResult(message.getSentimentResult());
      ibmDomainActivityTweet.setDomain(domain);
      kafkaTemplate.send("ibmtweet",ibmDomainActivityTweet);
      if(score<2){
        NEGATIVE++;
      }
      else if (score>2){
        POSITIVE++;
      }
      else{
        NEUTRAL++;
      }
      if(NEGATIVE==5){
        System.out.println("sent for email");
        kafkaTemplate2.send("mail","Alert! "+NEGATIVE+" Negative tweets found");
      }

      System.out.println("Positive"+POSITIVE);
      System.out.println("Negative"+NEGATIVE);
      System.out.println("Neutral"+NEUTRAL);
    }
}
