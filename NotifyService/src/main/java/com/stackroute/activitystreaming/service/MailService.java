package com.stackroute.activitystreaming.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;


import org.thymeleaf.spring4.SpringTemplateEngine;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;


@Service
public class MailService {

	@Autowired
	private JavaMailSender emailSender;

	@Autowired
	private SpringTemplateEngine templateEngine;

	public void sendMail(String[] to, String subject, String text) throws MessagingException, IOException {
		sendMail(to, subject, text, null);
	}

	public void sendMail(String[] to, String[] cc, String subject, String text) throws MessagingException, IOException {
		sendMail(to, cc, subject, text, null);
	}

	public void sendMail(String[] to, String subject, String text, Map<String, Object> attachment) throws MessagingException, IOException {
		sendMail(to, null, subject, text, attachment);
	}
	public void sendMail(String[] to, String[] cc, String subject, String text, Map<String, Object> attachment) throws MessagingException, IOException {
		MimeMessage message = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,
				MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
				StandardCharsets.UTF_8.name());
		Context context = new Context();

		String html = templateEngine.process("email-template", context);
		helper.setTo(to);
		helper.setText(html, true);
		helper.setSubject(subject);
		helper.setCc(cc);
		//helper.addAttachment(attachment.get("filename").toString(), (ClassPathResource) attachment.get("file"));

		emailSender.send(message);
	}
}
