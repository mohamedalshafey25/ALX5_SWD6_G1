package session6.Inheritance;

public class AMain {
    public static void main(String[] args) {
        GraduateStudent gs1 = new GraduateStudent();
        gs1.name = "Mohamed";
        gs1.age = 26;
        gs1.address = "Cairo";
        gs1.nationality= "Egyptian";

        gs1.stID = 101;
        gs1.faculty = "Alex";

        gs1.gradYear = 2025;
        gs1.gpa = 3.8;

        gs1.displayInfo();
        gs1.study();
        gs1.graduate();


    }
}
