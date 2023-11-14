package 哈希表;
//四数相加||
import java.util.HashMap;
import java.util.Map;

public class fourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //统计数组1和数组2中的元素之和,同时统计出现的次数,放入map
        for (int i : nums1){
            for (int j : nums2){
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        //遍历数组3和数组4,计算两个数组之和,同时在map中查找是否存在该元素之和,如果存在则加到结果中
        for (int i : nums3){
            for (int j : nums4){
                res += map.getOrDefault(-i - j, 0);
                }
            }
        return res;
        }
    }
