public class Road {

    public enum Type{
        HIGHWAY,
        EXPRESS,
        COUNTRY
    }

    Location from, to;
    double length;
    Type type;
    int speedLimit;

    Road(Location from, Location to){
        double length = Math.sqrt((from.x-to.x)*(from.x-to.x) +  (from.y-to.y)*(from.y-to.y));
        this(from, to, Type.COUNTRY, length, 60 );
    }

    Road(Location from, Location to, Road.Type type, double length,  int speedLimit ){

        double minLength = Math.sqrt((from.x-to.x)^2 + (from.y-to.y)^2);
        if(length < minLength){
            length = minLength;
        }
        this.length = length;
        this.type = type;
        this.speedLimit = speedLimit;
        this.from = from;
        this.to = to;
    }

    public double getLength() {
        return length;
    }
    public int getSpeedLimit() {
        return speedLimit;
    }
    public Location getFrom() {
        return from;
    }
    public Location getTo() {
        return to;
    }
    public Type getType() {
        return type;
    }

    public void setFrom(Location from) {
        this.from = from;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
    public void setTo(Location to) {
        this.to = to;
    }
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {

        return "Road{" + "From=" + from + "To=" + to + "Type=" + type + "Length=" + length + "SpeedLimit=" + speedLimit + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Road road = (Road) o;

        return from.equals(road.from) && to.equals(road.to);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(from, to);
    }
}
