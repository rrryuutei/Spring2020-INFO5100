import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Please input a string:");
        String s = in.next();
        System.out.println("Please input another string:");
        String t = in.next();
        if( anagram(s, t) ) {
            System.out.println("anagrams");
        }else {
            System.out.println("not anagrams");
        }
    }
    public static boolean anagram(String s, String t) {
        if (s==null || t==null || s.length()!=t.length()) {
            return false;
        }
        int[] ss = new int[256];
        int[] tt = new int[256];
        for (int i=0; i<s.length(); i++) {
            ss[s.charAt(i)]++;
            tt[t.charAt(i)]++;
        }
        for (int j=0; j<256; j++) {
            if (ss[j] != tt[j]) {
                return false;
            }
        }
        return true;
    }
}

