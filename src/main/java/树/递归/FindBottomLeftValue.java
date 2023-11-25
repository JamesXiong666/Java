package 树.递归;

import 树.TreeNode;

public class FindBottomLeftValue {
    public int Deep = -1;
    public int value = 0;
    public int findBottomLeftValue(TreeNode root) {
        value = root.val;
        findLeftValue(root,0);
        return value;
    }

    private void findLeftValue(TreeNode root, int deep) {
        if (root == null) {
            return;
        }
        if(root.left == null && root.right == null){
            if (deep >Deep){
                value = root.val;
                Deep = deep;
            }
        }
        if (root.left!= null) {
            deep++;
            findLeftValue(root.left, deep);
            deep--;//回溯
        }
        if (root.right!= null) {
            deep++;
            findLeftValue(root.right, deep);
            deep--;

        }
    }
}
