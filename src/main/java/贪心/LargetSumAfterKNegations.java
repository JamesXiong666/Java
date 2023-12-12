package 贪心;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargetSumAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        //将数组按照绝对值大小从大到小排序，注意要那种绝对值的大小
        /*
        这段代码的意思是:

IntStream.of(nums) 将数组 nums 转换为一个 IntStream。
.boxed() 将 IntStream 装箱为 Stream<Integer>。
.sorted((a, b) -> Math.abs(b) - Math.abs(a)) 对流中的元素按照它们的绝对值进行降序排序。
.mapToInt(Integer::intValue) 将 Stream<Integer> 转换为 IntStream。
.toArray() 将排序后的 IntStream 转换为数组。
综合起来，这段代码的作用是对数组 nums 中的元素按照它们的绝对值进行降序排序，并将排序后的结果存储回数组 nums 中。
        * */
        nums = IntStream.of(nums).boxed()
                .sorted((a, b) -> Math.abs(b) - Math.abs(a) )
                .mapToInt(Integer::intValue)
                .toArray();
        int len = nums.length;
        for (int i = 0; i < len; i++){
            if (nums[i] < 0 && k > 0){
                nums[i] = -nums[i];
                k--;
            }
        }
        // 如果k为奇数，先偶数次最小的还是和原来一样，最后一次将，那么反复转变数值最小的元素，将K用完
        if (k % 2 == 1){
            nums[len - 1] = -nums[len - 1];
        }
        return Arrays.stream(nums).sum();
    }
}
