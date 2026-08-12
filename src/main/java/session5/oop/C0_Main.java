package session5.oop;

public class C0_Main {
    public static void main(String[] args) {

        C1_TrainingCompany skillsDynamix = new C1_TrainingCompany("Skills Dynamix","Alexandria",2000,true);

//        skillsDynamix.name= "Skills Dynamix";
//        skillsDynamix.address = "Alex";
//        skillsDynamix.capacity= 1000;
//        skillsDynamix.availability= true;

        skillsDynamix.displayInfo();
        skillsDynamix.teachCourse("Testing");

        C1_TrainingCompany tc2 = new C1_TrainingCompany("TestPro", "Cairo", 500, false);
        tc2.displayInfo();
        tc2.enable();
        tc2.disable();

        C1_TrainingCompany tc3 = new C1_TrainingCompany("TestSkill");
        C1_TrainingCompany tc4 = new C1_TrainingCompany("TesterWork","Monoufia");

    }

}
