package 树.迭代;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SumLeftLeavesTest {
    @Test
    public void testSumOfLeftLeaves() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        SumLeftLeaves sumLeftLeaves = new SumLeftLeaves();
        int result = sumLeftLeaves.sumOfLeftLeaves(root);
        assertEquals(24, result);
    }
}