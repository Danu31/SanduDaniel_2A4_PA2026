package org.example;
import lombok.*;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Intersection {

    String name;

    @Override
    public String toString(){
        return name;
    }
}
