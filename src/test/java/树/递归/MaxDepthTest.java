package 树.递归;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import 树.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class MaxDepthTest {
    @Test
    public void testMaxDepth() {
        // Test case 1: Empty tree
        TreeNode emptyTree = null;
        MaxDepth maxDepth = new MaxDepth();
        Assertions.assertEquals(0, maxDepth.maxDepth(emptyTree));

        // Test case 2: Tree with one node
        TreeNode singleNode = new TreeNode(1);
        maxDepth = new MaxDepth();
        Assertions.assertEquals(1, maxDepth.maxDepth(singleNode));

        // Test case 3: Tree with two nodes
        TreeNode twoNodes = new TreeNode(1);
        twoNodes.left = new TreeNode(2);
        maxDepth = new MaxDepth();
        Assertions.assertEquals(2, maxDepth.maxDepth(twoNodes));

        // Test case 4: Tree with more nodes
        TreeNode moreNodes = new TreeNode(1);
        moreNodes.left = new TreeNode(2);
        moreNodes.right = new TreeNode(3);
        moreNodes.left.left = new TreeNode(4);
        moreNodes.left.right = new TreeNode(5);
        maxDepth = new MaxDepth();
        Assertions.assertEquals(3, maxDepth.maxDepth(moreNodes));
    }
}