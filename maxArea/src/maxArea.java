/**
 * #11
 */

/**
 * @author Kyran
 */
public class maxArea {
    public static int testCase(int[] height) {
        int length = height.length;
        int i = 0;
        int j = length - 1;
        int sMax = 0;
        while(i < j) {
            if (height[i] < height[j]) {
                sMax = Math.max(sMax, height[i] * (j - i));
                i++;
            } else {
                sMax = Math.max(sMax, height[j] * (j - i));
                j--;
            }
        }
        return sMax;
    }

    public static void main(String[] args) {
        int[] test = { 1, 1 };
        System.out.println(testCase(test));
    }
}
