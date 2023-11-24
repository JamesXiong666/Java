package 树.迭代;

import 树.TreeNode;

import java.util.Stack;

public class SumLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        int result = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null && node.left.left == null && node.left.right == null)
                result += node.left.val;
            if (node.right!= null) {
                stack.add(node.right);
            }
            if (node.left!= null) {
                stack.add(node.left);
            }
        }return result;
    }
}
