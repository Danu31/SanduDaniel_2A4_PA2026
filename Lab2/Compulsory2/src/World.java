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

//        roadArray = new Road[roadArray.length+1];
    }
    void addRoad(Location from, Location to, Road.Type type, double length,  int speedLimit ){
        Road road =  new Road(from, to, type, length, speedLimit);

//        roadArray = new Road[roadArray.length+1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("World: \n");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (worldMatrix[i][j] != null) {
                    sb.append("[");
                    sb.append(i);
                    sb.append("][");
                    sb.append(j);
                    sb.append("] = ");
                    sb.append(worldMatrix[i][j].toString());
                    sb.append("\n");
                }
            }
        }

//        for (int i = 0; i < roadArray.length; i++) {
//
//        }

        return sb.toString();
    }

}
