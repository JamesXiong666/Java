package 树.迭代;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalTest {
    @Test
    public void testPreorderTraversal() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        node4.left = node5;

        PreorderTraversal traversal = new PreorderTraversal();
        List<Integer> result = traversal.preorderTraversal(root);

        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(9);
        expected.add(20);
        expected.add(15);
        expected.add(7);
        expected.add(5);

        assertEquals(expected, result);

    }
}