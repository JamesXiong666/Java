package 栈与队列;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    //基于小顶堆实现
    public int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();//key为数组元素值,val 为对应出现的次数
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //在优先队列中存储二元组(num,cnt),cnt 表示元素值 num 在数组中出现的次数
        // 出现次数按从对头到队尾的顺序从小到大排,出现次数最低的在队头(相当于小顶堆)
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair1[1] - pair2[1]);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){//小顶堆只需要维持 k 个元素有序
            if(pq.size()<k){//小顶堆元素个数小于 k 个时直接加
                pq.add(new int[]{entry.getKey(), entry.getValue()});
            }else{
                if(entry.getValue() > pq.peek()[1]){//如果当前元素值出现次数大于小顶堆中最小元素值出现次数,则替换
                    pq.poll(); //弹出队头(小顶堆的根节点,即把堆里出现次数最少的那个删除,留下的就是出现次数最多的)
                    pq.add(new int[]{entry.getKey(), entry.getValue()});
                }
            }
        }
        int[] result = new int[k];
        for(int  i=k-1;i>=0;i--){//从小顶堆中依次取出元素值,放入结果数组中,先弹出的是堆的根,出现次数少,后面弹出出现次数多
            result[i] = pq.poll()[0];
        }
        return result;

    }

    public <var> int[] topKFrequent2(int[] nums, int k) {
        //优先级队列,为了避免复杂 api 操作,pq 存储数组
        //lambda 表达式设置优先级队列从大到小存储 o1-o2 为从小到大,o2-o1 为从大到小
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();//记录元素出现次数
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            //将 kv 转换成数组
            int[] tmp = new int[2];
            tmp[0] = x.getKey();
            tmp[1] = x.getValue();
            pq.offer(tmp);
            if(pq.size() > k) pq.poll();
        }
        for(int i = 0; i<k;i++){
            res[i] = pq.poll()[0]; //获取优先队列里的元素
        }
        return res;
    }

}

