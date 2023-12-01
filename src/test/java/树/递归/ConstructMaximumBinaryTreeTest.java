package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ConstructMaximumBinaryTreeTest  {

    //TODO
    @Test
    public void testConstructMaximumBinaryTree() {
        ConstructMaximumBinaryTree solution = new ConstructMaximumBinaryTree();

        // Test case 1
        int[] nums1 = {3, 2, 1, 6, 0, 5};
        TreeNode result1 = solution.constructMaximumBinaryTree(nums1);
        // Assertion
        assertNotNull(result1);
        // Check the values of the nodes
        assertEquals(6, result1.val);
        assertEquals(3, result1.left.val);
        assertEquals(5, result1.right.val);

    }
}