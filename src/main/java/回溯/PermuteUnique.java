package 回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique {
    List<List<Integer>> res = new ArrayList<>(); // 结果集
    List<Integer> path = new ArrayList<>(); // 路径
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used  = new boolean[nums.length];
        Arrays.fill(used,false);
        // 排序
        Arrays.sort(nums);
        backtrack(nums,used);
        return res;
    }

    private void backtrack(int[] nums, boolean[] used) {
        if (path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if ( i > 0 && nums[i] == nums[i-1] &&!used[i-1] ==false){
                continue;
            }
            //如果同一树枝nums[i]没使用过开始处理
            if (!used[i]){
                used[i] = true; //标记同一树枝nums[i]使用过，防止同一树枝重复使用
                path.add(nums[i]);
                backtrack(nums,used);
                //回溯
                path.remove(path.size()-1);
                used[i] = false;
            }
        }
    }
}
