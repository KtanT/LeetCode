/**
 * 
 */

/**
 * @author Kyran
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.trim().length() == 0) {
            return null;
        }

        int len = s.length();
        int maxLen = 0;
        int start = 0;

        if (len == 1) {
            return s;
        }

        for (int i = 0; i < len; i++) {
            int j = i - 1;
            int k = i + 1;

            while (j >= 0 && k < len && s.charAt(j) == s.charAt(k)) {
                if (k - j + 1 > maxLen) {
                    maxLen = k - j + 1;
                    start = j;
                }

                j--;
                k++;
            }
        }
        for (int i = 0; i < len; i++) {
            int j = i;
            int k = i + 1;

            while (j >= 0 && k < len && s.charAt(j) == s.charAt(k)) {
                if (k - j + 1 > maxLen) {
                    maxLen = k - j + 1;
                    start = j;
                }

                j--;
                k++;
            }
        }

        if (maxLen > 0) {
            return s.substring(start, start + maxLen);
        }

        return s.substring(0, 1);
    }
}
