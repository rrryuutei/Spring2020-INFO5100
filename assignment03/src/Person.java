public class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void subscribe(SeattlePoliceDepartment spd) {
        if( !spd.persons.contains(this) ) {
            spd.persons.add(this);
        }
    }

    public void unSubscribe(SeattlePoliceDepartment spd) {
        if( !spd.persons.contains(this) ) {
            spd.persons.remove(this);
        }
    }

    public void getNotification(SeattlePoliceDepartment spd) {
        System.out.println("--------------------------------------------");
        System.out.println("Person Name:"+this.getName());
        System.out.println("Notification content :"+spd.information);
        System.out.println("--------------------------------------------");
    }
}


