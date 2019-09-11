package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication   //marks the main class as a spring configuration class
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication.run(App.class,args);
        System.out.println( "Hello World!" );
    }
}
