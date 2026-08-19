package session8.interfacDemo;

public class PayPal implements Payable , Refundable{

    @Override
    public void pay(double amount){
        System.out.println("Paid via PayPal : " + amount);
    }

    @Override
    public void welcome(){
        System.out.println("Hi PayPal");
    }

    @Override
    public void refund(double amount){
        System.out.println("Refunded via PayPal : " + amount);

    }
}