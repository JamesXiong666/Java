package 树.递归;

import 树.TreeNode;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) { //如果当前节点为空,也就意味着 val 找打了合适的位置,此时创建节点
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val); //递归创建左子树
        } else if (val > root.val){
            root.right = insertIntoBST(root.right, val); //递归创建右子树
        }
        return root;
    }
}
