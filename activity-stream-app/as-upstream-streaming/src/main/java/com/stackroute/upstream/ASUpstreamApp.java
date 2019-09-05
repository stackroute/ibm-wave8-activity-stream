package com.stackroute.upstream;

import com.stackroute.upstream.service.UpstreamPublishService;
import com.stackroute.upstream.service.TweetStreamRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication

public class ASUpstreamApp {

    @Autowired
    private TweetStreamRunner tweetStreamRunner;

    public static void main(String[] args) {
        SpringApplication.run(ASUpstreamApp.class,args);
//		TweetStreamRunner.stream();
        //	System.out.println(list.size());
    }

    @PostConstruct
    public void perform()
    {
        tweetStreamRunner.stream();
    }
}
