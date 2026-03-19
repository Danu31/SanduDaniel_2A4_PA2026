package org.example;
import java.util.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public abstract class Street implements Comparable<Street>{

    private String name;
    private Integer length;
    private Intersection from;
    private Intersection to;


    @Override
    public int compareTo(Street street) {
        return Integer.compare(this.length, street.length);
    }

}
