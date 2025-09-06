package SOLIDPrinciples.OpenClosePrinciple.AfterOpenClosePrinciple;

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Processing Credit Card Payment...");
    }
}
