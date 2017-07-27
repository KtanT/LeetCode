import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author Kyran
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        int len = set.size();
        if (len > 0) {
            len--;
        }

        return s.length() - len;
    }
}
