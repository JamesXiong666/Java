package 贪心;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReconstructQueueTest {

    @Test
    public void testReconstructQueue() {
        // Test case 1
        int[][] people1 = {{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        int[][] expected1 ={{4,0},{5,0},{2,2},{3,2},{1,4},{6,0}};
        int[][] result1 = new ReconstructQueue().reconstructQueue(people1);
        boolean result = compare(expected1, result1);
        Assertions.assertTrue(result);


    }

    public static boolean compare(int[][] arr1, int[][] arr2) {
        // 判断两个数组长度是否相等
        if (arr1.length != arr2.length) {
            return false;
        }

        // 遍历数组元素进行比较
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j]!= arr2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}