package 树.递归;

import 树.TreeNode;

public class ConvertBST {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        convertBST1(root);
        return root;
    }
    //按右中左顺序遍历,累加即可
    private void convertBST1(TreeNode root) {
        if (root == null) {
            return;
        }
        convertBST1(root.right);//右
        sum += root.val;
        root.val = sum;
        convertBST1(root.left); //左
    }
}
