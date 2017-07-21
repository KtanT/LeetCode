/**
 * 
 */

/**
 * @author Kyran
 */
public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode tNode1, TreeNode tNode2) {
        if (tNode1 == null && tNode2 == null) {
            return true;
        }
        if (tNode1 == null || tNode2 == null) {
            return false;
        }
        return (tNode1.val == tNode2.val) && isMirror(tNode1.left, tNode2.right) && isMirror(tNode1.right, tNode2.left);
    }
}
