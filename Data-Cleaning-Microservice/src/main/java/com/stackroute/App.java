package com.stackroute;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.stackroute.domain.Media1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException {

        Media1 media1=new Media1();
        media1.mediaFilter();

    }
}
