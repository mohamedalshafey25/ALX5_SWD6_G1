package session8.collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        // adding elements
        names.add("Mohamed");
        System.out.println(names);
        names.add(1, "Ahmed");
        System.out.println(names);
        names.add(0, "Ali");
        names.addFirst("Sayed");
        names.addLast("Mosa");
        System.out.println(names);

        // access
        System.out.println(names.get(2));
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        // update element
        names.set(0, "Medo");
        System.out.println(names);

        // Remove
        names.remove("Ali");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);

        // size
        System.out.println(names.size());

        // iterate all elements
        for (String name : names){
            System.out.println("Name: " + name);
        }

        // clear
        names.clear();

        System.out.println(names);



    }

}
