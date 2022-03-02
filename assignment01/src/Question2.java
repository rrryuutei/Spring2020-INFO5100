import java.util.Scanner;

/**
 * @author Ting
 * Question2: Write a program to check if a stringhas all unique characters.
 *
 */
public class Question2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.print("Please input a string:");
        String s = in.next();
        if(isUnique(s))
            System.out.println("not unique");
        else
            System.out.println("is unique");
    }

    private static boolean isUnique(String s) {
        // TODO Auto-generated method stub
        boolean[] char_set = new boolean[256];	//创建一个Boolean数组，大小为256
        for(int i=0;i<s.length();i++) {	//遍历字符串
            int val = s.charAt(i);	//获取当前字符的位置
            if(char_set[val]) {		//如果当前字符为假，返回false，代表出现过了
                return false;
            }
            char_set[val] = true;	//将遍历的字符的位置置为true
        }
        return true;

    }


}

