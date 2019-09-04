package com.stackroute.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table
public class Message {
    @PrimaryKey
    private @NonNull int id;
    private String message;

}