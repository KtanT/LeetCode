/**
 * #283
 */

/**
 * @author Kyran
 */
public class moveZeroes {
    public static void testCase(int[] nums) {
        int nItem = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            } else {
                nItem++;
            }
        }
        for (int i = 0; i < nItem; i++) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] test = { 0, 1, 0, 3, 12 };
        testCase(test);
        for (int i : test) {
            System.out.print(i + " ");
        }
    }
}
