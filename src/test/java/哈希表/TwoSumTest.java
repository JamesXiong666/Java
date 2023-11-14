package 哈希表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = new TwoSum().twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumEmptyArray() {
        int[] nums = {};
        int target = 0;
        int[] expected = {};
        int[] result = new TwoSum().twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumNoMatchingPair() {
        int[] nums = {2, 14, 11, 15};
        int target = 16;
        int[] expected = {0, 1};
        int[] result = new TwoSum().twoSum(nums, target);
        assertArrayEquals(expected, result);
    }


}