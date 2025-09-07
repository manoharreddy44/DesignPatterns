package SOLIDPrinciples.InterfaceSegregationPrinciple.BeforeISP;

class Penguin implements Bird {
    public void fly() {
        
        throw new UnsupportedOperationException("Penguin can't fly");
    }

    public void swim() {
        System.out.println("Penguin is swimming");
    }

    public void run() {
        System.out.println("Penguin is running");
    }
}
