package com.stackroute.politicalDomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.stackroute")
public class PoliticalDomainApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoliticalDomainApplication.class, args);
	}

}
