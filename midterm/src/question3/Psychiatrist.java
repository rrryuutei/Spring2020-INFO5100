package question3;

public class Psychiatrist {

        public void examine (Moody moody) {
            System.out.println("How are you feeling today?");
            moody.queryMood();
        }

        public void observe(Moody moody) {

            moody.ExpressFeelings();
        }

        public String toString(Moody moody) {

            return "Observation: " + moody.toString();
        }
    }


