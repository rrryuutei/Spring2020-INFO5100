package question1.shallowCopy;

public class main {
    public static void main(String[] args) {
        Student student = new Student("Ting", 12, 3);
        Student student1 = new Student(student);
        System.out.println(student);
        System.out.println(student1);

        student.setAge(19);

        System.out.println("shallowcopy");
        System.out.println(student);
        System.out.println(student1);
    }
}

