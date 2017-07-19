import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author Kyran
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        int result = 0;

        for (int i = 0, j = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)));
            }

            result = Math.max(result, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }

        return result;
    }
}
