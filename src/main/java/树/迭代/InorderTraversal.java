package 树.迭代;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//中序遍历顺序 左-中-右 入栈顺序:左右
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur!= null ||!stack.isEmpty()) {
            //指针一直向左遍历
            if (cur!= null) {
                stack.push(cur);
                cur = cur.left;
            }else {//当指针为空时，从栈中弹出一个节点，并将其添加到结果中
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }
}
