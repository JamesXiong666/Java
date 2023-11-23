package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;
import 树.迭代.InvertTreeBFS;

import static org.junit.jupiter.api.Assertions.*;

class InvertTreeBFSTest {
    @Test
    public void testInvertTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode expectedResult = new TreeNode(1);
        expectedResult.left = new TreeNode(3);
        expectedResult.right = new TreeNode(2);
        expectedResult.right.left = new TreeNode(5);
        expectedResult.right.right = new TreeNode(4);

        InvertTreeBFS invertTreeBFS = new InvertTreeBFS();
        TreeNode result = invertTreeBFS.invertTree(root);

        assertTrue(isTreeEqual(result, expectedResult));

    }

    // 判断两棵树是否相等
    public boolean isTreeEqual(TreeNode t1, TreeNode t2) {
        // 如果两棵树都为空，则认为它们的值相等
        if (t1 == null && t2 == null) {
            return true;
        }
        // 如果只有其中一棵树为空，则认为它们的值不相等
        if (t1 == null || t2 == null) {
            return false;
        }
        // 如果两棵树的值不相等，则它们的值不相等
        if (t1.val != t2.val) {
            return false;
        }
        // 递归比较两棵树的左子树和右子树
        return isTreeEqual(t1.left, t2.left) && isTreeEqual(t1.right, t2.right);
    }
}


