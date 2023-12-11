package 贪心;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0 ; i < nums.length ; i++){
            count += nums[i];
            //取区间累加的最大值（相当于不断确定最大子序终止位置
            sum = Math.max(sum, count);
            if (count < 0){
                //相当于重置最大子序起始位置，因为遇到负数一定是拉低总和
                count = 0;
            }
        }
        return sum;
    }
}
