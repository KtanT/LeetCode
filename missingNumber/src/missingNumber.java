import java.util.Arrays;

/**
 * #268
 */

/**
 * @author Kyran
 */
public class missingNumber {
    public static int testCase(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] - nums[i - 1]) != 1) {
                return (nums[i] - 1);
            }
        }

        if (nums.length == 1) {
            if (nums[0] == 1) {
                return 0;
            } else {
                return 1;
            }
        }
        if (nums[0] == 0) {
            return nums[nums.length - 1] + 1;
        } else {
            return 0;
        }
    }
//    int sum = 0;
//    for(int num: nums)
//        sum += num;
//        
//    return (nums.length * (nums.length + 1) )/ 2 - sum;

    public static void main(String[] args) {
        int[] test = { 1, 2 };
        System.out.println(testCase(test));
    }
}
