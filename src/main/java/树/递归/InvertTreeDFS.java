package 树.递归;

import 树.TreeNode;
//前序和后序遍历都可以
//中序遍历不可以,因为先左孩子交换,再根交换孩子,做完后,右孩子已经变成原来的左孩子,再右孩子交换孩子（此时其实是对原来的左孩子做交换）
public class InvertTreeDFS {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        swapChildren(root);
        return  root;
    }

    private void swapChildren(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
