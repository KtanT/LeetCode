/**
 * 
 */

/**
 * @author Kyran
 */
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return;
        }
        int index = length - 1;
        for (; index >= 1; index--) {
            if (nums[index] > nums[index - 1]) {
                break;
            }
        }
        if (index != 0) {
            swap(nums, index - 1);
        }
        reverse(nums, index);
    }

    private static void swap(int[] nums, int i) {
        for (int index = nums.length - 1; index > i; index--) {
            if (nums[index] > nums[i]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
    }

    private static void reverse(int[] nums, int i) {
        int first = i;
        int last = nums.length - 1;
        while (first < last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 6, 3, 4, 9, 7, 8, 1 };
        nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
