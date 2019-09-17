package com.stackroute.politicalDomain.listener;

import com.stackroute.politicalDomain.domain.DomainGenerator;
import com.stackroute.politicalDomain.model.AnalyzedActivityTweet;
import com.stackroute.politicalDomain.model.PoliticalDomainActivityTweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private int NEGATIVE;
    private int NEUTRAL;
    private int POSITIVE;
    @Autowired
    private KafkaTemplate<String, PoliticalDomainActivityTweet> kafkaTemplate;
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate2;

    @KafkaListener(topics = "tweet4", groupId = "group_id")
    public void consume(AnalyzedActivityTweet message){

        System.out.println("Analyzed data:-   "+message);
        DomainGenerator domainGenerator=new DomainGenerator();
        String domain = domainGenerator.findDomain(message);
        System.out.println("Domain data:-   "+ domain);

        double score=message.getSentimentResult().getSentimentScore();
        PoliticalDomainActivityTweet politicalDomainActivityTweet=new PoliticalDomainActivityTweet();
        politicalDomainActivityTweet.setActor(message.getActor());
        politicalDomainActivityTweet.setVerb(message.getVerb());
        politicalDomainActivityTweet.setContent(message.getContent());
        politicalDomainActivityTweet.setObject(message.getObject());
        politicalDomainActivityTweet.setSentimentResult(message.getSentimentResult());
        politicalDomainActivityTweet.setTimeStamp(message.getTimeStamp());
        politicalDomainActivityTweet.setUuid(message.getUuid());
        politicalDomainActivityTweet.setDomain(domain);
        kafkaTemplate.send("ibmtweet",politicalDomainActivityTweet);
        kafkaTemplate.send("socket",politicalDomainActivityTweet);
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
