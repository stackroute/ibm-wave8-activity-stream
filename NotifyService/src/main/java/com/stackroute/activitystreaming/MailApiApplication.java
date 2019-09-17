package com.stackroute.activitystreaming;

import com.stackroute.activitystreaming.service.MailService;
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
    @Autowired
	MailService service;
	public static void main(String[] args) {

		SpringApplication.run(MailApiApplication.class, args);
	}
	@PostConstruct
	private void perform() {


		try {
			System.out.println("Sending Email...");
			String[] to={"bprathyusha1997@gmail.com"};
			String[] cc={"abinashkumar.jena526@gmail.com"};
			String subject = "Events occuring";
			String text = "Hello \n Have new notification about the events please see through it.";

			Map<String, Object> attachment = new HashMap<>();
			attachment.put("filename", "warning");
			attachment.put("file", new ClassPathResource("photo.jpg"));

			service.sendMail(to,cc, subject, text, attachment);

		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

      /* try {
            //sendEmail();
            sendEmailWithAttachment();

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

		System.out.println("Done");
	}

}
 