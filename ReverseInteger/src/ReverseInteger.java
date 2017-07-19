/**
 * 
 */

/**
 * @author Kyran
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int lastBit = x % 10;
            int temp = result * 10 + lastBit;

            if ((temp - lastBit) / 10 != result) {
                return 0;
            }

            x = x / 10;
            result = temp;
        }

        return result;
    }
}
