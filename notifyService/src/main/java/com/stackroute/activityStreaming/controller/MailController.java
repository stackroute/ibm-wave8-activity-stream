package com.stackroute.activityStreaming.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.activityStreaming.service.MailService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MailController {

	@Autowired
	private MailService notificationService;

/*
	@Autowired
	private User user;
*/

	@KafkaListener(topics = "mail", group = "group_id")
	public void consume(String message) {
		System.out.println(message);
		try {
			System.out.println("Sending Email...");
			String[] to = {"bprathyusha1997@gmail.com"};
			String[] cc = {"abinashkumar.jena526@gmail.com"};
			String subject = "Events occuring";
			String text = "Hello \n Have new notification about the events please see through it.";

			Map<String, Object> attachment = new HashMap<>();
			attachment.put("filename", "floods.jpeg");
			attachment.put("file", new ClassPathResource("images.jpeg"));

			notificationService.sendMail(to, cc, subject, text, attachment);

		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
/*
	@RequestMapping("send-mail")
	public String send() {

		try {
			System.out.println("Sending Email...");
			//String[] to = {"bprathyusha1997@gmail.com"};
			String[] cc = {"abinashkumar.jena526@gmail.com"};
			String subject = "Events occuring";
			String text = "Hello \n Have new notification about the events please see through it.";

			Map<String, Object> attachment = new HashMap<>();
			attachment.put("filename", "floods.jpeg");
			attachment.put("file", new ClassPathResource("images.jpeg"));

			notificationService.sendMail(user.getEmail(), cc, subject, text, attachment);

		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
         return "";
	}
}*/
