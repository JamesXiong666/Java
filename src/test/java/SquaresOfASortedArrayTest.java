import org.junit.jupiter.api.Test;
import 数组.SquaresOfASortedArray;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {
    @Test
    void testSortedSquares_mixedPositiveAndNegativeNumbers() {
        int[] A = {-2,-3, -1, 2};
        int[] result = new SquaresOfASortedArray().sortedSquares(A);
        int[] expected = {1, 4, 4, 9};
        assertArrayEquals(expected, result);
    }

}