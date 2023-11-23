package 树.递归;

import 树.TreeNode;

public class IsSymmetry {
    public boolean isSymmetry(TreeNode root) {
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null && right != null){
            return false;
        }
        if (left!= null && right == null){
            return false;
        }
        if (left.val!= right.val) {
            return false;
        }
        //比较外侧
        boolean compareOut = compare(left.left, right.right);
        //比较内测
        boolean compareIn = compare(left.right, right.left);
        return compareOut && compareIn;
    }
}
