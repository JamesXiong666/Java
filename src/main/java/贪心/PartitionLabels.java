package 贪心;

import java.util.LinkedList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new LinkedList<>();
        int[] edge = new int[26];
        char[] chars = S.toCharArray();
        for (int i = 0;i < chars.length;i ++){
            edge[chars[i] - 'a'] = i;
        }
        List<Integer> list = new LinkedList<>();
        int idx = 0;
        int last = -1;
        for (int i = 0; i <chars.length;i ++){
            idx = Math.max(idx,edge[chars[i] - 'a']);
            if (i == idx){
                list.add(i - last);
                last = i;
            }
        }
        return list;
    }
}
