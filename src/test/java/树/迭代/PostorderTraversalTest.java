package 树.迭代;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostorderTraversalTest  {

    @Test
    void testPostorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        PostorderTraversal postorderTraversal = new PostorderTraversal();
        List<Integer> result = postorderTraversal.postorderTraversal(root);

        List<Integer> expected = Arrays.asList(4, 5, 2, 6, 7, 3, 1);
        assertEquals(expected, result);
    }

}