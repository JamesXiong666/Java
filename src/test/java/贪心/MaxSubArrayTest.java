package 贪心;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {
    @Test
    public void testMaxSubArray() {
        int[] nums = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        MaxSubArray solution = new MaxSubArray();
        int result = solution.maxSubArray(nums);
        assertEquals(9, result); // The maximum sum of a subarray is 6
    }

    @Test
    public void testMaxSubArray_singleElement() {
        int[] nums = {5};
        MaxSubArray solution = new MaxSubArray();
        int result = solution.maxSubArray(nums);
        assertEquals(5, result); // The maximum sum of a subarray is 5
    }

    @Test
    public void testMaxSubArray_allNegative() {
        int[] nums = {-2, -5, -1};
        MaxSubArray solution = new MaxSubArray();
        int result = solution.maxSubArray(nums);
        assertEquals(-1, result); // The maximum sum of a subarray is -1
    }

    @Test
    public void testMaxSubArray_allZero() {
        int[] nums = {0, 0, 0, 0};
        MaxSubArray solution = new MaxSubArray();
        int result = solution.maxSubArray(nums);
        assertEquals(0, result); // The maximum sum of a subarray is 0
    }
}

