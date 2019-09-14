package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
//@ComponentScan("com.stackroute")
//@EnableScheduling
public class ASSentiment
{
    public static void main( String[] args )
  {
        SpringApplication.run(ASSentiment.class,args);
  }

}
