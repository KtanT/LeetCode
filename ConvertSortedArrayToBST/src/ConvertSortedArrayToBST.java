/**
 * 
 */

/**
 * @author Kyran
 */
public class ConvertSortedArrayToBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        return transform(nums, 0, nums.length - 1);
    }

    private TreeNode transform(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode node = new TreeNode(nums[start + (end - start) / 2]);
        node.left = transform(nums, start, start + (end - start) / 2 - 1);
        node.right = transform(nums, start + (end - start) / 2 + 1, end);
        return node;
    }
}
