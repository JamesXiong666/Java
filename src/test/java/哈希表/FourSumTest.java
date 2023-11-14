package 哈希表;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {
    @Test
    public void testFourSum() {
        FourSum fourSum = new FourSum();

        int[] nums = {1, -2, 3, 0, 2};
        int target = 1;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-2, 0, 1, 2));
        assertEquals(expected, fourSum.fourSum(nums, target));

        nums = new int[]{1,0,-1,0,-2,2};
        target = 0;
        expected = new ArrayList<>();
        expected.add(Arrays.asList(-2,-1,1,2));
        expected.add(Arrays.asList(-2, 0, 0, 2));
        expected.add(Arrays.asList(-1, 0,0, 1));
        assertEquals(expected, fourSum.fourSum(nums, target));

        nums = new int[]{1, 1, 2, 2, 3};
        target = 6;
        expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 1, 2, 2));
        assertEquals(expected, fourSum.fourSum(nums, target));


    }


}