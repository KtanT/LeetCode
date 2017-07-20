/**
 * 
 */

/**
 * @author Kyran
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 0) {
            return "";
        }

        String s = "1";
        for (int i = 1; i < n; i++) {
            s = countId(s);
        }
        return s;
    }

    private String countId(String s) {
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                sb.append(count).append(c);
                c = s.charAt(i);
                count = 1;
            }
        }

        sb.append(count).append(c);
        return sb.toString();
    }
}
