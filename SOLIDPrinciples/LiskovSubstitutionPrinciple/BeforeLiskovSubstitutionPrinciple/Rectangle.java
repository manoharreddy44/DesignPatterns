//Objects of a superclass should be replaceable with objects of a subclass without breaking the application’s behavior.

//That means → Subclasses should behave like their parent class, without introducing unexpected behavior.


package SOLIDPrinciples.LiskovSubstitutionPrinciple.BeforeLiskovSubstitutionPrinciple;

class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public int getArea() { return width * height; }
}
