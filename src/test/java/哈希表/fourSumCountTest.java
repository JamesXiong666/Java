package 哈希表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fourSumCountTest {
    @Test
    public void testFourSumCount() {
        fourSumCount fsc = new fourSumCount();

        int[] nums1 = {1, 2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};

        int expected = 2;
        int result = fsc.fourSumCount(nums1, nums2, nums3, nums4);

        assertEquals(expected, result);
    }

}