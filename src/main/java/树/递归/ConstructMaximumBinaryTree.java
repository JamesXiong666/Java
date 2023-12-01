package 树.递归;

import 树.TreeNode;

public class ConstructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree1(nums, 0, nums.length - 1);
    }

    private TreeNode constructMaximumBinaryTree1(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int maxIndex = left; //最大值所在位置
        int maxVal = nums[maxIndex];//最大值
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(maxVal);
        //根据 maxIndex 划分左右子树
        root.left = constructMaximumBinaryTree1(nums, left, maxIndex - 1);
        root.right = constructMaximumBinaryTree1(nums, maxIndex + 1, right);
        return root;
    }

}
