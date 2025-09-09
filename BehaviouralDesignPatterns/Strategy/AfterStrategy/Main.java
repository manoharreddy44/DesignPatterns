package BehaviouralDesignPatterns.Strategy.AfterStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.pay(500);

        context.setPaymentStrategy(new PayPalPayment());
        context.pay(300);

        context.setPaymentStrategy(new UpiPayment());
        context.pay(200);
    }
}

