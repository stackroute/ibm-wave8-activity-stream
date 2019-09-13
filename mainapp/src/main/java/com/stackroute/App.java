package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@Import({ASUpstreamApp.class, SpringBootKafkaConsumerExampleApplication.class})
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
        //SpringApplication.run();
        System.out.println( "Hello World!" );
    }
}
