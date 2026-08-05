package session4;

import java.util.Scanner;

public class C3_Array {
    public static void main(String[] args) {


        // Using array to store students
        String[] students = new String[4];
        int[] ages = {22, 23, 24, 25, 26};
        boolean[] isGraduated = {true, false, true, false, true};
        double[] fees = {1000.5, 2000.5, 3000.5, 4000.5, 5000.5};

        // Array Size

        System.out.println("Number of Students: " + students.length);

        // Array Identifier carries the reference to the array object in memory
//        System.out.println(students);
//        System.out.println(ages);


        // Acces Array elements using index
        students[0] = "Mohamed";
        students[1] = "Ahmed";
        students[2] = "Mina";
        students[3] = "Reham";
//        students[4] = "Hady"; // This will throw an ArrayIndexOutOfBoundsException because the index 4 is> out of bounds for the array of size 4.


//        System.out.println(students[0]);
//        System.out.println(students[1]);
//        System.out.println(students[2]);
//        System.out.println(students[3]);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " " + students[i]);
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Age " + (i + 1) + " " + ages[i]);

        }
        for (int j = 0; j < fees.length; j++) {
            System.out.println("Fees " + (j + 1) + " " + fees[j]);
        }

        // Enhanced for loop
        for (String student : students) {
            System.out.println("Student: " + student);
        }
        for (int age : ages){
            System.out.println("Age: " + age);
        }
        for (double fee : fees) {
            System.out.println("Fees after taxes: " + fee+100);
        }

    }
}
