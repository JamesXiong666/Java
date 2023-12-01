package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SearchBSTTest {
    @Test
    public void testSearchBST() {
        // Create a binary search tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(10);

        // Test case 1: searching for existing value
        TreeNode result1 = new SearchBST().searchBST(root, 4);
        assertTrue(result1 != null);

        // Test case 2: searching for non-existing value
        TreeNode result2 = new SearchBST().searchBST(root, 7);
        assertTrue(result2 == null);

        // Test case 3: searching for maximum value
        TreeNode result3 = new SearchBST().searchBST(root, 10);
        assertTrue(result3 != null);

        // Test case 4: searching for minimum value
        TreeNode result4 = new SearchBST().searchBST(root, 2);
        assertTrue(result4 != null);
    }

}