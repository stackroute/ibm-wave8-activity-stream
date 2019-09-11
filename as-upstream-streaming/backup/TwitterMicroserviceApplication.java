package com.stackroute;
import com.stackroute.model.Tweet;
import com.stackroute.service.TweetStreamRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TwitterMicroserviceApplication {
	public List<Tweet> getTweets() {
		return tweets;
	}

	KafkaTemplate<String,Tweet> kafkaTemplate;

	private static final String TOPIC="tweet";

	List<Tweet> tweets=new ArrayList<>();

	public TwitterMicroserviceApplication setTweets(List<Tweet> tweets) {

	//	System.out.println(tweets);
		for (Tweet tweet :tweets) {

			System.out.println("new Tweet:-"+tweet);
			kafkaTemplate.send(TOPIC,tweet);

		}
		this.tweets = tweets;
		return this;
	}

	//	private static long download_limit = 0;
	private static long PROCESS_LIMIT = 0;

	public static void main(String[] args) {
		SpringApplication.run(TwitterMicroserviceApplication.class,args);
		TweetStreamRunner.stream();
	//	System.out.println(list.size());
	}
}

