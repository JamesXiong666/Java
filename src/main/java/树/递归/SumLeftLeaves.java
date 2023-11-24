package 树.递归;

import 树.TreeNode;

public class SumLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftValue = sumOfLeftLeaves(root.left);
        int rightValue = sumOfLeftLeaves(root.right);
        // 左叶子节点
        int midValue = 0;
        if  (root.left != null && root.left.left == null && root.left.right == null) {
            midValue = root.left.val;
        }
        int sum = leftValue + rightValue + midValue;
        return sum;
    }
}
