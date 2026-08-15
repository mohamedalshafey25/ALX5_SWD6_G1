package session7.methodOverriding;

public class Employee extends Person{

    int empId;

    public Employee (int age, String name, int empId){

        super(age, name);
        this.empId = empId;
        System.out.println("Employee constructor called.");

    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID : " + empId);
    }
    public void work(){
        System.out.println("Employee is working!");
    }
}
