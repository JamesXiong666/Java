package 栈与队列;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentTest {

    @Test
    public void testTopKFrequent1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {1, 2};
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] actual = topKFrequent.topKFrequent1(nums, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testTopKFrequent2() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {2, 1};  //可按任意顺序返回答案
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] result = topKFrequent.topKFrequent2(nums, k);
        Assert.assertArrayEquals(expected, result);
    }

}