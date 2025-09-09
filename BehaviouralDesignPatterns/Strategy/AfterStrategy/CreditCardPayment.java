package BehaviouralDesignPatterns.Strategy.AfterStrategy;

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
