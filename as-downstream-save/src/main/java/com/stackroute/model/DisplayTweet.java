package com.stackroute.model;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DisplayTweet {
    private ProcessedTweet processedTweet;
    private Date date;

}
