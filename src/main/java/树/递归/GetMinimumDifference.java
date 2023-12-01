package 树.递归;

import 树.TreeNode;

public class GetMinimumDifference {
    TreeNode pre; //记录上一个遍历的节点
    int result =  Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if (root == null)return 0;
        traverse(root);
        return result;
    }

    private void traverse(TreeNode root) {
        if (root == null) return;
        //左
        traverse(root.left);
        if (pre!=null){
            result = Math.min(result,root.val-pre.val);
        }
        pre = root;
        //右
        traverse(root.right);
    }
}
