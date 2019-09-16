package com.stackroute.domain;

import com.stackroute.model.AnalyzedActivityTweet;
import org.springframework.stereotype.Service;

@Service
public class DomainGenerator {

  public String findDomain(AnalyzedActivityTweet message){

    String domain = "";
    String text = message.getContent();
    System.out.println(">>>>>>>>>>>>>>"  + text);
    String textToArray[]=text.split(" ");
    String []departments={"Sales" , "Export" , "IT", "Marketing" , "Financial" ,
                          "Human Resources", "Buying" , "R&D", "Quality" , "Administration",
                          "Production" , "Logistics" , "PR" , "Security"};
    for (int i=0;i<textToArray.length;i++)
    {
      for (int j=0;j<departments.length;j++)
      {
        if(textToArray[i].equals(departments[j]))
        {
          domain = departments[j];
          System.out.println(domain);
        }
      }
    }

    if (domain == "") {
      domain = "General";
    }
    System.out.println(domain);
    return domain;
  }
}
