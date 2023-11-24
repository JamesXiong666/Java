package 哈希表;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        //如果 nums 为空,则返回空数组
        int[] res = new int[0];
        if (nums == null || nums.length == 0) {
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //如果 map 中存在 target - nums[i] 则返回
            if (map.containsKey(target - nums[i])) {
                res = new int[]{map.get(target - nums[i]), i};
                return res;
            }
            //如果没有匹配到将 元素nums[i]和 下标i存入 map 中
            map.put(nums[i], i);
        }
        return res;
    }
}
