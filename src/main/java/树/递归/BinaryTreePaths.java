package 树.递归;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>(); //存储最终结果
        if (root == null) {
            return res;
        }
        List<Integer> path = new ArrayList<>();//作为结果中的路径
        traversal(root, path, res);
        return res;
    }

    private void traversal(TreeNode root, List<Integer> path, List<String> res) {
        path.add(root.val); //前序遍历,中
        //遇到叶子节点
        if (root.left == null && root.right == null){
            //输出
            StringBuilder sb = new StringBuilder(); //Stringbuilder用来拼接字符串路径,速度更快
            for (int i = 0; i < path.size() - 1; i++){
                sb.append(path.get(i)).append("->");
            }
            sb.append(path.get(path.size() - 1));//记录最后一个节点
            res.add(sb.toString()); //收集一个路径
            return;
        }
        //递归和回溯是同时进行,所以要放在同一个花括号里
        if (root.left!= null){  //左
            traversal(root.left, path, res);
            path.remove(path.size() - 1); //回溯
        }
        if (root.right != null){ //右
            traversal(root.right, path, res);
            path.remove(path.size() - 1); //回溯
        }
    }
}
