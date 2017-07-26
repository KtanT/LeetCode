/**
 * 
 */

/**
 * @author Kyran
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if (num == 0) {
            return false;
        }
        if (num != 1 && num % 4 != 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        return isPowerOfFour(num / 4);
    }
}
