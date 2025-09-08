package CreationalDesignPatterns.Singleton.BeforeSingleton;

public class Main {
   public static void main(String[] args) {
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();

        logger1.log("First log");
        logger2.log("Second log");

        System.out.println(logger1 == logger2); // false ❌ Different objects
    }
}
