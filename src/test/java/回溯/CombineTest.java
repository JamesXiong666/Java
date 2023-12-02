package 回溯;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombineTest {
    @Test
    public void testCombine() {
        Combine combine = new Combine();
        List<List<Integer>> result = combine.combine(4, 2);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(1, 4),
                Arrays.asList(2, 3),
                Arrays.asList(2, 4),
                Arrays.asList(3, 4)
        );
        assertEquals(expected, result);
    }
}
