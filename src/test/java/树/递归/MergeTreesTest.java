package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MergeTreesTest {
    @Test
    public void testMergeTrees() {
        // Create test input trees
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        TreeNode t2 = new TreeNode(4);
        t2.left = new TreeNode(5);
        t2.right = new TreeNode(6);

        // Create expected output tree
        TreeNode expected = new TreeNode(5);
        expected.left = new TreeNode(7);
        expected.right = new TreeNode(9);

        // Create instance of MergeTrees class
        MergeTrees mergeTrees = new MergeTrees();

        // Call the mergeTrees function
        TreeNode result = mergeTrees.mergeTrees(t1, t2);

        // Assert the result is equal to the expected output tree
        assertTrue(isSameTree(expected, result));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 如果两棵树都为空，则认为它们的值相同
        if (p == null && q == null) {
            return true;
        }
        // 如果只有一棵树为空，则认为它们的值不同
        if (p == null || q == null) {
            return false;
        }
        // 如果两棵树的根节点的值不相同，则认为它们的值不同
        if (p.val != q.val) {
            return false;
        }
        // 递归比较两棵树的左子树和右子树
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}