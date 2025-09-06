package SOLIDPrinciples.LiskovSubstitutionPrinciple.BeforeLiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Square(); // Substitution
        rect.setWidth(5);
        rect.setHeight(10);

        System.out.println(rect.getArea()); // Expected: 50, but gets 100
    }
}

