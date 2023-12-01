package 树.递归;

import 树.TreeNode;

public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return validBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean validBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (min!= null && root.val <= min) {
            return false;
        }
        if (max!= null && root.val >= max) {
            return false;
        }
        return validBST(root.left, min, root.val) && validBST(root.right, root.val, max);
    }
}
