package com.stackroute.upstream.Controllers;

import com.stackroute.adapter.IRCService;
import com.stackroute.upstream.service.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Controller
public class UpStreamController {

    @Autowired
    DataFetcher dataFetcher;

    @PostConstruct
    public String sayHello() throws IOException {
        dataFetcher.fetchData();
      System.out.println("--------------");
      new IRCService().getIRC();
      System.out.println("--------------");
        System.out.println("is ths getting executed ??");
        return "will this work ??";
    }
}
