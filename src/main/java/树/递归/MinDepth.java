package 树.递归;

import 树.TreeNode;

public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if (root.left == null && root.right != null){
            return rightDepth + 1;
        }
        if (root.right == null && root.left!= null){
            return leftDepth + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
