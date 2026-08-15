package session7.methodOverriding;

public class Person {

    int age;
    String name;

    public Person (int age, String name){
        System.out.println("Person constructor called.");
        this.age = age;
        this.name = name;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
