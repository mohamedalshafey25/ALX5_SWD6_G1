package session3;

public class C1_Operators {

    public static void main(String[] args) {

        // unary operators
         // ++ and -- operators

        int x = 5;
        System.out.println(x++); // prints 5, then increments x to 6

        int y = 5;
        System.out.println(++y); // increments y to 6, then prints 6

        System.out.println(x--); // prints 6, then decrements x to 5
        System.out.println(--y); // decrements y to 5, then prints 5

        // Relational Operators

        int num1 = 10;
        int num2 = 20;
        boolean isN1LessN2 = num1 < num2; // true

        System.out.println(num1 < num2); // true
        System.out.println(num1 == num2); // false
        System.out.println(num1 > num2); // false
        System.out.println(num1 != num2); // true
        System.out.println(num1 >= num2); // false
        System.out.println(num1 <= num2); // true



        // Logical Operators
         // && and || and ! operators

        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue && isFalse); // false
        System.out.println(isTrue || isFalse); // true
        System.out.println(!isTrue); // false
        System.out.println(!isFalse); // true

        // Assignment Operators
        int a = 10;
        a += 5; // a = a + 5
        a -= 3; // a = a - 3
        a *= 2; // a = a * 2
        a /= 4; // a = a / 4
        a %= 3; // a = a % 3


    }
}
