import java.util.List;

/**
 * 
 */

/**
 * @author Kyran
 * minNums[col]=min(minNums[col], minNums[col+1]) + triangle[row][col];
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) {
            return -1;
        }
        
        int size = triangle.size();
        int[] res = new int[size + 1];
        
        for (int i = size - 1; i >= 0; i--) {
            List<Integer> temp = triangle.get(i);
            
            for (int j = 0; j < temp.size(); j++) {
                res[j] = Math.min(res[j], res[j+1]) + temp.get(j);
            }
        }
        return res[0];
    }
}
