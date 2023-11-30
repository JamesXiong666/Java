package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayToBSTTest {
    @Test
    public void testSortArrayToBST() {
        SortedArrayToBST solution = new SortedArrayToBST();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5};
        TreeNode root1 = solution.sortArrayToBST(nums1);
        // Assert expected tree structure
        printTree(root1);
    }

    private void printTree(TreeNode root1) {
        if (root1 == null) {
            return;
        }
        System.out.print(root1.val + " ");
        printTree(root1.left);
        printTree(root1.right);
    }


}