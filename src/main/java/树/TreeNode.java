package 树;

import apple.laf.JRSUIUtils;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) { this.val = value; }
    TreeNode(int value, TreeNode left, TreeNode right) {
        this.val = value;
        this.left = left;
        this.right = right;
    }
}
