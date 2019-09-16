package com.stackroute.activityStreaming;

import com.stackroute.activityStreaming.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import javax.annotation.PostConstruct;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class MailApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailApiApplication.class, args);
	}


}
 