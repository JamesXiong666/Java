package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

public class InvertTreeDFSTest {

    @Test
    public void testInvertTree() {
        // Create a test tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Invert the tree
        InvertTreeDFS invertTreeDFS = new InvertTreeDFS();
        TreeNode invertedRoot = invertTreeDFS.invertTree(root);

        // Assert the inverted tree structure
        assertEquals(4, invertedRoot.val);
        assertEquals(7, invertedRoot.left.val);
        assertEquals(2, invertedRoot.right.val);
        assertEquals(9, invertedRoot.left.left.val);
        assertEquals(6, invertedRoot.left.right.val);
        assertEquals(3, invertedRoot.right.left.val);
        assertEquals(1, invertedRoot.right.right.val);

        // Assert the null case
        assertNull(invertTreeDFS.invertTree(null));
    }
}