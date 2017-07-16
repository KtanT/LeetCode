/**
 * 
 */

/**
 * @author Kyran
 */
public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int head = 0, tail = nums.length - 1;
        for (int i = 0; i <= tail; i++) {
            while (nums[i] == 2 && i < tail) {
                swap(i, tail--, nums);
            }
            while (nums[i] == 0 && i > head) {
                swap(i, head++, nums);
            }
        }
    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
