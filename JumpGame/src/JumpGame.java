/**
 * 
 */

/**
 * @author Kyran
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        
        int far = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= far && nums[i] + i >= far) {
                far = nums[i] + i;
            }
        }
        
        return far >= nums.length - 1;
    }
}
