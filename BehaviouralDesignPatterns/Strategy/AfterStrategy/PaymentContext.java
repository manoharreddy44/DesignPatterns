package BehaviouralDesignPatterns.Strategy.AfterStrategy;

public class PaymentContext {
  private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not set!");
        }
        strategy.pay(amount);
    }
}
