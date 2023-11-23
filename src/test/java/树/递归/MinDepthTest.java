package 树.递归;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MinDepthTest {
    @Test
    public void testMinDepth() {
        MinDepth minDepth = new MinDepth();

        // Test case 1: Empty tree
        TreeNode root1 = null;
        int expected1 = 0;
        int result1 = minDepth.minDepth(root1);
        Assertions.assertEquals(expected1, result1);

        // Test case 2: Tree with only left child
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(4);
        int expected2 = 3;
        int result2 = minDepth.minDepth(root2);
        Assertions.assertEquals(expected2, result2);

        // Test case 3: Tree with only right child
        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(2);
        root3.right.left = new TreeNode(3);
        int expected3 = 3;
        int result3 = minDepth.minDepth(root3);
        Assertions.assertEquals(expected3, result3);

        // Test case 4: Tree with same depth left and right children
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(2);
        root4.left.left = new TreeNode(4);
        root4.right.left = new TreeNode(4);
        int expected4 = 3;
        int result4 = minDepth.minDepth(root4);
        Assertions.assertEquals(expected4, result4);

        // Test case 5: Tree with different depth left and right children
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.left.left = new TreeNode(4);
        root5.left.right = new TreeNode(5);
        root5.right.left = new TreeNode(4);
        int expected5 = 3;
        int result5 = minDepth.minDepth(root5);
        Assertions.assertEquals(expected5, result5);
    }
}