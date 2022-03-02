package Question3;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double side) {
        this.base = side;
        this.height = Math.pow(3, 0.5) * base / 2;
    }

    public double getArea() {
        return base * height / 2;
    }

    public double getPerimeter() {
        return 3 * base;
    }


    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


}
