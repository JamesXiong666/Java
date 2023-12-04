package 回溯;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
    @Test
    void combinationSum_test1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 3));
        expected.add(Arrays.asList(7));
        assertEquals(expected, combinationSum.combinationSum(candidates, target));
    }

    @Test
    void combinationSum_test2() {
        int[] candidates = {2};
        int target = 2;
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2));
        assertEquals(expected, combinationSum.combinationSum(candidates, target));
    }

    @Test
    void combinationSum_test3() {
        int[] candidates = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 1, 1, 1, 1));
        expected.add(Arrays.asList(1, 1, 1, 2));
        expected.add(Arrays.asList(1, 1, 3));
        expected.add(Arrays.asList(1, 2, 2));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(5));
        assertEquals(expected, combinationSum.combinationSum(candidates, target));
    }

    @Test
    void combinationSum_test4() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 5));
        expected.add(Arrays.asList(1, 7));
        expected.add(Arrays.asList(2,2,2,2));
        expected.add(Arrays.asList(2, 6));
        expected.add(Arrays.asList(8));
        assertEquals(expected, combinationSum.combinationSum(candidates, target));
    }

}