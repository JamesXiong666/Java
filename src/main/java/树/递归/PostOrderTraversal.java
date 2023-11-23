package 树.递归;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    public void postorder(TreeNode root, List<Integer> result) {
        if (root == null){
            return;
        }
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }
}
