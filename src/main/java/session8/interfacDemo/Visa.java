package session8.interfacDemo;

public class Visa implements Payable, Refundable{

    @Override
    public void pay(double amount) {
        System.out.println("Paid via Visa : " + amount);
    }

    @Override
    public void welcome(){
        System.out.println("Hi Visa");
    }

    @Override
    public void refund(double amount){
        System.out.println("Refunded via Visa : " + amount);

    }

}
