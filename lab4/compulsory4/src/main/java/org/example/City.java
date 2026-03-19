package org.example;

import lombok.*;
import java.util.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.interfaces.SpanningTreeAlgorithm;
import org.jgrapht.alg.spanning.KruskalMinimumSpanningTree;
import org.jgrapht.graph.SimpleWeightedGraph;

@Getter
@Setter
@NoArgsConstructor
public class City {

    Set<Intersection> intersectionSet = new HashSet<>();
    List<Street> streetList = new ArrayList<>();

    City(Map<Intersection, List<Street>> cityMap)
    {
        this.intersectionSet = new HashSet<>(cityMap.keySet());
        this.streetList = cityMap.values().stream().flatMap(List::stream).toList();
    }

    public void addStreet(Street street) {
        this.streetList.add(street);
        this.intersectionSet.add(street.getFrom());
        this.intersectionSet.add(street.getTo());
    }

    public int countJoinedStreets(Street street) {

        Set<Street> joined = new HashSet<>();

        for (Street other : streetList) {

            if (other.equals(street)) continue;

            if (other.getFrom().equals(street.getFrom()) || other.getFrom().equals(street.getTo()) ||
                 other.getTo().equals(street.getFrom()) || other.getTo().equals(street.getTo())) {
                joined.add(other);
            }
        }

        return joined.size();
    }

    public List<Street> getStreetList(int length, int joinedStreets){

        return streetList.stream()
                .filter(street -> street.getLength() >= length && countJoinedStreets(street)>=joinedStreets).toList();

    }

    public void mst() {
        Graph<Intersection, Street> graph = new SimpleWeightedGraph<>(Street.class);

        for (Intersection vertex : intersectionSet) {
            graph.addVertex(vertex);
        }

        for (Street street : streetList) {
            graph.addEdge(street.getFrom(), street.getTo(), street);
            graph.setEdgeWeight(street, street.getLength().doubleValue());
        }

        KruskalMinimumSpanningTree<Intersection, Street> kruskal = new KruskalMinimumSpanningTree<>(graph);
        SpanningTreeAlgorithm.SpanningTree<Street> mst = kruskal.getSpanningTree();

        System.out.println("Cost total minim: " + (int)mst.getWeight());
        System.out.println("Străzile din mst:");

        for (Street street : mst.getEdges()) {
            System.out.println(street.getName() + ", from: " + street.getFrom() + ", to:" + street.getTo() + ", lungime: " + street.getLength());
        }
    }

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        for (Intersection intersection : intersectionSet) {
            str.append(intersection.toString()).append("\n");
            for (Street street : streetList) {
                str.append(street.toString()).append("\n");
            }
        }
        return str.toString();
    }
}
