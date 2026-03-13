import java.util.*;

public class Company implements Profile, Comparable<Company>{

    private int id;
    private String name;

    Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
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
    public int compareTo(Company other) {
        return this.name.compareTo(other.name);
    }

}
