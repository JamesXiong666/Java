package 树.递归;

import 树.TreeNode;

public class HasPathSum {
    boolean hasPathSum(TreeNode cur, int sum){
        if (cur == null) return false;
        return tranversal(cur, sum);
    }
    boolean tranversal(TreeNode cur, int sum) {
        sum -= cur.val;  //一旦进入递归就减去当前节点的值
        //对叶子结点的判断
        if (cur.left == null && cur.right == null&& sum == 0) {
           return true;
        }
        if (cur.left!=null){
            if (tranversal(cur.left, sum)) return true;
        }
        if (cur.right!=null){
            if (tranversal(cur.right, sum)) return true;
        }
        return false;
    }
}
