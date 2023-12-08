package 回溯;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindSubsequences {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtrack(nums, 0);
        return result;
    }

    private void backtrack(int[] nums, int startIndex) {
        if (path.size() >= 2){
            result.add(new ArrayList<>(path));
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++){
            // 排除空值以及选择元素小于子序列最后一个元素
            if (!path.isEmpty() && path.get(path.size() - 1) >= nums[i]||hs.contains(nums[i]))
                continue;
            // 哈希set中加入当前数
            hs.add(nums[i]);
            path.add(nums[i]);
            backtrack(nums, i + 1);
            // 回溯
            path.remove(path.size() - 1);
        }
    }

}
