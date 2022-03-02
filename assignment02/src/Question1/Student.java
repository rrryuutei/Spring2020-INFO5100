package Question1;

public class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber,String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String printName() {
        return this.name;
    }

    public int printRoll() {
        return this.rollNumber;
    }


}