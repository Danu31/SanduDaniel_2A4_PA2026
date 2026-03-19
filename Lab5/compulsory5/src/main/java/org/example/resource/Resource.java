package org.example.resource;

import lombok.*;
import java.io.Serializable;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Resource implements Serializable {

    private String id;
    private String title;
    private String location;
    private String year;
    private String author;
    private String description;




}