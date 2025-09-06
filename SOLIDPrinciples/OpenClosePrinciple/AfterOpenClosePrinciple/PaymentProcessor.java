package SOLIDPrinciples.OpenClosePrinciple.AfterOpenClosePrinciple;

class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.pay();  // Polymorphism
    }
}
