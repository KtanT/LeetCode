/**
 * 
 */

/**
 * @author Kyran
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }

        int num = 0;
        String string = Integer.toBinaryString(result);
        for (int i = 0; i < 32; i++) {
            if (string.charAt(i) != ' ' && string.charAt(i) == '1') {
                num++;
            }
        }

        return num;
    }
}
