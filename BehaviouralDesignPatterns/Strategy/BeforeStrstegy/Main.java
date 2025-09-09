package BehaviouralDesignPatterns.Strategy.BeforeStrstegy;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.pay("credit", 500);
        service.pay("paypal", 300);
    }
}

