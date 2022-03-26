package question1.deepcopy;

public class main {
    public static void main(String[] args) {
        Dem engineering = new Dem("BIO");
        Student student1 = new Student();
        Student student2 = new Student(student1);
        student2.setName("ting");
        student2.setAge(10);
        student2.setGpa(4);
        student2.setDemonstrate(engineering);

        System.out.println(student1);
        System.out.println(student2);


    }
}









