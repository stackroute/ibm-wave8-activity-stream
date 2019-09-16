package com.stackroute.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SentimentClassification {
  double veryPositive;
  double positive;
  double neutral;
  double negative;
  double veryNegative;
}
