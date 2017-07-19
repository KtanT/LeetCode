/**
 * 
 */

/**
 * @author Kyran
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        int length = string.length();
        int start = 0, end = length - 1;

        while (start <= end) {
            if (string.charAt(start++) != string.charAt(end--)) {
                return false;
            }
        }

        return true;
    }
}
