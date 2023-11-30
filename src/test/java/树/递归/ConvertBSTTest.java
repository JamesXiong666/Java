package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ConvertBSTTest {
    @Test
    public void testConvertBST() {
        ConvertBST convertBST = new ConvertBST();

        // Create a sample binary search tree
        TreeNode root = new TreeNode(0);
        root.left = null;
        root.right = new TreeNode(1);
        // Create expected result
        TreeNode expectedResult = new TreeNode(1);
        expectedResult.left = null;
        expectedResult.right = new TreeNode(1);

        // Call the method to be tested
        TreeNode result = convertBST.convertBST(root);

        // Assert the result is equal to the expected result
        assertEquals(expectedResult.val, result.val);
        assertEquals(expectedResult.right.val, result.right.val);
    }
}
