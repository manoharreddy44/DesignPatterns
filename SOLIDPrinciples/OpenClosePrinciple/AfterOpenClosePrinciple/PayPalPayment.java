package SOLIDPrinciples.OpenClosePrinciple.AfterOpenClosePrinciple;

class PayPalPayment implements Payment {
    public void pay() {
        System.out.println("Processing PayPal Payment...");
    }
}
