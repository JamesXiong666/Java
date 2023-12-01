package 树.递归;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorTest {

    @Test
    public void testLowestCommonAncestor() {
            // Create the binary tree
            TreeNode root = new TreeNode(6);
            root.left = new TreeNode(2);
            root.right = new TreeNode(8);
            root.left.left = new TreeNode(0);
            root.left.right = new TreeNode(4);
            root.left.right.left = new TreeNode(3);
            root.left.right.right = new TreeNode(5);
            root.right.left = new TreeNode(7);
            root.right.right = new TreeNode(9);

            TreeNode p = new TreeNode(2);
            TreeNode q = new TreeNode(8);
            TreeNode result = new LowestCommonAncestor().lowestCommonAncestor(root, p, q);
            assertNotNull(result);
            assertEquals(6, result.val);
    }
}