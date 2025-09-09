//The Strategy Pattern allows you to define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.


package BehaviouralDesignPatterns.Strategy.BeforeStrstegy;

class PaymentService {
    public void pay(String method, double amount) {
        if (method.equals("credit")) {
            System.out.println("Paid " + amount + " using Credit Card");
        } else if (method.equals("paypal")) {
            System.out.println("Paid " + amount + " using PayPal");
        } else if (method.equals("upi")) {
            System.out.println("Paid " + amount + " using UPI");
        }
    }
}
