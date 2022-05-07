import java.util.ArrayList;
import java.util.List;

public class question03 {
    /*
    Given a string s, find the length of the longest substring without repeating characters.
     */
    public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            int res = 0;
            List<Character> list = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (list.contains(ch)) {
                    res = Math.max(list.size(), res);
                    list.subList(0, list.indexOf(ch) + 1).clear();
                }

                list.add(ch);
            }
            return Math.max(list.size(), res);
        }
    }


