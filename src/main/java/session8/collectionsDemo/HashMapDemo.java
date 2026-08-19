package session8.collectionsDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> studentsID = new HashMap<>();

        studentsID.put(101, "Mohamed");
        studentsID.put(102, "Ahmed");
        studentsID.put(103, "Sayed");

        System.out.println(studentsID);

        studentsID.remove(101);
        System.out.println(studentsID);

        System.out.println(studentsID.get(102));

        System.out.println(studentsID.size());


    }

}
