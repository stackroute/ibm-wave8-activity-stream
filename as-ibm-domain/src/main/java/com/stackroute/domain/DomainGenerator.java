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
    /*String []departments={"Sales" , "Export" , "IT", "Marketing" , "Financial" ,
                          "Human Resources", "Buying" , "R&D", "Quality" , "Administration",
                          "Production" , "Logistics" , "PR" , "Security"};*/

    /*String[] finance_dictionary = {"bank", "finance", "stockmarket", "BSE", "NIFTY", "parliament", "GDP", "GST", "money",
            "black money","invest","loan","financial","budget","currency","tax","mutual fund","sharemarket","stake","cashless",
            "bitcoin","equity","asset","trader","loan","subsidise","subsidize","crypto","treasure" };*/

    String[] HR={" Employment"," Opportunity",
            "HR"," Management" ,"Organizations" ,
            "Strategic", "Planning" ,
            "Workers", "Jobs", "Job", "Analysis" ,
            "Human"," Resource","Retention",
            "Recruiting","Labor", "Markets"};
    String[] ProductAndServices={" Manual card punch",
            "Mechanical Key Punch",
            " Lever Set Gang Punch",
            " Card Punch" ,
            " Electric Key Punch",
            "Electric Duplicating Key Punch",
            "Badge Punch",
            "Motor Drive Key Punch",
            "Motor Drive Duplicating Key Punch",
            "ATM",
            "Accounting Machine",
            "IBM Watson",
            "Cloud Services"
            };
    String[] Marketing={"Supplier","Influencer","Recruitment","Internal","referral","Business to Business"
                        ,"Business to Consumer","Consumer to Business","Consumer to Consumer",
                        "Content Marketing","Search Engine Marketing","Direct Marketing",
                            "Database Marketing","Social Media Marketing","Product Marketing," ,
                        "Functional oriented marketing organization","Product oriented marketing organization"
                        ,"Customer oriented marketing organization",
                            "implementation","internal control","quantitative analysis"
                        ,"promotional material","enhancement","pricing","optimize"
                        ,"profitability","promotional","analytical","maximize","return on investment",
                            "deadline","pertinent","forecasting","metric","market research","servicing",
                        "advertise","operational","motivate","brand","delivery","timely","innovate",
                        "regulator","advertising agency","initiative","co-ordinate","oversee",
                    "stategic","tracking","organizational","accountability",};
String[] Learning={"Information" +
        "Knowledge" ,
        "Skills" ,
        "Abilities" ,
        "Perceptions" ,
        "Task" ,
        "Job" ,
        "Role" ,
        "Learning" ,
        "Continuous Learning" ,
        "Training" ,
        "Education" ,
        "Development" ,
        "Additional Information",
    "Benefits & Compensation" ,
            "Diversity & Inclusion" ,
            "Employee Communications" ,
            "Employee Relations" ,
            "Human Resource Information Systems (HRIS)" ,
            "Job Analysis" ,
            "Labor & Union Negotiations" ,
            "Leadership Development" ,
            "Manpower Planning" ,
            "Onboarding" ,
            "Organizational Development" ,
            "Performance Management" ,
            "Recruitment" ,
            "Retention" ,
            "Staffing" ,
            "Succession Planning" ,
            "Talent Development" ,
            "Training & Development"};
    /*for (int i=0;i<textToArray.length;i++)
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
*/
    boolean flag = false;


    for (int i = 0; i < HR.length; i++) {
      if (text.toLowerCase().contains(HR[i].toLowerCase())) {
        domain = "HUMAN RESOURCES";
        flag = true;
        break;
      }
    }
    if (flag == false) {
      for (int i = 0; i < ProductAndServices.length; i++) {
        if (text.toLowerCase().contains(ProductAndServices[i].toLowerCase())) {
          domain = "Products And Services";
          flag = true;
          break;
        }
      }
    }

    if (flag == false) {
      for (int i = 0; i < Marketing.length; i++) {
        if (text.toLowerCase().contains(Marketing[i].toLowerCase())) {
          domain = "Marketing";
          flag = true;
          break;
        }
      }
    }

      if (flag == false) {
          for (int i = 0; i < Learning.length; i++) {
              if (text.toLowerCase().contains(Learning[i].toLowerCase())) {
                  domain = "Learning";
                  flag = true;
                  break;
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
