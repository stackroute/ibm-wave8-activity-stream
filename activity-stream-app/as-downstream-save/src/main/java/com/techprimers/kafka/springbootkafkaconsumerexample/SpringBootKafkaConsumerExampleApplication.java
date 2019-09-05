package com.techprimers.kafka.springbootkafkaconsumerexample;

import com.stackroute.upstream.ASUpstreamApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Import({ASUpstreamApp.class})
public class SpringBootKafkaConsumerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaConsumerExampleApplication.class, args);
	}

	@PostConstruct
	private void test() {
		System.out.println("------------------ Post construct method called: ");

	}
}
