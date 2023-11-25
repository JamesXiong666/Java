package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class BuildTreeBackTest {
    @Test
    public void testBuildTree() {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        BuildTreeBack treeBuilder = new BuildTreeBack();
        TreeNode root = treeBuilder.buildTree(inorder, postorder);

        // Add assertions to verify the tree structure
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);
        assertEquals(15, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }
}