package 回溯;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsWithDupTest {
    @Test
    public void testSubsetsWithDup() {
        SubsetsWithDup subsetsWithDup = new SubsetsWithDup();

        int[] nums = {1, 2, 2};
        List<List<Integer>> result = subsetsWithDup.subsetsWithDup(nums);

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(1,2),
                Arrays.asList(1, 2, 2),
                Arrays.asList(2),
                Arrays.asList(2, 2)
        );

        assertEquals(expected, result);

}}