package Question2;

public class Circle extends Shape{
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        super.setName("Circle");
        this.radius = radius;
    }

    public void computerArea() {
        super.setArea(radius*3.14*radius);
    }

    public void computerPerimeter() {
        super.setPerimeter(radius*2*3.14);
    }
}
