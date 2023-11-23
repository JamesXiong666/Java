package 树.迭代;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTest {

    @Test
    public void testLevelOrder() {
        // Test case 1: Binary tree with three levels
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        LevelOrder levelOrder1 = new LevelOrder();
        List<List<Integer>> expected1 = new ArrayList<>();
        List<Integer> level1 = new ArrayList<>();
        level1.add(3);
        List<Integer> level2 = new ArrayList<>();
        level2.add(9);
        level2.add(20);
        List<Integer> level3 = new ArrayList<>();
        level3.add(15);
        level3.add(7);
        expected1.add(level1);
        expected1.add(level2);
        expected1.add(level3);

        List<List<Integer>> result1 = levelOrder1.levelOrder(root1);
        assertEquals(expected1, result1);

        // Test case 2: Binary tree with only one level
        TreeNode root2 = new TreeNode(1);

        LevelOrder levelOrder2 = new LevelOrder();
        List<List<Integer>> expected2 = new ArrayList<>();
        List<Integer> level4 = new ArrayList<>();
        level4.add(1);
        expected2.add(level4);

        List<List<Integer>> result2 = levelOrder2.levelOrder(root2);
        assertEquals(expected2, result2);

        // Test case 3: Binary tree with only one node
        TreeNode root3 = new TreeNode(10);

        LevelOrder levelOrder3 = new LevelOrder();
        List<List<Integer>> expected3 = new ArrayList<>();
        List<Integer> level5 = new ArrayList<>();
        level5.add(10);
        expected3.add(level5);

        List<List<Integer>> result3 = levelOrder3.levelOrder(root3);
        assertEquals(expected3, result3);

        // Test case 4: Empty tree
        TreeNode root4 = null;

        LevelOrder levelOrder4 = new LevelOrder();
        List<List<Integer>> expected4 = null;

        List<List<Integer>> result4 = levelOrder4.levelOrder(root4);
        assertEquals(expected4, result4);
    }
}

