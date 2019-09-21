package com.stackroute.service;

import com.stackroute.model.ActivityTweet;
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
        activityTweet1.setDomain(activityTweet.getDomain());
        activityTweet1.setSubdomain(activityTweet.getSubdomain());

        return activityTweet1;
    }
}
