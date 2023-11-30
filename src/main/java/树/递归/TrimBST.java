package 树.递归;

import 树.TreeNode;

public class TrimBST {
    public TreeNode trimBSR(TreeNode root, int low, int high){
        if(root == null) return null;
        if (root.val < low){
            return trimBSR(root.right, low, high);
        }
        if (root.val > high){
            return trimBSR(root.left, low, high);
        }
        // root 在[low,high]范围内
        root.left = trimBSR(root.left, low, high);
        root.right = trimBSR(root.right, low, high);
        return root;
    }
}
