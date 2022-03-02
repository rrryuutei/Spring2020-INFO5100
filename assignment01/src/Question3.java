import java.util.Scanner;

/**
 * @author Ting
 *Question 3. Write a program to check if stringcontains duplicates
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a string:");
        String str = in.next();
        if(str.matches("^.*?(.+?)\\1.*?$")){	//正规表达式，判断是否重复
            System.out.println("repeat");
        }else {
            System.out.println("no repeat");
        }
    }

}
