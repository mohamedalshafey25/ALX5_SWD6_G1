package session8.collectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();
        cities.add("Cairo");
        cities.add("Alex");
        cities.add("Cairo");

        System.out.println(cities);

        System.out.println(cities.contains("cairo"));

    }
}
