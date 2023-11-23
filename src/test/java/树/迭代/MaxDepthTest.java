package 树.迭代;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {
    @Test
    public void testMaxDepth() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        MaxDepth maxDepth = new MaxDepth();
        int result = maxDepth.maxDepth(root);

        assertEquals(3, result);
    }
}