package session7.methodOverriding;


public class Student extends Person {

    int stdId;

    public Student (int age, String name, int stdId){
        super(age, name);
        this.stdId = stdId;
        System.out.println("Student constructor called.");

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + stdId);
    }

    public void study(){
        System.out.println("Student is studying!");
    }
}
