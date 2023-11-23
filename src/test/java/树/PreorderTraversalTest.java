package 树;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalTest {
    @Test
    public void testPreorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        PreorderTraversal preorderTraversal = new PreorderTraversal();
        List<Integer> result = preorderTraversal.preorderTraversal(root);

        assertEquals(Arrays.asList(1, 2, 4, 5, 3, 6, 7), result);
    }

}