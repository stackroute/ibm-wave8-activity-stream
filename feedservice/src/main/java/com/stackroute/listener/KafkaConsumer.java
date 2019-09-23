package com.stackroute.listener;
import com.stackroute.model.ActivityTweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.messaging.simp.SimpMessagingTemplate;
@Service
public class KafkaConsumer {

    @Autowired
    SimpMessagingTemplate template;

    @KafkaListener(topics = "socket")
    public void consume(ActivityTweet activityTweet) {
        try {
	System.out.println("------------------ Consumed message:******************* " + activityTweet);
               if(activityTweet.getDomain().equals("Political") || activityTweet.getDomain().equals("Politics") ) {
                   template.convertAndSend("/topic/PoliticalDomainNda", activityTweet);
               }
               else if(activityTweet.getDomain().equals("Organisation")|| activityTweet.getDomain().equals("IBM")){
                   template.convertAndSend("/topic/OrganizationDomainIbm",activityTweet);
               }
         template.convertAndSend("/topic/user", activityTweet);

        }catch(Exception e) {
            e.printStackTrace();
        }

    }

}
