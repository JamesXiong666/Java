package 树.递归;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import 树.TreeNode;
import 树.递归.TrimBST;

class trimBSTTest {
    @Test
    public void testTrimBSR() {
        // Test case 1: root is null
        TreeNode root1 = null;
        TreeNode result1 = new TrimBST().trimBSR(root1, 0, 10);
        Assert.assertNull(result1);

        // Test case 2: root.val < low
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(8);
        TreeNode result2 = new TrimBST().trimBSR(root2, 3, 8);
        Assert.assertEquals(root2, result2);

        // Test case 3: root.val > high
        TreeNode root3 = new TreeNode(5);
        root3.left = new TreeNode(3);
        TreeNode result3 = new TrimBST().trimBSR(root3, 3, 6);
        Assert.assertEquals(root3, result3);
    }
}

