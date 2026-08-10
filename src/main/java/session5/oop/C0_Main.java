package session5.oop;

public class C0_Main {
    public static void main(String[] args) {

        C1_TrainingCompany skillsDynamix = new C1_TrainingCompany();

        skillsDynamix.name= "Skills Dynamix";
        skillsDynamix.address = "Alex";
        skillsDynamix.capacity= 1000;
        skillsDynamix.availability= true;

        skillsDynamix.displayInfo();
        skillsDynamix.teachCourse("Testing");


        C1_TrainingCompany tc2 = new C1_TrainingCompany();
        tc2.name= "worker";
        tc2.displayInfo();

    }
}
