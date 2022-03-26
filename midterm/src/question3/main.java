package question3;

public class main {

    public static void main(String[] args) {
        Psychiatrist Amy = new Psychiatrist();
        Moody m1 = new Sad();
        Moody m2 = new Happy();



        System.out.println("How are you feeling today?");
        Amy.examine(m1);
        Amy.observe(m1);
        System.out.print("Observation is: ");
        System.out.println(Amy.toString(m1));

        System.out.println("How are you feeling today?");
        Amy.examine(m2);
        Amy.observe(m2);
        System.out.print("Observation is: ");
        System.out.println(Amy.toString(m2));

    }
}