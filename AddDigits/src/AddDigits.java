/**
 * 
 */

/**
 * @author Kyran
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num < 0) {
            return 0;
        }

        int sum;
        while (num >= 10) {
            sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
