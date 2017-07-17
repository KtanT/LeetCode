
/**
 * 
 */

/**
 * @author Kyran
 */
public class BinaryTreeInPostOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private TreeNode build(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend) {
        if (instart > inend || poststart > postend) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postend]);
        int inCurrent = 0;

        for (int i = instart; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
                inCurrent = i;
            }
        }

        root.left = build(inorder, instart, inCurrent - 1, postorder, poststart, poststart + inCurrent - instart - 1);
        root.right = build(inorder, inCurrent + 1, inend, postorder, poststart + inCurrent - instart, postend - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length) {
            return null;
        }
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
}
