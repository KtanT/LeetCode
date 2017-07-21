/**
 * 
 */

/**
 * @author Kyran
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int length = s.length();
        int start = 0, end = length - 1;
        s = s.toLowerCase();

        while (start <= end) {
            if (!isWord(s.charAt(start))) {
                start++;
                continue;
            }
            if (!isWord(s.charAt(end))) {
                end--;
                continue;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }

    private boolean isWord(char c) {
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }
}
