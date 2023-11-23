package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTest {
    @Test
    public void testLevelOrderFun() {
        // Create a binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Call the levelOrderFun method
        LevelOrder levelOrder = new LevelOrder();
        List<List<Integer>> result = levelOrder.levelOrder(root);

        // Check the result
        System.out.println(result);

        assertEquals(3, result.size()); // One level
        assertEquals(1, result.get(0).size()); // Three nodes in the level
        assertEquals(3, result.get(0).get(0).intValue()); // Value of root
        assertEquals(9, result.get(1).get(0).intValue()); // Value of root.left
        assertEquals(15, result.get(2).get(0).intValue()); // Value of root.right.left

    }
}

