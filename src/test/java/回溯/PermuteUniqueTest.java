package 回溯;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermuteUniqueTest {
    @Test
    public void testPermuteUnique() {
        PermuteUnique solution = new PermuteUnique();
        int[] nums = {1, 1, 2};

        List<List<Integer>> result = solution.permuteUnique(nums);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 1, 2));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(2, 1, 1));

        assertEquals(expected, result);

}}