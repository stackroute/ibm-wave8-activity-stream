package com.stackroute.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserDetails {
    @Id
    private String username;
    private String password;
    private long phonenumber;
    private String emailid;
    private String subscribed_topic;

    public UserDetails() {
    }

    public UserDetails(String username, String password, long phonenumber, String emailid, String subscribed_topic) {
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.emailid = emailid;
        this.subscribed_topic = subscribed_topic;
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

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getSubscribed_topic() {
        return subscribed_topic;
    }

    public void setSubscribed_topic(String subscribed_topic) {
        this.subscribed_topic = subscribed_topic;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber=" + phonenumber +
                ", emailid='" + emailid + '\'' +
                ", subscribed_topic='" + subscribed_topic + '\'' +
                '}';
    }
}
