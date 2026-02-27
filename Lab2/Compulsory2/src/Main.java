public static void main(String[] args) {

    IO.println(String.format("Hello and welcome!"));

    World worldMap = new World(20);
    Location lidl = new Location(10, 7, Location.Type.supermarket);

    worldMap.AddLocation(lidl.x, lidl.y, lidl);

}
