package 树.迭代;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MinDepthTest {
    @Test
    public void testMinDepth() {
        // Test case 1: Empty tree
        TreeNode root1 = null;
        MinDepth solution1 = new MinDepth();
        int result1 = solution1.minDepth(root1);
        assertEquals(0, result1);

        // Test case 2: Tree with one node (leaf node)
        TreeNode root2 = new TreeNode(1);
        MinDepth solution2 = new MinDepth();
        int result2 = solution2.minDepth(root2);
        assertEquals(1, result2);

        // Test case 3: Tree with two nodes (leaf node)
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        MinDepth solution3 = new MinDepth();
        int result3 = solution3.minDepth(root3);
        assertEquals(2, result3);

        // Test case 4: Tree with multiple nodes
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        MinDepth solution4 = new MinDepth();
        int result4 = solution4.minDepth(root4);
        assertEquals(2, result4);

        // Test case 5: Tree with multiple branches
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.left.left = new TreeNode(4);
        root5.left.right = new TreeNode(5);
        root5.right.left = new TreeNode(6);
        root5.right.right = new TreeNode(7);
        MinDepth solution5 = new MinDepth();
        int result5 = solution5.minDepth(root5);
        assertEquals(3, result5);
    }
}