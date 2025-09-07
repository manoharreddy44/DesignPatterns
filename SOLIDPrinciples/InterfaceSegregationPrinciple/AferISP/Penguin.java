package SOLIDPrinciples.InterfaceSegregationPrinciple.AferISP;

class Penguin implements Swimmable, Runnable {
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    public void run() {
        System.out.println("Penguin is running");
    }
}
