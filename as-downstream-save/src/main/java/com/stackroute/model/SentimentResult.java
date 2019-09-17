package com.stackroute.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@UserDefinedType("sentimentResult")
public class SentimentResult {
  String sentimentType;
  double sentimentScore;

}
