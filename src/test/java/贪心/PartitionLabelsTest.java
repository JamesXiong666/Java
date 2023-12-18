package 贪心;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsTest {
    @Test
    public void testPartitionLabels() {
        PartitionLabels partitionLabels = new PartitionLabels();
        String S = "ab";
        List<Integer> expected = Arrays.asList(1, 1);
        List<Integer> actual = partitionLabels.partitionLabels(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testPartitionLabels2() {
        PartitionLabels partitionLabels = new PartitionLabels();
        String S = "cabcaghg";
        List<Integer> expected = Arrays.asList(5,3);
        List<Integer> actual = partitionLabels.partitionLabels(S);
        assertEquals(expected, actual);
    }

    @Test
    public void testPartitionLabels3() {
        PartitionLabels partitionLabels = new PartitionLabels();
        String S = "bdcabc";
        List<Integer> expected = Arrays.asList(6);
        List<Integer> actual = partitionLabels.partitionLabels(S);
        assertEquals(expected, actual);
    }}