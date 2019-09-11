package com.stackroute.repository;

import com.stackroute.model.Tweet;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface TwitterRepository extends CassandraRepository<Tweet, String> {
}
