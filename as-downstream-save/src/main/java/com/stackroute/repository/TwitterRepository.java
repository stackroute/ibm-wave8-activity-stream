package com.stackroute.repository;

import com.stackroute.model.ActivityTweet;
import com.stackroute.model.Tweet;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterRepository extends CrudRepository<ActivityTweet, String> {
}
