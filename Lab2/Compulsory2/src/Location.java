public class Location {

    private String name;

    public enum Type {
        city,
        airport,
        gasStation,
        supermarket
    }

    Type type;

    public final int x, y;

    Location() {

        this(0, 0, Type.city);
    }

    Location(int x, int y, Type type) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {

        return "Location{" + "name=" + name + ", type=" + type + " }";
    }

}
