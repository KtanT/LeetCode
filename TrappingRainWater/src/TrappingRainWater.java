/**
 * 
 */

/**
 * @author Kyran
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int size = height.length;
        int result = 0;

        int leftMax[] = new int[size];
        int rightMax[] = new int[size];
        leftMax[0] = 0;
        rightMax[size - 1] = 0;

        for (int i = 1; i < size; ++i) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
            rightMax[size - 1 - i] = Math.max(rightMax[size - i], height[size - i]);
        }

        int h;
        for (int i = 0; i < size; ++i) {
            h = Math.min(leftMax[i], rightMax[i]);
            if (h > height[i]) {
                result += h - height[i];
            }
        }

        return result;
    }
}
