import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Kyran
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while ((i + 1 < nums.length) && (nums[i + 1] == nums[i] + 1)) {
                i++;
            }

            if (temp == nums[i]) {
                result.add(Integer.toString(temp));
            } else {
                result.add(temp + "->" + nums[i]);
            }
        }

        return result;
    }
}
