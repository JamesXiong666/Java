package 数组;
//最小子数组的长度
public class MinSubArrayLen {
    //滑动窗口 双指针
    public int minSubArrayLen(int s, int[] nums){
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++){
            sum += nums[right];
            while (sum >=s){
                result = Math.min(result, right - left + 1);
                sum -= nums[left];
                left++;
            }
            left = 0;
        }
        return result == Integer.MAX_VALUE? 0 : result;
    }
}
