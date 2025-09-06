package SOLIDPrinciples.OpenClosePrinciple.AfterOpenClosePrinciple;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();
        Payment p3 = new PayPalPayment();

        processor.processPayment(p1);
        processor.processPayment(p2);
        processor.processPayment(p3);

        // Tomorrow, if we add BitcoinPayment
        Payment p4 = new BitcoinPayment();
        processor.processPayment(p4);
    }
}


class BitcoinPayment implements Payment {
    public void pay() {
        System.out.println("Processing Bitcoin Payment...");
    }
}

