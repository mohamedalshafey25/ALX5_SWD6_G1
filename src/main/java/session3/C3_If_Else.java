package session3;

import java.util.Scanner;

public class C3_If_Else {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
//        scanner.nextLine(); // consume the newline character left by nextInt()

        boolean canRegister;

//        // (1) if statement
//        if (age>= 18 ) {
//            canRegister = true;
//            System.out.println("You can register");
//        }

        // rest of the program

        // (2) if-else statement

//        if (age>= 18 ) {
//            canRegister = true;
//            System.out.println("You can register");
//        } else {
//            canRegister = false;
//            System.out.println("You cannot register");
//        }

        // (3) if-else if ladder statement
        if (age < 13) {
            System.out.println("You are a child.");
        } else if ( age >= 13 && age < 20 ) {
            System.out.println("You are a teenager");
        } else if (age >= 20 && age < 60) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }


    }
}
