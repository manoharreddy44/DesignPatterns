package CreationalDesignPatterns.Factory.BeforeFactory;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape square = new Square();
        square.draw();
    }
}
