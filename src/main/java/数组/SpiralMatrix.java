package 数组;
//螺旋矩阵
public class SpiralMatrix {
    //注意边界取值 左闭右开
    public int[][] generateMatrix(int n) {
        int loop = n/2; //控制循环次数
        int[][] result = new int[n][n];
        int startx = 0;
        int starty = 0;
        int count = 1;
        int offset = 1;
        int i,j;

        while(loop-->0){
            i = startx;
            j = starty;

            //模拟填充上行,从左到右  左闭右开
            for (j = starty; j < n - offset; j++){
                result[i][j] = count++;
            }

            //填充右行,从上到下
            for (i = startx; i < n - offset; i++){
                result[i][j] = count++;
            }

            //填充下行,从右到左
            for (; j > starty; j--){
                result[i][j] = count++;
            }

            //填充左行,从下到上
            for (; i > startx; i--){
                result[i][j] = count++;
            }

            startx++;
            starty++;

            offset += 1;
        }

        if (n % 2 == 1){
            result[startx][starty] = count;
        }

        return result;
    }
}
