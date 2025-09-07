package SOLIDPrinciples.InterfaceSegregationPrinciple.BeforeISP;

class Sparrow implements Bird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void swim() {
        
        throw new UnsupportedOperationException("Sparrow can't swim");
    }

    public void run() {
        System.out.println("Sparrow is running");
    }
}