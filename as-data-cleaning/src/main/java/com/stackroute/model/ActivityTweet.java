package com.stackroute.model;
//import com.datastax.driver.core.DataType;
import lombok.*;

//import org.springframework.data.cassandra.core.mapping.*;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

public class ActivityTweet {

  private String content;
  private String verb;
  private TwitterActor actor;
  private MyCustomTweet object;
}
