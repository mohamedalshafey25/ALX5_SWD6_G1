package session5;

public class C3_MethodOverloading {
    public static void main(String[] args) {
        // Method overloading: same method name, different parameter list

addNumbers(5,6,5.5);

    }

    public static int addNumbers(int a, int b) {
        System.out.println("Adding two integers: " + a + " and " + b);
        return a + b;
    }
    public static int addNumbers(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + ", " + b + ", and " + c);
        return b + a + c;
    }
    public static double addNumbers(int a, int b, double c) {
        System.out.println("Adding two integers and a double: " + a + ", " + b + ", and " + c);
        return b + a + c;
    }


}
