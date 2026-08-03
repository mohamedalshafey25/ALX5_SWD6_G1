package session3;

import java.util.Scanner;

public class C2_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.next(); // consume the newline character left by nextInt()

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + ", you are " + age + " years old.");



    }
}
