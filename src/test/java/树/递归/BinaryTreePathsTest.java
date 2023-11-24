package 树.递归;

import org.junit.jupiter.api.Test;
import 树.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePathsTest {
    @Test
    public void testBinaryTreePaths() {
        // Test case 1: Binary tree with one root node
        TreeNode root1 = new TreeNode(1);
        BinaryTreePaths solution1 = new BinaryTreePaths();
        List<String> result1 = solution1.binaryTreePaths(root1);
        assertEquals(1, result1.size());
        assertEquals("1", result1.get(0));

        // Test case 2: Binary tree with one root node and one child node
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        BinaryTreePaths solution2 = new BinaryTreePaths();
        List<String> result2 = solution2.binaryTreePaths(root2);
        System.out.println(result2);

        // Test case 3: Binary tree with one root node and two child nodes
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        BinaryTreePaths solution3 = new BinaryTreePaths();
        List<String> result3 = solution3.binaryTreePaths(root3);
        System.out.println(result3);
    }
}