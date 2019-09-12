package com.stackroute.dao;


import com.stackroute.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserDao extends CrudRepository<Users, String> {
    Users findByusername(String username);

    @Modifying
    @Transactional
    void deleteByusername(String username);



}
