package 回溯;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetTest {

    @Test
    public void testSubsets() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = Arrays.asList(
                new ArrayList<>(),
                Arrays.asList(1),
                Arrays.asList(1, 2),
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3),
                Arrays.asList(2),
                Arrays.asList(2, 3),
                Arrays.asList(3)
        );

        List<List<Integer>> result = new Subset().subsets(nums);

        Assertions.assertEquals(expected, result);
    }
}