package com.stackroute.model;
import com.datastax.driver.core.DataType;
import lombok.*;

import org.springframework.data.cassandra.core.mapping.*;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Table("ActivityTweet")
public class ActivityTweet {
  @Column("timeStamp")
  private String timeStamp;
  @Column("uuid")
  private String uuid;
  @PrimaryKey
  @Column("content")
  String content;

  @Column("verb")
  String verb;

  @Column("actor")
  @CassandraType(type= DataType.Name.UDT, userTypeName = "actor")
  TwitterActor actor;

  @Column("object")
  @CassandraType(type = DataType.Name.UDT, userTypeName = "object")
  MyCustomTweet object;
}
