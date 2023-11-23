package 树.迭代;

import 树.TreeNode;

import java.util.ArrayDeque;

public class InvertTreeBFS {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size-- > 0){
                TreeNode node = deque.poll();

                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;

                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
        }
        return root;
    }
}
