/**
 * 
 */

/**
 * @author Kyran
 */
public class HouseRobber {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0 || nums == null) {
            return 0;
        }

        int[] result = new int[length + 1];
        result[0] = 0;
        result[1] = nums[0];

        for (int i = 2; i < length + 1; i++) {
            result[i] = Math.max(result[i - 1], result[i - 2] + nums[i - 1]);
        }

        return result[length];
    }
}
