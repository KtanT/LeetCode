/**
 * 
 */

/**
 * @author Kyran
 */
public class MinDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return getMinDepth(root);
    }

    private static int getMinDepth(TreeNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return Math.min(getMinDepth(node.left), getMinDepth(node.right)) + 1;
    }
}
