/**
 * 
 */

/**
 * @author Kyran
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            n = n - i;
            if (n > 0) {
                continue;
            } else if (n == 0) {
                return i;
            } else {
                return i - 1;
            }
        }
        return 0;
    }
}
