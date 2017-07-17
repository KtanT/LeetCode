import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * @author Kyran
 */
public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        Arrays.sort(nums);
        List<Integer> subset = new ArrayList<>();

        sub(nums, 0, res, subset);
        return res;
    }

    public void sub(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
        res.add(new ArrayList<Integer>(subset));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            subset.add(nums[i]);
            sub(nums, i + 1, res, subset);
            subset.remove(subset.size() - 1);
        }
    }
}
