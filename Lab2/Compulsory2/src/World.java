public class World{

    Location[][] worldMatrix;
    Road[] roadArray;
    int size;

    World(){
        this(20);
    }
    World(int size){
        worldMatrix = new Location[size][size];
    }

    void addLocation(int x, int y, Location location)
    {
        worldMatrix[x][y] = location;
    }

    void addRoad(Location from, Location to){
        Road road = new Road(from, to);
    }
    void addRoad(Location from, Location to, Road.Type type, double length,  int speedLimit ){
        Road road =  new Road(from, to, type, length, speedLimit);
    }

}
