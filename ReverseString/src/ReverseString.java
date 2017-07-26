/**
 * 
 */

/**
 * @author Kyran
 */
public class ReverseString {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sBuilder.append(s.charAt(i));
        }
        sBuilder.reverse();
        return sBuilder.toString();
    }
}
