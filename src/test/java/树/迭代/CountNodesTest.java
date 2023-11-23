package 树.迭代;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class CountNodesTest {
    @Test
    public void testCountNodes() {
        // Test case 1: Empty tree
        TreeNode root1 = null;
        assertEquals(0, new CountNodes().countNodes(root1));

        // Test case 2: Tree with only one node
        TreeNode root2 = new TreeNode(1);
        assertEquals(1, new CountNodes().countNodes(root2));

        // Test case 3: Tree with 3 levels and 5 nodes
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.left = new TreeNode(4);
        root3.left.right = new TreeNode(5);
        assertEquals(5, new CountNodes().countNodes(root3));

        // Test case 4: Tree with 3 levels and 7 nodes
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.left.right = new TreeNode(5);
        root4.right.left = new TreeNode(6);
        root4.right.right = new TreeNode(7);
        assertEquals(7, new CountNodes().countNodes(root4));

        // Test case 5: Tree with 4 levels and 15 nodes
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.left.left = new TreeNode(4);
        root5.left.right = new TreeNode(5);
        root5.right.left = new TreeNode(6);
        root5.right.right = new TreeNode(7);
        root5.left.left.left = new TreeNode(8);
        root5.left.left.right = new TreeNode(9);
        root5.left.right.left = new TreeNode(10);
        root5.left.right.right = new TreeNode(11);
        root5.right.left.left = new TreeNode(12);
        root5.right.left.right = new TreeNode(13);
        root5.right.right.left = new TreeNode(14);
        root5.right.right.right = new TreeNode(15);
        assertEquals(15, new CountNodes().countNodes(root5));
    }
}