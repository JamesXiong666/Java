package 贪心;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargetSumAfterKNegationsTest {
    @Test
    public void testLargestSumAfterKNegations() {
        LargetSumAfterKNegations largetSumAfterKNegations = new LargetSumAfterKNegations();

        // Test case 1
        int[] nums1 = {1, -2, 3, -4, 5};
        int k1 = 2;
        int expected1 = 15;
        int result1 = largetSumAfterKNegations.largestSumAfterKNegations(nums1, k1);
        assertEquals(expected1, result1);

        // Test case 2
        int[] nums2 = {2, -3, 4, -5, 6};
        int k2 = 3;
        int expected2 = 16;
        int result2 = largetSumAfterKNegations.largestSumAfterKNegations(nums2, k2);
        assertEquals(expected2, result2);

        // Test case 3
        int[] nums3 = {-1, -2, -3, -4, -5};
        int k3 = 2;
        int expected3 = 3;
        int result3 = largetSumAfterKNegations.largestSumAfterKNegations(nums3, k3);
        assertEquals(expected3, result3);

        // Test case 4
        int[] nums4 = {5, -4, 3, -2, 1};
        int k4 = 3;
        int expected4 = 13;
        int result4 = largetSumAfterKNegations.largestSumAfterKNegations(nums4, k4);
        assertEquals(expected4, result4);
    }

}