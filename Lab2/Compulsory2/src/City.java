public final class City extends Location{
    private int population;

    public City(String name, int x, int y) {
        super(name, x, y, Type.CITY);
    }
}
