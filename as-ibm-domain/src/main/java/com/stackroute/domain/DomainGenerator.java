package com.stackroute.domain;

import com.ibm.common.activitystreams.Activity;
import com.stackroute.model.AnalyzedActivityTweet;
import com.stackroute.model.Tweet;
import org.springframework.stereotype.Service;

import static com.ibm.common.activitystreams.Makers.activity;

@Service
public class DomainGenerator {


  public String findDomain(AnalyzedActivityTweet message){

    String domain = "";
    Tweet tweet=new Tweet();
    String text = message.getContent();
    System.out.println(">>>>>>>>>>>>>>"  + text);
    String textToArray[]=text.split(" ");
    String []dictionary={"GBS","GTS","IBMCloud","Algorithms and Theory","IBM","Marketing","Finance","Advertising","Receiving","IBM Global Services","Global Technology Services","Human Resources"};
    for (int i=0;i<textToArray.length;i++)
    {
      for (int j=0;j<dictionary.length;j++)
      {
        if(textToArray[i].equals(dictionary[j]))
        {
          domain = dictionary[j];
          System.out.println(domain);

        }

      }
    }

    if (domain == "") {
      domain = null;
    }
    System.out.println(domain);

    return domain;
  }
}
