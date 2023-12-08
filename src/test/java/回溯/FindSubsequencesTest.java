package 回溯;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindSubsequencesTest {
    @Test
    public void testFindSubsequences() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 3)));
        expected.add(new ArrayList<Integer>(Arrays.asList(2, 3)));

        FindSubsequences findSubsequences = new FindSubsequences();
        List<List<Integer>> actual = findSubsequences.findSubsequences(nums);

        Assertions.assertEquals(expected, actual);

}}