package 回溯;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSum2Test {
    @Test
    public void testCombinationSum2() {
        int[] candidates = {2,2, 3, 4, 5,6,7,8};
        int target = 10;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 6));
        expected.add(Arrays.asList(2, 3, 5));
        expected.add(Arrays.asList(2, 8));
        expected.add(Arrays.asList(3, 7));
        expected.add(Arrays.asList(4,6));

        CombinationSum2 cs = new CombinationSum2();
        List<List<Integer>> result = cs.combinationSum2(candidates, target);

        assertEquals(expected, result);
    }
}