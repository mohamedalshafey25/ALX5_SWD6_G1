package session4;

import java.util.Scanner;

public class C2_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String registeredPassword = "1234";
        String enteredPassword = "1234";

        System.out.println("Before loop");

        do {
            System.out.println("Enter your password: ");
            enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(registeredPassword)) {
                System.out.println("Password is correct. Access granted.");
            } else {
                System.out.println("Password is incorrect. Access denied.Try again");
            }
        }
        while (!enteredPassword.equals(registeredPassword));

        System.out.println("Welcome to your profile!");


    }
}