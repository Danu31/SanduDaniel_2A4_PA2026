import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Map{

    Location[][] worldMatrix;
    List<Road> roadArray = new ArrayList<>();
    int size;

    Map(){
        this(20);
    }
    Map(int size){
        this.size = size;
        worldMatrix = new Location[size][size];
    }

    void addLocation(int x, int y, Location location)
    {
        if (worldMatrix[x][y] != null && worldMatrix[x][y].equals(location)) {
            System.out.println("Locația " + location.getName() + " există deja la aceste coordonate!");
            return;
        }
        worldMatrix[x][y] = location;
    }

    void addRoad(Location from, Location to){
        roadArray.add( new Road(from, to));
    }
    void addRoad(Location from, Location to, Road.Type type, double length,  int speedLimit ){
        roadArray.add(new Road(from, to, type, length, speedLimit));
    }

    void printMap(){

        for(int i = 0; i < size; i++){
            System.out.print('\n');
            for(int j = 0; j < size; j++){

                if (worldMatrix[i][j] != null) {

                    switch(worldMatrix[i][j].getType()){
                        case CITY:
                            System.out.print("\uD83C\uDFD9\uFE0F");
                            break;
                        case MOUNTAIN:
                            System.out.print("⛰\uFE0F");
                            break;
                        case AIRPORT:
                            System.out.print("✈\uFE0F");
                            break;
                        default:
                            System.out.print("⬛");
                    }
                }
                else{
                    System.out.print("\uD83D\uDFE9");
                }


            }
        }
    }

    boolean BfsCheck(Location start, Location end) {

        Set<Location> visited = new HashSet<>();
        Queue<Location> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {

            Location current = queue.poll();

            if (current.equals(end))
                return true;

            for (Road r : roadArray) {

                if (r == null) continue;

                Location neighbor = null;

                if (r.getFrom().equals(current))
                    neighbor = r.getTo();

                else if (r.getTo().equals(current))
                    neighbor = r.getFrom();

                if (neighbor != null && !visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        return false;
    }





    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Map: \n");

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
        sb.append("\nRoads:\n");

        for (Road road : roadArray) {
            sb.append(road.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
