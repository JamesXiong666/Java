package 回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates); // 先排序
        backtracking(res, new ArrayList<>(), candidates, target, 0,0);
        return res;
    }

    private void backtracking(List<List<Integer>> res, ArrayList<Integer> path, int[] candidates, int target, int sum, int index) {
        // 找到了数字和为 target 的组合
        if (sum == target){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < candidates.length; i++){
            // 如果 sum + candidates[i] > target 就终止遍历
            if (sum + candidates[i] > target) break;
            path.add(candidates[i]);
            backtracking(res, path, candidates, target, sum + candidates[i], i);
            // 回溯,移除路径 path 最后一个元素
            path.remove(path.size() - 1);
        }
    }
}