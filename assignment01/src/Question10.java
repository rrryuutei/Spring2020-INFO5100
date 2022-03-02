public class Question10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Test
        Box b = new Box(2, 2, 2);
        System.out.println("The volume of the box is "+ b.calVolume());
    }

}


class Box{
    private double width;
    private double height;
    private double depth;
    //构造方法，初始化对象
    public Box(double w,double h,double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    //计算Volume
    public double calVolume() {
        return width*height*depth;
    }
}
