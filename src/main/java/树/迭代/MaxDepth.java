package 树.迭代;

import 树.TreeNode;
//广度遍历
import java.util.Deque;
import java.util.LinkedList;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int depth = 0;
        while(!deque.isEmpty()){
            int size = deque.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                if (node.left!= null){
                    deque.offer(node.left);
                }
                if (node.right!= null){
                    deque.offer(node.right);
                }
            }
        }
        return depth;
    }
}
