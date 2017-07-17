/**
 * 
 */

/**
 * @author Kyran
 */
public class BinaryTreePreInOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }

        int inEnd = inorder.length - 1;
        return build(0, 0, inEnd, preorder, inorder);
    }

    public TreeNode build(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int inCurrent = 0;

        for (int i = inStart; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
                inCurrent = i;
            }
        }

        root.left = build(preStart + 1, inStart, inCurrent - 1, preorder, inorder);
        root.right = build(preStart + inCurrent - inStart + 1, inCurrent + 1, inEnd, preorder, inorder);

        return root;
    }
}
