package 树.迭代;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class IsSymmetryTest {
    @Test
    public void testIsSymmetric() {
        IsSymmetry isSymmetry = new IsSymmetry();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean result = isSymmetry.isSymmetric(root);

        assertTrue(result);
    }

    @Test
    public void testIsSymmetric2() {
        IsSymmetry isSymmetry = new IsSymmetry();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        boolean result = isSymmetry.isSymmetric(root);

        assertFalse(result);
    }

    @Test
    public void testIsSymmetric3() {
        IsSymmetry isSymmetry = new IsSymmetry();
        TreeNode root = new TreeNode(1);

        boolean result = isSymmetry.isSymmetric(root);

        assertTrue(result);
    }

}

