package 树.递归;

import 树.TreeNode;

import java.util.ArrayList;

public class FindMode {
    ArrayList<Integer> resList = new ArrayList<Integer>();
    int maxCount = 0;
    int count = 0;
    TreeNode pre;

    public int[] findMode(TreeNode root)
    {
        resList = new ArrayList<>();
        maxCount = 0;
        count = 0;
        pre = null;
        findMode1(root);
        int[] res = new int[resList.size()];
        for (int i=0;i<resList.size();i++){
            res[i] = resList.get(i);
        }
        return res;
    }

    public void findMode1(TreeNode root) {
        if (root == null) return;
        findMode1(root.left);

        //计数
        if (pre == null || pre.val != root.val){
            count = 1;
        }else{
            count++;
        }

        //更新结果以及 maxCount
        if (count > maxCount){
            resList.clear();
            resList.add(root.val);
            maxCount = count;
        }else if (count == maxCount){
            resList.add(root.val);
        }
        pre= root;

        findMode1(root.right);
    }

}
