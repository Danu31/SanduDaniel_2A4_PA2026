/**
 * Clasa pentru locatie -> oras, aeroport, munte etc.
 */
public abstract sealed class Location permits City, Airport, Mountain {

    /**
     * Numele locatiei
     */
    private String name;

    public enum Type {
        CITY,
        AIRPORT,
        MOUNTAIN
    }

    Type type;

    /**
     * Coordonatele x si y ale locatiei
     */
    public final int x, y;

    Location() {

        this("unkown", 0, 0, Type.CITY);
    }

    Location(String name, int x, int y, Type type) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Location location = (Location) o;

        return x == location.x && y == location.y && name.equals(location.name) && type == location.type;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, x, y);
    }
}
