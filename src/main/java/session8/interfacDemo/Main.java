package session8.interfacDemo;

public class Main {

    public static void main(String[] args) {

        Payable pay1 = new PayPal();
        pay1.welcome();
        pay1.pay(1500.66);

        Payable pay2 = new Visa();
        pay2.welcome();
        pay2.pay(100.50);

        PayPal pay3 = new PayPal();
        pay3.welcome();
        pay3.pay(120.5);
        pay3.refund(120.5);

        Visa pay4 = new Visa();
        pay4.welcome();
        pay4.pay(500.55);
        pay4.refund(500.55);

        Refundable ref1 = new PayPal();
        ref1.refund(120.5);

        Refundable ref2 = new Visa();
        ref2.refund(20.0);


        Payable p1;

        p1 = new Visa();
        p1 = new PayPal();




    }
}
