package session2;

public class C1_Basics {

    public static void main(String[] args) {

        System.out.print("HEllo! Ana big star here \n");

        // Data Types

        // Primitive Data Types
        byte b = 127; // 1 byte
        short s = 32767; // 2 bytes
        int i = 2147483647; // 4 bytes
        long l = 9223372036854775807L; // 8 bytes
        float f = 3.4028235E38F; // 4 bytes
        double d = 1.7976931348623157E308; // 8 bytes
        char c = 'A'; // 2 bytes
        boolean bool = true; // 1 byte

        // Non-Primitive Data Types
        String str = "Hello World"; // String is a class in Java

        int x;   // Declaration
        x = 10; // Initialization
        float fb = 10.5f; // Declaration and Initialization
//        System.out.println(x); // using variable

        // single line comment //

        /**
            multi-line comments
            multi-line comments
            multi-line comments
        */

        // Output formatting
//        System.out.println("Hello");
//        System.out.println("World");

        String name = "Mohamed";
        float age = 32.5f;
        int code = 123;
        double salary = 1500.67;


        System.out.println("Name: " + name + ", Age: " + age + ", Code: " + code + ", Salary: " + salary);
        System.out.printf("Name: %s & Age: %.1f & Code: %d & Salary: %f" ,name , age , code , salary);

        final int CONSTANT = 10 ;
//        CONSTANT = 50; // final variable cannot be changed

//        int x1 = 10;
//        int y1 = 20;
//        System.out.println(x1 + y1); // add variables 10 + 20 = 30
//        System.out.println("x1 + y1"); // print the string "x1 + y1" as it is
//        System.out.println("x1" + "y1"); // String concatenation "Mohamed" + "Ahmed" = MohamedAhmed
    }

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

}
