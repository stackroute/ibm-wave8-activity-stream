package com.stackroute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@UserDefinedType("extended_entities")
public class TwitterExtendedEntity {
    @Column("media")
     //private Media[] media;
    private List<Media> media=new ArrayList<>();

}