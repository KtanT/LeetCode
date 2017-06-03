/**
 * 
 */

/**
 * @author Kyran
 */
public class MatrixReshape {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int a = nums.length;
        int b = nums[0].length;
        if (r * c != a * b) {
            return nums;
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            result[i / c][i % c] = nums[i / b][i % b];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 2 }, { 3, 4 } };
        System.out.println(matrixReshape(nums, 1, 4));
    }
}
