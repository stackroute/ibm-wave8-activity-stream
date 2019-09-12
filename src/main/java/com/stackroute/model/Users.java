package com.stackroute.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.kafka.common.internals.Topic;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties
@Table(name="user")
public class Users {

    @Id
    @Column
    @JsonProperty("username")
    private String username;
    @Column
    @JsonProperty("password")
    private String password;
    @Column
    @JsonProperty("phonenumber")
    private long phonenumber;
    @Column
    @JsonProperty("email")
    private String email;
    @Column
    @JsonProperty("topic")
    private String topic;


    @Column
    @JsonProperty
    @Transient private int operation;


    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }



    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ",email='" + email + '\''+
                ",topic='" + topic + '\''+
                '}';
    }
}