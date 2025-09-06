package SOLIDPrinciples.OpenClosePrinciple.AfterOpenClosePrinciple;

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Processing UPI Payment...");
    }
}
