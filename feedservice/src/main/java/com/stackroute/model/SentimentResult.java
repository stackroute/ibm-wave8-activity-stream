package com.stackroute.model;


import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SentimentResult {
    String sentimentType;
    float sentimentScore;
}