package set;

import java.util.HashSet;

public class FindLengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        if (s.isBlank()) {
            return -1;
        } else if (s.length() == 1) {
            return 1;
        }
        int length = 0;
        int counter = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length() ; i++ ) {
            if (set.contains(s.charAt(i)))  {
                if (set.size() > length) {
                    length = set.size();
                }
                set.clear();
                i = ++counter;
            }
            else {
                set.add(s.charAt(i));
            }
        }
        return length;
    }
}
