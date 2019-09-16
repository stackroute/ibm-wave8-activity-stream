package com.stackroute;


import com.stackroute.adapter.IRCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.Socket;

@SpringBootApplication
public class DemoApplication {
//    @Autowired
	static IRCService service;
	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		new IRCService().getIRC();


	}
/*
	@PostConstruct
	private void perform() throws Exception {
		service.getIRC();
	}*/
}

