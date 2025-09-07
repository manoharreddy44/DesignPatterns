package SOLIDPrinciples.InterfaceSegregationPrinciple.AferISP;

class Sparrow implements Flyable, Runnable {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void run() {
        System.out.println("Sparrow is running");
    }
}
