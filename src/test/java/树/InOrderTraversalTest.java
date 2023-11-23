package 树;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import 树.递归.InOrderTraversal;

import java.util.ArrayList;
import java.util.List;

class InOrderTraversalTest {

    @Test
    public void testInorderTraversal() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(6);

        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(3);
        expected.add(7);
        expected.add(5);
        expected.add(1);
        expected.add(2);
        expected.add(6);

        List<Integer> result = inOrderTraversal.inorderTraversal(root);

        Assertions.assertEquals(expected, result);
    }

}