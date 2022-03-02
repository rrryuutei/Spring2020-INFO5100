import java.util.Scanner;

public class Question5 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a year：");
        int yearNum = sc.nextInt();
        if (yearNum%4==0 && yearNum%100!=0)
        {
            System.out.println("It is a leap year");

        }
        else
        {
            if (yearNum%400==0)
            {
                System.out.println("It is a leap year");
            }
            else
            {
                System.out.println("It is not a leap year");
            }
        }
    }
}



