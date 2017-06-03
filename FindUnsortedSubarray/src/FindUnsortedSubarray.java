import java.util.Arrays;

/**
 * 
 */

/**
 * @author Kyran
 */
public class FindUnsortedSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int temp[] = new int[len];
        for (int i = 0; i < len; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        int start = 0;
        int end = len - 1;
        for (; start < len; start++) {
            if (temp[start] != nums[start]) {
                break;
            }
        }
        for (; end >= 0; end--) {
            if (temp[end] != nums[end]) {
                break;
            }
        }
        if (start == len && end < 0) {
            return 0;
        }
        return end - start + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(findUnsortedSubarray(nums));
    }
}
