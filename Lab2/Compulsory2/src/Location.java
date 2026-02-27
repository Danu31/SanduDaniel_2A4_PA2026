public class Location {

    private String name;

    public enum Type {
        city,
        airport,
        gasStation
    }

    Type type;

    public final int x, y;

    Location() {

        this(0, 0);
    }

    Location(int x, int y) {
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

}
