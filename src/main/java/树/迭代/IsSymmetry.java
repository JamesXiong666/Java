package 树.迭代;

import 树.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//使用双端队列
public class IsSymmetry {

    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerFirst(left);
        deque.offerLast(right);
        while (!deque.isEmpty()) {
            TreeNode leftNode = deque.pollFirst();
            TreeNode rightNode = deque.pollLast();
            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null && rightNode != null) {
                return false;
            }
            if (leftNode != null && rightNode == null) {
                return false;
            }
            if (leftNode.val!= rightNode.val) {
                return false;
            }
            deque.offerFirst(leftNode.left);
            deque.offerFirst(rightNode.right);
            deque.offerLast(rightNode.right);
            deque.offerLast(leftNode.left);
        }
        return true;
    }
}
