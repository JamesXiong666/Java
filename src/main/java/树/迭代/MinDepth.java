package 树.迭代;

import 树.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class MinDepth {
    //层序遍历
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int depth = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                //左右都是空,说明是叶子节点,返回当前层数
                if (node.left == null && node.right == null) return depth;
                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
        }
        return depth;
    }
}