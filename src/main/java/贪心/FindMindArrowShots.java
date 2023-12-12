package 贪心;

import java.util.Arrays;

public class FindMindArrowShots {
    public int findMinArrowShots(int[][] points) {
        //根据气球直径的开始从小到大排序
        //使用Integer内置比较方法，不会溢出
        //对一个二维数组points进行排序。排序的依据是根据每行的第一个元素进行升序排序。
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 1; //points不为空至少需要一支箭
        for (int i = 1; i <points.length; i++){
            //气球i和气球i-1不挨着，注意这里不是》=
            if (points[i][0] > points[i- 1][1]){
                count++;
            }
            else{
                //气球i和气球i-1挨着，则气球i-1的右边界为气球i的左边界
                points[i][1] = Math.min(points[i][1], points[i-1][1]);
            }
        }
        return count;
    }

}
