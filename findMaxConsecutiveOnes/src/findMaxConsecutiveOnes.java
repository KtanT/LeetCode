/**
 * #485
 */

/**
 * @author Kyran
 */
public class findMaxConsecutiveOnes {
    public static int testCase(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = sum;
            sum = sum + nums[i];
            if (sum > max) {
                max = sum;
            }
            if (temp == sum) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] test = { 1, 1, 0, 1, 1, 1, 0 };
        System.out.println(testCase(test));
    }
}
