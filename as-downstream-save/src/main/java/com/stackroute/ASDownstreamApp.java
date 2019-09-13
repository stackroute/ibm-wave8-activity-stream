package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import javax.annotation.PostConstruct;

@SpringBootApplication
//@Import({ASUpstreamApp.class})
//@EnableCassandraRepositories
public class ASDownstreamApp {

	public static void main(String[] args) {
		SpringApplication.run(ASDownstreamApp.class, args);
	}

	@PostConstruct
	private void test() {
		System.out.println("------------------ Post construct method called: ");
	}
}
