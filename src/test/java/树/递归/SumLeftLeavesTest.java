package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SumLeftLeavesTest {
    @Test
    public void testSumOfLeftLeaves() {
        // Test case 1: Empty tree
        TreeNode root1 = null;
        SumLeftLeaves sl = new SumLeftLeaves();
        assertEquals(0, sl.sumOfLeftLeaves(root1));

        // Test case 2: Tree with left leaf
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        SumLeftLeaves sl2 = new SumLeftLeaves();
        assertEquals(4, sl2.sumOfLeftLeaves(root2));

        // Test case 3: Tree with right leaf
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.right.left = new TreeNode(4);
        SumLeftLeaves sl3 = new SumLeftLeaves();
        assertEquals(6, sl3.sumOfLeftLeaves(root3));

        // Test case 4: Tree with both left and right leaf
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.right.left = new TreeNode(5);
        SumLeftLeaves sl4 = new SumLeftLeaves();
        assertEquals(9, sl4.sumOfLeftLeaves(root4));

        // Test case 5: Tree with no leaf
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.left.left = new TreeNode(4);
        root5.left.left.left = new TreeNode(5);
        SumLeftLeaves sl5 = new SumLeftLeaves();
        assertEquals(5, sl5.sumOfLeftLeaves(root5));
    }
}