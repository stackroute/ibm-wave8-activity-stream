package com.stackroute.repository;

import com.stackroute.model.ProcessedTweet;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessedTweetRepository extends CrudRepository<ProcessedTweet,String> {

    @Query("select * from processedfinaltweet WHERE domain='IBM' limit 5 ALLOW FILTERING")
    public List<ProcessedTweet> getAll();

    @Query("select * from processedfinaltweet where domain='Politics' limit 5 ALLOW FILTERING")
    public List<ProcessedTweet> getPoliticalTweets();
}
