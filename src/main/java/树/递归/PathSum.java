package 树.递归;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        List<Integer> path = new ArrayList<>();
        preOrder(root, sum, path, res);
        return res;
    }

    public void preOrder(TreeNode root, int sum, List<Integer> path, List<List<Integer>> res) {
        path.add(root.val);
        //遇到叶子节点
        if (root.left == null && root.right == null) {
            //叶子节点的值等于sum
            if (root.val == sum) {
                res.add(new ArrayList<>(path));
            }
        }
        if (root.left!= null) {
            preOrder(root.left, sum - root.val, path, res);
            path.remove(path.size() - 1); //回溯
        }
        if (root.right!= null) {
            preOrder(root.right, sum - root.val, path, res);
            path.remove(path.size() - 1); //回溯
        }
    }

}
