package 哈希表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //从小到大排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            //剪枝操作
            if (nums[i] > 0){
                return result;
            }

            if (i > 0 && nums[i] == nums[i - 1]) { //去重 a
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0){
                    right--;
                }else if (sum < 0){
                    left++;
                }else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //去重逻辑放在找到三元组之后,对 left 和 right)
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
            }
        return result;
        }

}
