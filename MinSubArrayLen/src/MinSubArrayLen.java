/**
 * 
 */

/**
 * @author Kyran
 */
public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int len = nums.length;

        while (start < len && end < len) {
            while (sum < s && end < len) {
                sum = sum + nums[end++];
            }

            while (sum >= s && start <= end) {
                min = Math.min(min, end - start);
                sum = sum - nums[start++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
