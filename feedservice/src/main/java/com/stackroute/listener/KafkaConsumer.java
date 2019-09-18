package  com.stackroute.listener;
import com.stackroute.model.ActivityTweet;
import com.stackroute.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.messaging.simp.SimpMessagingTemplate;
@Service
public class KafkaConsumer {
    @Autowired
    private FeedService service;

    @Autowired
    SimpMessagingTemplate template;

    ActivityTweet activityTweetNew=new ActivityTweet();
    ActivityTweet activityTweetOther=new ActivityTweet();

    @KafkaListener(topics = "tweet78")
    public void consume(ActivityTweet activityTweet) {
        System.out.println(activityTweet + "From the tweet78");
        try {
//            ObjectMapper mapper = new ObjectMapper();
//            Tweet t = mapper.readValue(activityTweet, Tweet.class);
            //System.out.println("------------------ Consumed message: " + activityTweet);
            activityTweetNew=service.save(activityTweet);
         template.convertAndSend("/topic/user", activityTweetNew);

//            System.out.println(activityTweetNew);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    @KafkaListener(topics = "tweet69")
    public void consumer(ActivityTweet activityTweet) {
        System.out.println(activityTweet + "From tweet69");
        try {
//            ObjectMapper mapper = new ObjectMapper();
//            Tweet t = mapper.readValue(activityTweet, Tweet.class);
            //System.out.println("------------------ Consumed message: " + activityTweet);
            activityTweetOther=service.save(activityTweet);

            template.convertAndSend("/topic/user1", activityTweetOther);
//            System.out.println(activityTweetNew);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
/*
   @KafkaListener(topics = "Kafka_Example_json", group = "group_json",
           containerFactory = "userKafkaListenerFactory")
   public void consumeJson(User user) {
       System.out.println("Consumed JSON Message: " + user);
   }*/
}