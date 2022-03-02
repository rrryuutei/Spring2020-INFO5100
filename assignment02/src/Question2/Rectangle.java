package Question2;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double length,double width) {
        super.setName("Rectangle");
        this.length = length;
        this.width = width;
    }

    public void computerArea() {
        super.setArea(length*width);
    }

    public void computerPerimeter() {
        super.setPerimeter(length*width*2);
    }
}