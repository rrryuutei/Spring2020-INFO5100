package question1.shallowCopy;


    public class Student {
        private String name;
        private int age;
        private int gpa;

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

        public Student(String name, int age, int gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        public Student(Student student){
            this.age =student.age;
            this.name = student.name;
            this.gpa= student.gpa;

        }


    }

