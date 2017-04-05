import java.util.Arrays;

/**
 * #532
 */

/**
 * @author Kyran
 */
public class findPairs {
    public static int testCase(int[] nums, int k) {
        if (k < 0 || nums.length <= 1 || nums == null) {
            return 0;
        }

        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = 1;

        while (right < nums.length) {
            int firNum = nums[left];
            int secNum = nums[right];
            if (secNum - firNum < k) {
                right++;
            } else if (secNum - firNum > k) {
                left++;
            } else {
                count++;
                while (left < nums.length && nums[left] == firNum) {
                    left++;
                }
                while (right < nums.length && nums[right] == secNum) {
                    right++;
                }

            }
            if (right == left) {
                right++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test = { 3, 1, 4, 1, 5 };
        System.out.println(testCase(test, 2));
    }
}
