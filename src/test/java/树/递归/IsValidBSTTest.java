package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class IsValidBSTTest {
    @Test
    public void testValidBinarySearchTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);

        IsValidBST solution = new IsValidBST();
        assertTrue(solution.isValidBST(root));
    }

    @Test
    public void testInvalidBinarySearchTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        IsValidBST solution = new IsValidBST();
        assertFalse(solution.isValidBST(root));
    }
}