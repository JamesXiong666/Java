package 树.递归;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class FindModeTest {
    @Test
    public void testFindMode() {
        FindMode findMode = new FindMode();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] expected = {2};
        int[] result = findMode.findMode(root);
        System.out.println(result);
    }
}