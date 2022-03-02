import java.util.ArrayList;

public class SeattlePoliceDepartment {
    public ArrayList<Person> persons;

    public String information;

    public SeattlePoliceDepartment() {
        persons = new ArrayList<Person>();
    }

    public void NotifyCitizens(String str) {
        for( Person p:persons ) {
            this.information = str;
            p.getNotification(this);
        }
    }
}
