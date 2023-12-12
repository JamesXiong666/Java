package 贪心;

import java.util.Arrays;
import java.util.LinkedList;

public class ReconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        //身高从大到小排（身高相同的k小的站在前面）
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1]; //a-b是升序排列，故在a[0] == b[0]时，
                //会根据k值降序排列
            } else {
                return b[0] - a[0];
            }
        });

        LinkedList<int[]> que = new LinkedList<>();
        //插入过程
        for (int[] p :people){
            que.add(p[1],p); //Linkedlist.add(index,value)会将value插入到指定index中
        }

        return que.toArray(new int[people.length][]);

    }
}
