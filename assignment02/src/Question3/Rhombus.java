package Question3;

public class Rhombus extends Shape {
    private double d1;
    private double d2;


    public Rhombus(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }


    public Rhombus(double d1) {
        this.d1 = d1;
        this.d2 = d1;
    }

    public double getArea() {
        return d1 * d2 / 2;
    }

    public double getPerimeter() {
        return 2 * Math.sqrt(d1 * d1 + d2 * d2);
    }


    public double getDiagonal1() {
        return d1;
    }


    public void setDiagonal1(double d1) {
        this.d1 = d1;
    }


    public double getDiagonal2() {
        return d2;
    }


    public void setDiagonal2(double d2) {
        this.d2 = d2;
    }
}
