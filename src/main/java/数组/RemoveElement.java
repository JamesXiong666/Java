package 数组;
//返回数组的新长度
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex]!= val) {
                slowIndex++;
            }
        }
        return slowIndex;
    }

}
