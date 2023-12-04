package 回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    int sum = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //加标志数组,用来辅助判断同层节点是否已经遍历
        used = new boolean[candidates.length];
        //为了将所有的数组放在一起,所以先进行遍历
        Arrays.sort(candidates);
        // 回溯
        backtrack(candidates,target, 0);
        return res;
    }

    private void backtrack(int[] candidates, int target, int startIndex) {
        if (sum == target){
            res.add(new ArrayList<>(path));
        }
        for (int i = startIndex; i < candidates.length; i++) {
            // 剪枝
            if (sum + candidates[i] > target) break;
            //出现重复节点,同层的第一个节点已经被访问过,所以直接跳过
            if (i > startIndex && candidates[i] == candidates[i - 1]) continue;
            // 标记当前节点已经遍历过
            used[i] = true;
            // 记录当前节点
            path.add(candidates[i]);
            // 记录当前节点的和
            sum += candidates[i];
            //每个节点仅能选择一次,所以从下一位开始
            backtrack(candidates, target, i + 1);
            // 回溯
            used[i] = false;
            sum -= candidates[i];
            path.removeLast();
        }
        }
    }



