package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeTest {
    @Test
    public void testDeleteNode() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);


        DeleteNode deleteNode = new DeleteNode();

        TreeNode result = deleteNode.deleteNode(root, 3);

        assertEquals(5, result.val);
        assertEquals(4, result.left.val);
        assertEquals(2, result.left.left.val);
        assertNull(result.left.right);
        assertEquals(7, result.right.right.val);
    }
}

