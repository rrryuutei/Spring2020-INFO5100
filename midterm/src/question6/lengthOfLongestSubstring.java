package question6;

import java.util.HashMap;

public class lengthOfLongestSubstring {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();

            int start = 0, end = 0, longestSubStringLength = 0;

            while (end < s.length()) {
                String endLetter = String.valueOf(s.charAt(end));
                if (map.containsKey(endLetter)) {
                    int conflictIndex = map.get(endLetter);
                    for (int i=start; i<=conflictIndex; i++) {
                        map.remove(String.valueOf(s.charAt(i)));
                    }
                    start = conflictIndex + 1;
                    map.put(endLetter, end);
                    longestSubStringLength = Math.max(longestSubStringLength, map.size());
                } else {
                    map.put(endLetter, end);
                    longestSubStringLength = Math.max(longestSubStringLength, map.size());
                }
                end++;
            }

            return longestSubStringLength;
        }
    }
}

