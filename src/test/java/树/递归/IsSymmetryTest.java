package 树.递归;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class IsSymmetryTest {
    
    @Test
    public void testIsSymmetry() {
        IsSymmetry isSymmetry = new IsSymmetry();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        assertTrue(isSymmetry.isSymmetry(root));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        assertFalse(isSymmetry.isSymmetry(root2));
    }
}
