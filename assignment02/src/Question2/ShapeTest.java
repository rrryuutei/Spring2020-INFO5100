package Question2;

public class ShapeTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.0, 3.0);
        Circle c = new Circle(4.0);
        r.computerArea();
        r.computerPerimeter();
        c.computerArea();
        c.computerPerimeter();
        r.display();
        c.display();
        s.display();

    }

}