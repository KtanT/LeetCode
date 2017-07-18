/**
 * 
 */

/**
 * @author Kyran
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int temp = nums[0];
        int index= 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > temp) {
                temp = nums[i];
                index = i;
            }
        }
        return index;
    }
}
