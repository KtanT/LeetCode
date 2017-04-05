import java.util.ArrayList;
import java.util.List;

/**
 * #448
 */

/**
 * @author Kyran
 */
public class findDisappearedNumbers {
    public static List<Integer> testCase(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]) - 1;
            if (nums[temp] > 0) {
                nums[temp] = -nums[temp];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] test = { 4,3,2,7,8,2,3,1 };
        List<Integer> result = testCase(test);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
