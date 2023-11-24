package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class IsBalancedTest {
    @Test
    public void testIsBalanced() {
        // Create an instance of the IsBalanced class
        IsBalanced isBalanced = new IsBalanced();

        // Create a balanced binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Test the isBalanced method with a balanced tree
        assertTrue(isBalanced.isBalanced(root));

        // Create an unbalanced binary tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.left.left = new TreeNode(6);

        // Test the isBalanced method with an unbalanced tree
        assertFalse(isBalanced.isBalanced(root2));
    }
}