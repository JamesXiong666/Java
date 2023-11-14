package 哈希表;
//四数之和
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){

            //nums[i]大于 target 直接返回,剪枝操作
            if (nums[i] > 0 && nums[i] > target){
                return result;
            }
            //对 nums[i]去重
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            for (int j = i + 1; j < nums.length; j++){
                //对 nums[j]去重
                if (j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                while(right > left){
                    //nums[k] + nums[i] + nums[left] + nums[right] > target int会溢出
                    long sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target){
                        right--;
                    }else if (sum < target){
                        left++;
                    }else {
                        //四元素选好了,再对 left 和 right 去重
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }

        }
        return result;
    }
}
