package com.stackroute;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.stackroute.domain.Media1;
import com.stackroute.domain.Tweet1;
import com.stackroute.domain.TwitterURL1;
import com.stackroute.domain.User1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException {
        User1 user1=new User1();
        user1.userFilter();
        Tweet1 tweet1=new Tweet1();
        tweet1.tweetFilter();
        Media1 media1=new Media1();
        media1.mediaFilter();
        TwitterURL1 twitterURL1= new TwitterURL1();
        twitterURL1.twitterURLFilter();
    }
}
