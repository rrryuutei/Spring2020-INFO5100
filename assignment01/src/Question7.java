import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a string:");
        String ransomNote = in.next();
        System.out.println("Please input the other string:");
        String magazine = in.next();
        String[] arr1 = ransomNote.split("");
        String[] arr2 = magazine.split("");
        String newStr = "";
        for( int i=0; i<arr1.length; i++ ) {
            for( int j=0; j<arr2.length; j++ ) {
                if( arr1[i].equals(arr2[j]) ) {
                    newStr += arr1[i];
                    break;
                }
            }
        }
        System.out.println(ransomNote.equals(newStr));

    }

}
