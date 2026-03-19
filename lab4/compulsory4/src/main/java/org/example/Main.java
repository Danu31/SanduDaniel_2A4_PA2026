package org.example;
import java.util.*;
import java.util.stream.*;
import net.datafaker.Faker;

public class Main {
    static void main() {

        var intersectionArray = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> new Intersection("I" + i))
                .toArray(Intersection[]::new);

        LinkedList<Street> streetList = new LinkedList<Street>();

        Faker faker = new Faker();
        List<Intersection> intersections = IntStream.range(0, 10)
                .mapToObj(i -> new Intersection(faker.address().streetAddress()))
                .toList();

        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            Intersection from = intersections.get(random.nextInt(intersections.size()));
            Intersection to = intersections.get(random.nextInt(intersections.size()));

            if (!from.equals(to)) {
                Street street = new Street(
                        faker.address().streetName(),
                        faker.number().numberBetween(10, 500),
                        from,
                        to
                ) {};
                streetList.add(street);
            }
        }

//      Collections.sort(streetList);
        streetList.sort((street1, street2) -> Integer.compare(street1.getLength(), street2.getLength()));

        for(Street street : streetList) {
            System.out.println(street.toString());
        }

        HashSet<Intersection> intersectionSet = new HashSet<>(Arrays.asList(intersectionArray));
        Intersection timesSquare = new Intersection("Times Square");
        intersectionSet.add(timesSquare);
        intersectionSet.add(timesSquare);

        for (Intersection intersection : intersectionSet) {
            System.out.println(intersection);
        }


        City iasi = new City();

        Intersection podulDePiatra = new Intersection("Podul de Piatra");
        Intersection piataUnirii = new Intersection("Piata Unirii");
        Intersection piataMihaiEminescu = new Intersection("Piata Mihai Eminescu");
        Intersection rondPacurari = new Intersection("Rond Pacurari");
        Intersection podCanta = new Intersection("Pod Canta");

        Street stefanCelmare = new Street("Stefan cel Mare", 129, podCanta, podulDePiatra) {};
        Street independentei =  new Street("Independentei", 450, piataMihaiEminescu, podCanta) {};
        Street vasileLupu = new Street("Vasile Lupu", 220, piataUnirii, piataMihaiEminescu) {};
        Street nicoaleIorga = new Street("Nicolae Iorga", 345, podCanta,  piataUnirii) {};
        Street alexandruLapusneanu = new Street("Alexandru Lapusneanu", 310, rondPacurari, piataUnirii  ) {};
        Street grigoreGhica = new Street("Grigore Ghica", 220, podCanta, rondPacurari) {};
        Street pacurari = new Street("Pacurari", 600, rondPacurari, podulDePiatra) {};
        Street aleeaRozelor = new Street("Aleea rozelor", 230, rondPacurari, piataMihaiEminescu) {};

        iasi.addStreet(stefanCelmare);
        iasi.addStreet(vasileLupu);
        iasi.addStreet(alexandruLapusneanu);

        iasi.addStreet(grigoreGhica);
        iasi.addStreet(pacurari);
        iasi.addStreet(nicoaleIorga);
        iasi.addStreet(independentei);
        iasi.addStreet(aleeaRozelor);

        for(Street street : iasi.getStreetList(200, 2)) {
            System.out.println(street.getName());
        }

        iasi.mst();

    }
}
