package BehaviouralDesignPatterns.Strategy.AfterStrategy;

class UpiPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
