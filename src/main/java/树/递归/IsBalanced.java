package 树.递归;

import 树.TreeNode;

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = getHeight(root.left);
        if (leftHeight == -1){
            return -1;
        }

        int rightHeight = getHeight(root.right);
        if (rightHeight == -1){
            return -1;
        }
        // 左右子树高度差大于1，则不平衡
        return Math.abs(leftHeight - rightHeight) > 1 ? -1 : Math.max(leftHeight, rightHeight) + 1;
    }
}
