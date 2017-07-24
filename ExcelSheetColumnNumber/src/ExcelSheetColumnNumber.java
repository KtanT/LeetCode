/**
 * 
 */

/**
 * @author Kyran
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }

        int length = s.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            result = result * 26 + s.charAt(i) - 'A' + 1;
        }

        return result;
    }
}
