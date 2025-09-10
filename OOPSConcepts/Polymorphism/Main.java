package OOPSConcepts.Polymorphism;

public class Main {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();
        System.out.println(m.add(2, 3));     // 5
        System.out.println(m.add(2.5, 3.5)); // 6.0

        Animal a = new Cat();
        a.sound(); // Meow (runtime polymorphism)
    }
}
