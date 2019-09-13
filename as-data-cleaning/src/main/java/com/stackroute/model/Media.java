package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.List;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)

public class Media {

    private long id;//": 1163372308586627000,
    private String id_str;//": "1163372308586627072",
    // private int[] indices;
    private List<Integer> indices;
    private String media_url;//": "http://pbs.twimg.com/media/ECUg82rVAAA0AUG.jpg",
    private String media_url_https;//": "https://pbs.twimg.com/media/ECUg82rVAAA0AUG.jpg",
    private String url;//": "https://t.co/Rcb5HqVQUy",
    private String display_url;//": "pic.twitter.com/Rcb5HqVQUy",
    private String expanded_url;//": "https://twitter.com/glayhisashi626/status/1163372317910560768/photo/1",
    private String type;//": "photo",
    @Embedded
    private Sizes sizes;

}