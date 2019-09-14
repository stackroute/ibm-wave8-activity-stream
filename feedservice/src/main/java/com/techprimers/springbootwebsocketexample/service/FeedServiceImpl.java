package com.techprimers.springbootwebsocketexample.service;

import com.techprimers.springbootwebsocketexample.model.ActivityTweet;
import com.techprimers.springbootwebsocketexample.model.MyCustomTweet;
import com.techprimers.springbootwebsocketexample.model.TwitterActor;
import org.springframework.stereotype.Service;

@Service
public class FeedServiceImpl implements FeedService {

    @Override
    public ActivityTweet save(ActivityTweet activityTweet) {

        /*String content=activityTweet.getContent();
        TwitterActor actor=activityTweet.getActor();
        String  verb=activityTweet.getVerb();
        MyCustomTweet myCustomTweet=activityTweet.getObject();*/
ActivityTweet activityTweet1=new ActivityTweet();
activityTweet1.setActor(activityTweet.getActor());
activityTweet1.setContent(activityTweet.getContent());
activityTweet1.setObject(activityTweet.getObject());
activityTweet1.setVerb(activityTweet.getVerb());



        return activityTweet1;
    }
}
