package com.stackroute;

import com.stackroute.upstream.ASUpstreamApp;
import com.techprimers.kafka.springbootkafkaconsumerexample.SpringBootKafkaConsumerExampleApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Import({ASUpstreamApp.class, SpringBootKafkaConsumerExampleApplication.class})
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
        //SpringApplication.run();
        System.out.println( "Hello World!" );
    }
}
