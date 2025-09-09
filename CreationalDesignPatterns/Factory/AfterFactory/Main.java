package CreationalDesignPatterns.Factory.AfterFactory;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        Shape shape2 = ShapeFactory.getShape("square");
        Shape shape3 = ShapeFactory.getShape("rectangle");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}

