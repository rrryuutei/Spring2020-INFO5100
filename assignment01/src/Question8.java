import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Please input grade:");
        int grade = in.nextInt();
        String mean = "";
        if( grade>=90&&grade<=100 ) {
            mean = "Excellent";
        }else if( grade>=80&&grade<90 ) {
            mean = "Good";
        }else if( grade>=70&&grade<80 ) {
            mean = "Average";
        }else if( grade>=60&&grade<70 ) {
            mean = "Ddficient";
        }else if( grade>=0&&grade<60 ){
            mean = "Failing";
        }else {
            mean = "Wrong grade";
        }
        System.out.println("The grade is "+ mean);
    }

}
