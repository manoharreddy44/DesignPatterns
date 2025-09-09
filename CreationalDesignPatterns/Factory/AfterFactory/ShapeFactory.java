package CreationalDesignPatterns.Factory.AfterFactory;

class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        throw new IllegalArgumentException("Unknown shape type: " + type);
    }
}

