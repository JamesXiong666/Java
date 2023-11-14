package 哈希表;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // 遍历数组 1
        for (int num :  nums1) {
            set.add(num);
        }
        //遍历数组 2 ,并且判断元素是否在 set 中
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        //将结果集合转为数组
        //return result.stream().mapToInt(x -> x).toArray();
        //申请另一个数组res存放result 中的元素,最后返回数组
        int[] res = new int[result.size()];
        int i = 0;
        for (int num : result) {
            res[i++] = num;
        }
        return res;
    }
}