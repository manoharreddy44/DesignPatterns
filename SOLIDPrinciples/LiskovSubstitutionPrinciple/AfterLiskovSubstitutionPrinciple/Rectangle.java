package SOLIDPrinciples.LiskovSubstitutionPrinciple.AfterLiskovSubstitutionPrinciple;

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
