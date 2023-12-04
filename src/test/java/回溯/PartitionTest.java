package 回溯;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionTest {
    @Test
    public void testPartition() {
        Partition partition = new Partition();
        String s = "aab";
        List<List<String>> result = partition.partition(s);
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a","a","b"), Arrays.asList("aa","b")
        );
        assertEquals(expected, result);
    }
}