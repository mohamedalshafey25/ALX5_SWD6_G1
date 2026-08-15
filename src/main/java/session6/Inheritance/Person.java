package session6.Inheritance;

public class Person {
    // Attributes

    String name;
    int age;
    String address;
    String nationality;

    public Person(int age, String name) {
    }

    public Person() {
    }

    // Constructors



    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Nationality: " + nationality);
    }




}
