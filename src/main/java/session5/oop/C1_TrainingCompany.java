package session5.oop;

public class C1_TrainingCompany {

    // Attributes
    String name;
    String address;
    int capacity;
    boolean availability;

    // Constructors
    public C1_TrainingCompany(String name, String address,int capacity, boolean availability){
        System.out.println("Customized Constructor called!");

        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.availability = availability;
    }

    public C1_TrainingCompany(String name){
        System.out.println("name Constructor called!");
        this.name = name;
    }

    public C1_TrainingCompany(String name, String address){
        System.out.println("name Constructor called!");
        this.name = name;
        this.address = address;
    }


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

    public void enable(){
        this.availability=true;
        System.out.println("Company activated and status is: "+ availability);
    }

    public void disable(){
        this.availability=false;
        System.out.println("Company deactivated and status is: "+ availability);
    }

}
