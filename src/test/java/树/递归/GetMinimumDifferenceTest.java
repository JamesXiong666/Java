package 树.递归;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class GetMinimumDifferenceTest {

    @Test
    public void testGetMinimumDifference() {
        // Test case 1: Tree is null
        TreeNode root1 = null;
        int expected1 = 0;
        int actual1 = new GetMinimumDifference().getMinimumDifference(root1);
        Assertions.assertEquals(expected1, actual1);


        // Test case 3: Tree has two nodes with same value
        TreeNode root3 = new TreeNode(5);
        root3.left = new TreeNode(5);
        int expected3 = 0;
        int actual3 = new GetMinimumDifference().getMinimumDifference(root3);
        Assertions.assertEquals(expected3, actual3);

        // Test case 4: Tree has two nodes with different values
        TreeNode root4 = new TreeNode(5);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(7);
        int expected4 = 2;
        int actual4 = new GetMinimumDifference().getMinimumDifference(root4);
        Assertions.assertEquals(expected4, actual4);



        // Additional test case
        // Test case 6: Tree has a larger structure with different values
        TreeNode root6 = new TreeNode(8);
        root6.left = new TreeNode(3);
        root6.right = new TreeNode(10);
        root6.left.left = new TreeNode(1);
        root6.left.right = new TreeNode(6);

        int expected6 = 2;
        int actual6 = new GetMinimumDifference().getMinimumDifference(root6);
        Assertions.assertEquals(expected6, actual6);
    }
}