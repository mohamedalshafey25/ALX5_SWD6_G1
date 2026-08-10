package session5;

public class C2_Methods {
    static String userName;
    static int password;

    public static void main(String[] args) {

        register("mohamedAlshafey",12345);
        login();

    }


    // Method Definition / Declaration ( Outside main)
    public static void register(String user, int pass ){
        userName = user;
        password = pass;
        welcome();
        System.out.println("Registered Successfully with userName: !" + userName);
    }
    public static void login(){
        System.out.println("LogedIn Successfully!");
    }

    protected static void welcome(){
        if (timeStamp() < 12) {
            System.out.println("Good Morning!" + userName);
        } else if (timeStamp() < 18) {
            System.out.println("Good Afternoon!" + userName);
        } else {
            System.out.println("Good Evening!" + userName);
        }
        System.out.println("Welcome to the Java Methods Example!");    }
    private static int timeStamp() {
        return java.time.LocalTime.now().getHour();
    }


/**
    // Built in methods
    // println(), print(), printf(), next().

    // User defined methods
    // defined by user

    // Method Calling
*/
}
