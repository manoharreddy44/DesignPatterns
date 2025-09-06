//Software entities (classes, modules, functions) should be open for extension but closed for modification.
//Meaning → You should be able to add new functionality without changing existing code.


package SOLIDPrinciples.OpenClosePrinciple.BeforeOpenClosePrinciple;

class PaymentProcessor {
    public void processPayment(String type) {
        if (type.equals("CreditCard")) {
            System.out.println("Processing Credit Card Payment...");
        } else if (type.equals("UPI")) {
            System.out.println("Processing UPI Payment...");
        } else if (type.equals("PayPal")) {
            System.out.println("Processing PayPal Payment...");
        }
    }
}

