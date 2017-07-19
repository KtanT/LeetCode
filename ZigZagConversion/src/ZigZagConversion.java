/**
 * 
 */

/**
 * @author Kyran
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        int length = s.length();
        if (length <= numRows || numRows == 1) {
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int index = 0;
        while (index < length) {
            for (int i = 0; i < numRows && index < length; i++) {
                sb[i].append(s.charAt(index++));
            }

            for (int i = numRows - 2; i > 0 && index < length; i--) {
                sb[i].append(s.charAt(index++));
            }
        }

        for (int i = 1; i < numRows; i++) {
            sb[0].append(sb[i]);
        }

        return sb[0].toString();
    }
}
