package 树.迭代;

import 树.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int result = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                //计数
                result++;
                if (node.left!= null) {
                    deque.offer(node.left);
                }
                if (node.right!= null) {
                    deque.offer(node.right);
                }
            }
        }
        return result;
    }
}
