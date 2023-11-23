package 树.迭代;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return null;
        LinkedList<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);

        while (!que.isEmpty()) {
            int len = que.size();
            List<Integer> list = new LinkedList<Integer>();

            while(len > 0){
                TreeNode tmpNode = que.poll();
                list.add(tmpNode.val);

                if(tmpNode.left!= null) que.offer(tmpNode.left);
                if(tmpNode.right!= null) que.offer(tmpNode.right);
                len--;
            }
            res.add(list);
        }
        return res;
    }
}
