/**
 * 
 */

/**
 * @author Kyran
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0;
        int j;
        for (int i = 0; i < nums.length;) {
            int current = nums[i];
            for (j = i; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    break;
                } else if (j - i < 2) {
                    nums[index++] = current;
                } else {
                    continue;
                }
            }
            i = j;
        }
        return index;
    }
}
