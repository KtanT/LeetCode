import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author Kyran
 */
public class containsNearbyDuplicate {
    public static boolean testCase(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int diff = i - map.get(nums[i]);
                if (diff <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5, 6, 3, 7 };
        System.out.println(testCase(test, 3));
    }
}
