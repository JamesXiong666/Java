package 回溯;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermuteTest {

    @Test
    public void testPermute() {
        Permute permutation = new Permute();
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 3, 2)));
        expected.add(new ArrayList<Integer>(Arrays.asList(2, 1, 3)));
        expected.add(new ArrayList<Integer>(Arrays.asList(2, 3, 1)));
        expected.add(new ArrayList<Integer>(Arrays.asList(3, 1, 2)));
        expected.add(new ArrayList<Integer>(Arrays.asList(3, 2, 1)));
        assertEquals(expected, permutation.permute(nums));
    }

}