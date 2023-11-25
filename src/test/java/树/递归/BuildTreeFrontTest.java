package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class BuildTreeFrontTest {
    @Test
    public void testBuildTreeFront() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        BuildTreeFront treeBuilder = new BuildTreeFront();
        TreeNode root = treeBuilder.buildTree(preorder, inorder);

        // Add assertions to verify the tree structure
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);
        assertEquals(15, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }

}