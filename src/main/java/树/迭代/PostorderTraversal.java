package 树.迭代;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    //后续遍历顺序 左-右-根  入栈顺序 中-左-右  出栈顺序 中-右-左,最后翻转
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);//中 入栈
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop(); //出栈
            result.add(node.val);
            if (node.left!= null) {
                stack.push(node.left);//左 入栈
            }
            if (node.right!= null) {
                stack.push(node.right);//右 入栈
            }
        }
        Collections.reverse(result);
        return result;
    }
}
