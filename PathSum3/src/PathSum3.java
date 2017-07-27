/**
 * 
 */

/**
 * @author Kyran
 */
public class PathSum3 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return sumHelper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int sumHelper(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        return (node.val == sum ? 1 : 0) + sumHelper(node.left, sum - node.val) + sumHelper(node.right, sum - node.val);
    }
}
