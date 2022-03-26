package question1.deepcopy;

public class Student {
    private String name;
    private int age;
    private int gpa;
    private Dem demonstrate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public Dem getDemonstrate() {
        return demonstrate;
    }

    public void setDemonstrate(Dem demonstrate) {
        this.demonstrate = demonstrate;
    }

    public Student() {
    }

    public Student(String name, int age, int gpa, Dem demonstrate) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.demonstrate = demonstrate;
    }

    public Student(Student student){
        this.age =student.age;
        this.name = student.name;
        this.gpa= student.gpa;
        this.demonstrate= student.demonstrate;

    }


}

class Dem {
    private String demonstrate;

    public String getDemonstrate() {
        return demonstrate;
    }

    public void setDemonstrate(String demonstrate) {
        this.demonstrate = demonstrate;
    }

    public Dem(String demonstrate) {
        this.demonstrate = demonstrate;
    }
}