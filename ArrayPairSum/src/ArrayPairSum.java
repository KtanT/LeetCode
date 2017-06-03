import java.util.Arrays;

/**
 * 
 */

/**
 * @author Kyran
 */
public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        System.out.println(arrayPairSum(a));
    }
}
