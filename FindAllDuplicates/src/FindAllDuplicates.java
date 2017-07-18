import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * @author Kyran
 */
public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 0 || nums == null) {
            return result;
        }
        
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                result.add(nums[i]);
            }
        }
        
        return result;
    }
}
