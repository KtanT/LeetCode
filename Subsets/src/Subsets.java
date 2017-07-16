import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * @author Kyran
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i = 0; i < (1<< n); i++) {
            ArrayList<Integer> sub = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                if ((i & (1<<j)) != 0) {
                    sub.add(nums[j]);
                }
            }
            res.add(sub);
        }
        return res;
    }
}
