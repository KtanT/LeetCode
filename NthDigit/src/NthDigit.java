/**
 * 
 */

/**
 * @author Kyran
 */
public class NthDigit {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String string = Integer.toString(start);
        return Character.getNumericValue(string.charAt((n - 1) % len));
    }
}
