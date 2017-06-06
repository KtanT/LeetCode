/**
 * 
 */

/**
 * @author Kyran
 */
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private static int findFirst(int[] nums, int target) {
        int res = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                res = mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }
            if (nums[mid] >= target) {
                high = mid - 1;
            }
        }
        return res;
    }

    private static int findLast(int[] nums, int target) {
        int res = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                res = mid;
            }
            if (nums[mid] <= target) {
                low = mid + 1;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int[] res = searchRange(nums, 8);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
