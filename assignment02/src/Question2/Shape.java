package Question2;


    public class Shape {
        private String name;
        private double area,perimeter;

        public Shape() {
            this.name = "Shape";
            this.area = 0;
            this.perimeter = 0;
        }

        public Shape(double area,double perimter) {
            this.area = area;
            this.perimeter = perimter;
        }

        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }


        public double getArea() {
            return area;
        }


        public void setArea(double area) {
            this.area = area;
        }


        public double getPerimeter() {
            return perimeter;
        }


        public void setPerimeter(double perimeter) {
            this.perimeter = perimeter;
        }


        public void display() {
            System.out.println("The shape is "+ name+ ", the area is "+ area+ " the perimeter is "+ perimeter);
        }
    }

