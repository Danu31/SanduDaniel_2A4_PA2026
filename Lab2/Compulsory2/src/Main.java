import java.util.List;
import java.util.ArrayList;

public static void main(String[] args) {


    Map romania = new Map(10);

    // cities
    Location iasi = new City("Iasi", 2 , 9);
    Location botosani = new City("Botosani", 0, 8);
    Location bucuresti = new City("Bucuresti", 8, 6);
    Location bacau = new City("Bacau", 3, 8);
    Location galati = new City("Galati", 5, 9);
    Location timisoara = new City("Timisoara", 5, 0);
    Location constanta =  new City("Constanta", 9, 9);
    Location cluj =  new City("Cluj", 2, 3);
    Location suceava = new City("Suceava", 0, 7);
    Location brasov = new City("Brasov", 4, 5);

    // Airports
    Location iasiAirport = new Airport("IasiAirport", 2, 8);
    Location bucurestiAirport = new Airport("BucurestiAirport", 8, 5);
    Location clujAirport = new Airport("ClujAirport", 2, 2);
    Location timisoaraAirport = new Airport("TimisoaraAirport", 5, 1);

    // Mountains
    Location moldoveanu = new Mountain("Moldoveanu", 0, 5);
    Location negoiu =  new Mountain("Negoiu", 1, 6);
    Location vistea = new Mountain("Vistea", 1, 5);
    Location parangu = new  Mountain("Parangu", 2, 6);
    Location lespezi = new Mountain("Lespezi", 3, 6);
    Location omu = new Mountain("Omu", 4, 6);
    Location peleaga = new Mountain("Peleaga", 5, 6);
    Location buteanu = new   Mountain("Buteanu", 5, 5);
    Location caltunului = new   Mountain("Caltunului", 6, 5);
    Location bucura = new Mountain("bucura", 5, 4);
    Location dara = new  Mountain("Dara", 6, 3);
    Location ineu = new Mountain("Ineu", 6, 2);
    Location steflesti = new Mountain("Steflesti", 6, 1);

    List<Location> carpati = new ArrayList<>();
    carpati.add(moldoveanu);
    carpati.add(negoiu);
    carpati.add(vistea);
    carpati.add(parangu);
    carpati.add(lespezi);
    carpati.add(omu);
    carpati.add(peleaga);
    carpati.add(buteanu);
    carpati.add(caltunului);
    carpati.add(bucura);
    carpati.add(dara);
    carpati.add(ineu);
    carpati.add(steflesti);


    romania.addLocation(iasi.x, iasi.y, iasi);
    romania.addLocation(botosani.x, botosani.y, botosani);
    romania.addLocation(bucuresti.x, bucuresti.y, bucuresti);
    romania.addLocation(galati.x, galati.y, galati);
    romania.addLocation(bacau.x, bacau.y, bacau);
    romania.addLocation(timisoara.x, timisoara.y, timisoara);
    romania.addLocation(constanta.x, constanta.y, constanta);
    romania.addLocation(cluj.x, cluj.y, cluj);
    romania.addLocation(suceava.x, suceava.y, suceava);
    romania.addLocation(brasov.x, brasov.y, brasov);
    romania.addLocation(iasiAirport.x, iasiAirport.y, iasiAirport);
    romania.addLocation(bucurestiAirport.x, bucurestiAirport.y, bucurestiAirport);
    romania.addLocation(clujAirport.x, clujAirport.y, clujAirport);
    romania.addLocation(timisoaraAirport.x, timisoaraAirport.y, timisoaraAirport);

    for(var loc : carpati ){
        romania.addLocation(loc.x, loc.y, loc);
    }

    romania.addRoad(cluj, timisoara, Road.Type.HIGHWAY, 5.0, 130);
    romania.addRoad(iasi, botosani, Road.Type.COUNTRY, 2.0, 70);
    romania.addRoad(galati, bucuresti, Road.Type.EXPRESS, 4.5, 100);
    romania.addRoad(cluj, brasov, Road.Type.EXPRESS, 3.5, 100);
    romania.addRoad(bacau, galati, Road.Type.COUNTRY, 2.5, 70);
    romania.addRoad(timisoara, cluj, Road.Type.HIGHWAY, 6.0, 130);

    System.out.println(romania.toString());
    romania.printMap();

}
