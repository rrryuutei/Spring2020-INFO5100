package Question3;

public class Shape {
    private String name;
    private String color;
    private double area;
    private double perimeter;

    public Shape() {
        this.name = null;
        this.color = null;
        this.area = 0;
        this.perimeter = 0;
    }

    public Shape(String name,String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name,String color,double perimeter,double area) {
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public void printShape() {
        System.out.println("The shape is "+this.name);
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


    public void setArea(double area) {
        this.area = area;
    }


}

