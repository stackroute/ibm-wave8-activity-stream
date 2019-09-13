package com.stackroute.domain;

import com.ibm.common.activitystreams.Activity;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DomainGenerator {

  public static void findDomain(String message){

    Dictionary<Integer,String> dictionary =new Hashtable<Integer, String>();
    dictionary.put(1,"IBM Global Business Services");
    dictionary.put(2,"IBM Systems and Technology Group");
    dictionary.put(3,"IBM Research India");
    dictionary.put(4,"IBM Microelectronics");
    dictionary.put(5,"Artificial Intelligence");
    dictionary.put(6,"IBM Research China");
//    String content = message.content().toString();
    String domain=null;

//    String[] contentSplitter=content.split(" ");
    String[] contentSplitter=message.split(" ");

    Enumeration<String> values=dictionary.elements();
//    for ( int key=1;key<=dictionary.size();key++){
//
//      if(contentSplitter[key].equalsIgnoreCase(values.nextElement())){
//        domain=values.nextElement();
//      }
//      System.out.println(domain);
//    }
   // while ()




  }

  public static void main(String[] args) {
    String text="Now, to kick-start the progress, CBSE has joined hands with IBM India, who is developing the syllabus from scratch along with the members of its global team and other subject experts";
    findDomain(text);
  }
}
