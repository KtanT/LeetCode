import java.util.Stack;

/**
 * 
 */

/**
 * @author Kyran
 */
public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                stack.push(s.charAt(i));
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                sb.append(stack.pop());
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
