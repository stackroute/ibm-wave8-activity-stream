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

  @Autowired
  KafkaTemplate<String, IBMDomainActivityTweet> kafkaTemplate;

    @KafkaListener(topics = "tweet3", groupId = "group_id")
      public void consume(AnalyzedActivityTweet message){

      System.out.println("Analyzed data:-   "+message);
      DomainGenerator domainGenerator=new DomainGenerator();
      String domain = domainGenerator.findDomain(message);
      System.out.println("Domain data:-   "+ domain);
      IBMDomainActivityTweet ibmDomainActivityTweet=new IBMDomainActivityTweet();
      ibmDomainActivityTweet.setActor(message.getActor());
      ibmDomainActivityTweet.setVerb(message.getVerb());
      ibmDomainActivityTweet.setContent(message.getContent());
      ibmDomainActivityTweet.setObject(message.getObject());
      ibmDomainActivityTweet.setSentimentResult(message.getSentimentResult());
      ibmDomainActivityTweet.setDomain(domain);
      kafkaTemplate.send("ibmtweet",ibmDomainActivityTweet);
    }
}
