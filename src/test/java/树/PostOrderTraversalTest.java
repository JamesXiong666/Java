package 树;

import org.junit.jupiter.api.Test;
import 树.递归.InOrderTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostOrderTraversalTest {
    @Test
    public void testInorderTraversal() {
        InOrderTraversal itr = new InOrderTraversal();


        // Test case 2: Empty Tree
        TreeNode root2 = null;
        List<Integer> expected2 = new ArrayList<>();
        assertEquals(expected2, itr.inorderTraversal(root2));

        // Test case 3: Single Node Tree
        TreeNode root3 = new TreeNode(5);
        List<Integer> expected3 = Arrays.asList(5);
        assertEquals(expected3, itr.inorderTraversal(root3));

        // Test case 4: Binary Search Tree with negative values
        TreeNode root4 = new TreeNode(-8);
        root4.left = new TreeNode(-3);
        root4.right = new TreeNode(-1);
        root4.left.left = new TreeNode(-5);
        root4.left.right = new TreeNode(-4);
        root4.right.left = new TreeNode(-2);
        List<Integer> expected4 = Arrays.asList(-5, -3, -4, -8, -2, -1);
        assertEquals(expected4, itr.inorderTraversal(root4));
    }


}