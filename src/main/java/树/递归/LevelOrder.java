package 树.递归;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    //一定要在开头定义一个空的 resList,不能在下面的函数中定义
    public List<List<Integer>> resList = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode node) {
        levelOrderFun(node, 0);
        return resList;
    }
    public void levelOrderFun(TreeNode node, Integer deep) {
        if (node == null) return;
        deep++;

        if (resList.size() < deep){
            //当层级增加时,reslist 的 item 也增加,根据 reslist 的索引值进行层级界定
            List<Integer> item = new ArrayList<Integer>();
            resList.add(item);
        }

        resList.get(deep-1).add(node.val);
        
        levelOrderFun(node.left, deep);
        levelOrderFun(node.right, deep);
    }


}
