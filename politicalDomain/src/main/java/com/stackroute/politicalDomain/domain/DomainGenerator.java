package com.stackroute.politicalDomain.domain;


import com.stackroute.politicalDomain.model.AnalyzedActivityTweet;
import org.springframework.stereotype.Component;
@Component
public class DomainGenerator {


    public String findDomain(AnalyzedActivityTweet message){

        String domain = "";
        String text = message.getContent();
        System.out.println(">>>>>>>>>>>>>>"  + text);
       // String textToArray[]=text.split(" ");
       /* String []dictionary={"BJP", "Congress", "assembly", "MLA","elections","parliament","loksabha","rajyasabha","cheif minister","president"};
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
        }*/

        String[] finance_dictionary = {"bank", "finance", "stockmarket", "BSE", "NIFTY", "parliament", "GDP", "GST", "money", "black money"};
        String[] foreignAffairs_dictionary = {"China", "import", "export", "foreign", "USA", "korea"};
        String[] health_dictionary = {"health", "disease", "dengue", "hospital", "cancer", "fitness"};
        boolean flag = false;


        for (int i = 0; i < finance_dictionary.length; i++) {
            if (text.contains(finance_dictionary[i])) {
                domain = "finance";
                flag = true;
                break;
            }
        }
        if (flag == false) {
            for (int i = 0; i < foreignAffairs_dictionary.length; i++) {
                if (text.contains(foreignAffairs_dictionary[i])) {
                    domain = "foreign";
                    flag = true;
                    break;
                }
            }
        }
            if (flag == false) {
                for (int i = 0; i < health_dictionary.length; i++) {
                    if (text.contains(health_dictionary[i])) {
                        domain = "health";
                        flag = true;
                        break;
                    }
                }
            }

            if (flag == false)
                domain = "General";
            System.out.println("Sub Domain is:  " + domain);

            System.out.println(domain);



        if (domain == "") {
            System.out.println("domain is null--------");
            domain = "General";
        }
       // System.out.println(domain);
        return domain;
    }
}
