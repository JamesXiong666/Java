package 数组;
//有序数组的平方后的排序
public class SquaresOfASortedArray {
    //双指针
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        int index = right;
        while (left <= right) {
            if (Math.abs(A[left]) >= Math.abs(A[right])) {
                result[index--] = A[left] * A[left];
                ++left;
            } else {
                result[index--] = A[right] * A[right];
                --right;
            }
        }
        return result;
    }
}
