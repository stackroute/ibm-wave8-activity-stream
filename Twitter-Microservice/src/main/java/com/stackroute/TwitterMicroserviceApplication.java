package com.stackroute;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.stackroute.model.Tweet;
import com.stackroute.config.TwitterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import twitter4j.RawStreamListener;
import twitter4j.TwitterStream;

import java.io.IOException;

@SpringBootApplication
public class TwitterMicroserviceApplication {

//	private static long download_limit = 0;
	private static long PROCESS_LIMIT = 0;

	public static void process(String rawJSON) {

		PROCESS_LIMIT++;

		//if (PROCESS_LIMIT > 10) return;
	//	System.out.println("----------------------------------------------------------------");
		//	System.out.println(rawJSON);
		try {
			ObjectMapper mapper = new ObjectMapper();
		//	System.out.println(rawJSON);
			Tweet tweet = mapper.readValue(rawJSON, Tweet.class);
			mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
			mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
			mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);


			if(true){
				System.out.println(tweet);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	//	System.out.println("----------------------------------------------------------------");
	}

	public static void main(String[] args) {
	  //SpringApplication.run(TwitterConfig.class,args);

		SpringApplication.run(TwitterMicroserviceApplication.class, args);
		try {
			TwitterStream twitterStream = TwitterConfig.getTwitterStreamInstance();

			twitterStream.addListener(new RawStreamListener() {

				@Override
				public void onMessage(String rawJSON) {
					//if(rawJSON.contains("Kashmir")) {

//					download_limit++;
//					System.out.println("****************** download_limit " + download_limit);

					if (rawJSON.startsWith("{\"created_at\"")) {
//						System.out.println("*****************************************");
//						System.out.println(rawJSON);
//						System.out.println("*****************************************");
						process(rawJSON);
					}
				//	}

				}

				@Override
				public void onException(Exception ex) {
					System.out.println("onException: ");
					ex.printStackTrace();
				}
			});
			twitterStream.sample();
//	        twitterStream.filter(arg0);
		} catch (Exception e) {
			System.out.println("main Exception e: " + e);
			e.printStackTrace();
		}


	}

}
