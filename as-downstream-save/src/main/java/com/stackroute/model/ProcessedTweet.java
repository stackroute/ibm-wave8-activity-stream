package com.stackroute.model;

import com.datastax.driver.core.DataType;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table("processedFinalTweet")
public class ProcessedTweet {
    @Column("timestamp")
    private String timeStamp;
    @Column("uuid")
    @PrimaryKey
    private String uuid;
    @Column("verb")
    String verb;
    @Column("actor")
    TwitterActor actor;
    @Column("content")
    String content;
    @Column("object")
    MyCustomTweet object;
    @Column("sentimentresult")
    @CassandraType(type= DataType.Name.UDT, userTypeName = "sentimentresult")
    SentimentResult sentimentResult;
    @Column("domain")
    String domain;
    @Column("subdomain")
    String subDomain;
}
