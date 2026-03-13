import java.time.LocalDate;
import java.util.*;

//import lombok.NoArgsConstructor;
//
//@NoArgsConstructor

enum relationship{
    FRIENDSHIP,
    COWORKER,
    WORKSFOR
}

public class Person implements Profile, Comparable<Person> {

    private int id;
    private String name;
    private LocalDate birthDate;
    private Map<Profile, relationship> relationships = new HashMap<>();

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addRelationship(Profile profile, relationship value) {

        if(value == relationship.WORKSFOR && !(profile instanceof Company)) {
            System.out.println("WORKSFOR poate fi doar cu o companie!");
            return;
        }
        relationships.put(profile, value);

        if (value == relationship.FRIENDSHIP || value == relationship.COWORKER) {
            if (profile instanceof Person) {
                Person person = (Person) profile;
                person.relationships.put(this, value);
            }
        }
    }

    public int importance(){
        return relationships.size();
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
