package com.stackroute.repository;

import com.stackroute.domain.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository<UserDetails,String> {
}
