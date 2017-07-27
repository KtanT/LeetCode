/**
 * 
 */

/**
 * @author Kyran
 */
public class MinMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int min = nums[0];
        for (int i : nums) {
            min = Math.min(min, i);
        }

        int result = 0;
        for (int i : nums) {
            result += (i - min);
        }

        return result;
    }
}
