package 贪心;

public class Jump {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }
        //记录跳跃的次数
        int count = 0;
        //当前的覆盖最大区域
        int curDistance = 0;
        //最大的覆盖区域
        int nextDistance = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            //更新下一步覆盖最远距离下标
            nextDistance = Math.max(nextDistance, i + nums[i]);
            //遇到当前覆盖的最远距离下标
            if (i == curDistance) {
                //更新当前覆盖的最远距离下标
                curDistance = nextDistance;
                //跳跃次数+1
                count++;
                if (curDistance >= nums.length - 1) {
                    break;
                }
            }
        }
        return count;
    }
}
