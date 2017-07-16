/**
 * 
 */

/**
 * @author Kyran
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }

        int[][] temp = new int[m][n];
        for (int i = 0; i < m; i++) {
            temp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            temp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                temp[i][j] = temp[i - 1][j] + temp[i][j - 1];
            }
        }

        return temp[m - 1][n - 1];
    }
}