package SOLIDPrinciples.InterfaceSegregationPrinciple.AferISP;

public class Main {
    public static void main(String[] args) {
        Flyable sparrow = new Sparrow();
        sparrow.fly();

        Swimmable penguin = new Penguin();
        penguin.swim();
    }
}

