
package com.stackroute.repository;

import com.stackroute.model.Message;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface MessageRepository extends CassandraRepository<Message, String> {

}
