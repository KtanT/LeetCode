/**
 * 
 */

/**
 * @author Kyran
 */
public class MaximumProduct {
    public int maxProduct(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }

        int temp = nums[0];
        int maxProduct = temp;
        int minProduct = temp;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int t = maxProduct;
                maxProduct = minProduct;
                minProduct = t;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            temp = Math.max(temp, maxProduct);
        }
        return temp;
    }
}
