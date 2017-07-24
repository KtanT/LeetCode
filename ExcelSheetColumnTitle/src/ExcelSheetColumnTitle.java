/**
 * 
 */

/**
 * @author Kyran
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }

        StringBuilder sBuilder = new StringBuilder();
        while (n != 0) {
            sBuilder.insert(0, (char) ('A' + (--n) % 26));
            n = n / 26;
        }

        return sBuilder.toString();
    }
}
