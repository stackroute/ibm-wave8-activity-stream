package com.stackroute.model;

public class TweetAfterCleansing {
    String verb;
    TwitterActor actor;
    String content;
    MyCustomTweet object;

    public TweetAfterCleansing(String verb, TwitterActor actor, String content, MyCustomTweet object) {
        this.verb = verb;
        this.actor = actor;
        this.content = content;
        this.object = object;
    }

    public TweetAfterCleansing() {
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public TwitterActor getActor() {
        return actor;
    }

    public void setActor(TwitterActor actor) {
        this.actor = actor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MyCustomTweet getObject() {
        return object;
    }

    public void setObject(MyCustomTweet object) {
        this.object = object;
    }
}
