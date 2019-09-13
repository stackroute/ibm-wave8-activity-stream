package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@SpringBootApplication
//@ComponentScan("com.stackroute")
//@EnableScheduling
public class App
{
    public static void main( String[] args )
  {
        SpringApplication.run(App.class,args);
  }

}
