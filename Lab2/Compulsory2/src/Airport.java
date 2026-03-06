public final class Airport extends Location{

    private int terminalNo;

    public Airport(String name, int x, int y) {
        super(name, x, y, Type.AIRPORT);
    }

    public int getNumberOfTerminals() { return terminalNo; }
}
