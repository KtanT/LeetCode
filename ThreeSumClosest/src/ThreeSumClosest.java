import java.util.Arrays;

/**
 * 
 */

/**
 * @author Kyran
 */
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int temp = nums[i] + nums[low] + nums[high];
                if (temp > target) {
                    high--;
                } else {
                    low++;
                }
                if (Math.abs(result - target) > Math.abs(temp - target)) {
                    result = temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 2, 1, - 4 };
        System.out.println(threeSumClosest(nums, 1));
    }
}
