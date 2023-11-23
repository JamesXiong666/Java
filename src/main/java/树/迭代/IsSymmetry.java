package 树.迭代;

import 树.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//使用双端队列
public class IsSymmetry {

    public boolean isSymmetric1(TreeNode root) {
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(left);
        que.offer(right);
        while (!que.isEmpty()) {
            TreeNode leftnode = que.poll();
            TreeNode rightnode = que.poll();
            if (leftnode == null && rightnode == null) {
                continue;
            }
            if (leftnode == null && rightnode != null) {
                return false;
            }
            if (leftnode != null && rightnode == null) {
                return false;
            }
            if (leftnode.val!= rightnode.val) {
                return false;
            }
            que.offer(leftnode.left);
            que.offer(rightnode.right);
            que.offer(leftnode.right);
            que.offer(rightnode.left);
        }
        return true;
    }
}
