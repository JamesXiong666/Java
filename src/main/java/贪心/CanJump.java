package 贪心;

public class CanJump {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        //覆盖范围，初始覆盖范围应该是0.因为下面的迭代是从下标0开始的
        int covered = 0;
        //在覆盖范围内更新最大的覆盖范围
        for (int i = 0; i <= covered; i++) {
            covered = Math.max(covered, i + nums[i]);
            //需要保证covered >= i，cover能够覆盖索引i
            if(covered >= i){
                if (covered >= nums.length - 1) {
                     return true;
            }
        }
        }
        return false;

    }
}
