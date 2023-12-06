package 回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subset {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subsetsHelper(nums, 0);
        return result;
    }

    private void subsetsHelper(int[] nums, int startIndex) {
        result.add(new ArrayList<>(path)); // 保存当前路径
        if (startIndex >= nums.length) return;
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]); // 选择当前数
            subsetsHelper(nums, i + 1); // 继续选择下一个数
            path.removeLast(); // 回溯
        }
    }
}
