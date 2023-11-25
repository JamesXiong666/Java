package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class HasPathSumTest {
    @Test
    public void testHasPathSum() {
        // Test case 1: root = null, sum = 0, expected false
        TreeNode root1 = null;
        int sum1 = 0;
        assertFalse(new HasPathSum().hasPathSum(root1, sum1));

        // Test case 2: root = null, sum = 5, expected false
        TreeNode root2 = null;
        int sum2 = 5;
        assertFalse(new HasPathSum().hasPathSum(root2, sum2));

        // Test case 3: root = null, sum = 10, expected false
        TreeNode root3 = null;
        int sum3 = 10;
        assertFalse(new HasPathSum().hasPathSum(root3, sum3));

        // Test case 4: root = Empty, sum = -1, expected false
        TreeNode root4 = new TreeNode(0);
        int sum4 = -1;
        assertFalse(new HasPathSum().hasPathSum(root4, sum4));




        // Test case 7: root = 5/2/3/9, sum = 20, expected true
        TreeNode root7 = new TreeNode(5);
        root7.left = new TreeNode(2);
        root7.left.left = null;
        root7.left.right = new TreeNode(3);
        root7.left.right.left = null;
        root7.left.right.right = new TreeNode(9);
        int sum7 = 19;
        assertTrue(new HasPathSum().hasPathSum(root7, sum7));

        // Test case 8: root = 5/2/3/9, sum = 21, expected false
        TreeNode root8 = new TreeNode(5);
        root8.left = new TreeNode(2);
        root8.left.left = null;
        root8.left.right = new TreeNode(3);
        root8.left.right.left = null;
        root8.left.right.right = new TreeNode(9);
        int sum8 = 21;
        assertFalse(new HasPathSum().hasPathSum(root8, sum8));
    }

}