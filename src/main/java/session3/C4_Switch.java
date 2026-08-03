package session3;

import java.util.Scanner;

public class C4_Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade (A, B, C, D, F): ");
        String grade = scanner.nextLine();

        switch (grade) {
            case "A" :
                System.out.println(" Excellent!");
                break;
            case "B" :
                System.out.println(" Good job!");
                break;
            case "C" :
                System.out.println(" Well done!");
                break;
            case "D" :
                System.out.println(" You passed");
                break;
            case "F" :
                System.out.println(" Better luck next time");
                break;
            default:
                System.out.println("Invalid grade");
        }

    }
}
