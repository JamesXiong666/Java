package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {
    @Test
    public void testPathSum() {
        // Create a test tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);

        // Call the function to find paths with sum 22
        PathSum pathSum = new PathSum();
        List<List<Integer>> result = pathSum.pathSum(root, 12);

        // Check the result
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 4, 7));
        assertEquals(expected, result);
    }

}