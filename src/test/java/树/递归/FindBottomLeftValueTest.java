package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class FindBottomLeftValueTest {
    @Test
    public void testFindBottomLeftValue() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node3.left = node5;

        FindBottomLeftValue solution = new FindBottomLeftValue();
        int result = solution.findBottomLeftValue(root);
        assertEquals(4, result);
    }
}