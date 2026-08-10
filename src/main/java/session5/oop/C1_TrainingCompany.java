package session5.oop;

public class C1_TrainingCompany {

    // Attributes
    String name;
    String address;
    int capacity;
    boolean availability;

    // Constructors

    // Methods / Actions
    public void displayInfo() {
        System.out.println("Company Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Capacity: " + capacity);
        System.out.println("Availability: " + availability);
    }

    public void teachCourse(String courseName) {
        System.out.println("Teaching course: " + courseName);
    }


}
