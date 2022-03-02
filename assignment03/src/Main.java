
public class Main {
    public static void main(String[] args) {
        SeattlePoliceDepartment department = new SeattlePoliceDepartment();
        Person person1 = new Person("Ting", 22);
        Person person2 = new Person("Min", 22);
        Person person3 = new Person("Jia", 23);
        Person person4 = new Person("Wen", 19);

        person1.subscribe(department);
        person2.subscribe(department);
        person3.subscribe(department);
        department.NotifyCitizens("Something is wrong!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        person3.unSubscribe(department);
        department.NotifyCitizens("Nothing is wrong!");
    }
}
