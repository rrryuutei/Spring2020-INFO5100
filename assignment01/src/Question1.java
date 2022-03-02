import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);
        System.out.print("Please input a string:");
        String str = reader.next();
        if(rotor1(str)!=true) {
            System.out.println("It is a Palindrome");
        }else {
            System.out.println("It is not a Palindrome");
        }


    }

    //判断是否为回文串
    public static boolean rotor1(String a) {
        for( int i=0; i<a.length()/2; i++) {	//循环遍历字符串
            if(a.charAt(i)!=a.charAt(a.length()-i-1)) {	//判断字母是否相等
                return false;
            }
        }
        return true;
    }

}
