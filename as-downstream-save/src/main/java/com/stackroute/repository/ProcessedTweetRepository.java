package com.stackroute.repository;

import com.stackroute.model.ProcessedTweet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessedTweetRepository extends CrudRepository<ProcessedTweet,String> {
}
