/**
 * 
 */

/**
 * @author Kyran
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int islandNum = 0, neighborNum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    islandNum++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        neighborNum++;
                    }
                    if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
                        neighborNum++;
                    }
                }
            }
        }
        return islandNum * 4 - neighborNum * 2;
    }
}
