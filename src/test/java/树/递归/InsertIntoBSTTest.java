package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntoBSTTest {
    @Test
    public void testInsertIntoBST() {
        // Create a binary search tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);


        // Create an instance of the class
        InsertIntoBST solution = new InsertIntoBST();

        // Test inserting a value into the binary search tree
        TreeNode result = solution.insertIntoBST(root, 5);
        assertEquals(4, result.val); // The root should remain unchanged
        assertEquals(2, result.left.val); // The left child should remain unchanged
        assertEquals(7, result.right.val); // The right child should remain unchanged
        assertEquals(1, result.left.left.val); // The inserted value should become a left child of the existing node with value 3
        assertEquals(3, result.left.right.val); // The right child of the existing node with value 3 should remain unchanged
        assertEquals(5, result.right.left.val); // The left child should remain unchanged
    }
}