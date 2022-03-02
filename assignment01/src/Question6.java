import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your monthly calls:");
        int number = in.nextInt();
        double bills = 200;
        int flag=0;
        if(number>=100 && number<=150) flag=1;
        else if(number<=200) flag=2;
        else flag=3;
        switch(flag)
        {
            case 0:
                break;
            case 1:
                bills+=(number-100)*0.6;
                break;
            case 2:
                bills+=(number-150)*0.5+50*0.6;
                break;
            case 3:
                bills+=50*0.5+50*0.6+(number-200)*0.4;
                
        }
        System.out.println("The monthly telephone bills is  "+bills);
    }
}
