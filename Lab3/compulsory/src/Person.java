import java.util.*;

//import lombok.NoArgsConstructor;
//
//@NoArgsConstructor

public class Person implements Profile, Comparable<Person> {

    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person other) { return this.name.compareTo(other.name); }
}
