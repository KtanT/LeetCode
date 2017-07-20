/**
 * 
 */

/**
 * @author Kyran
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }

        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (length == 0) {
                length++;
            } else {
                if (s.charAt(i) == ' ') {
                    break;
                } else {
                    length++;
                }
            }
        }

        return length;
    }
}
