package 贪心;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WiggleMaxLengthTest {

    @Test
    public void testWiggleMaxLength() {
        WiggleMaxLength wiggleMaxLength = new WiggleMaxLength();
        // Test case 1: empty array
        int[] nums1 = new int[0];
        Assert.assertEquals(0, wiggleMaxLength.wiggleMaxLength(nums1));

        // Test case 2: array with one element
        int[] nums2 = {1};
        Assert.assertEquals(0, wiggleMaxLength.wiggleMaxLength(nums2));

        // Test case 3: array with two elements
        int[] nums3 = {1, 2};
        Assert.assertEquals(2, wiggleMaxLength.wiggleMaxLength(nums3));

        // Test case 4: array with three elements
        int[] nums4 = {1, 2, 3};
        Assert.assertEquals(2, wiggleMaxLength.wiggleMaxLength(nums4));

        // Test case 5: array with three elements with alternating signs
        int[] nums5 = {1, -2, 3};
        Assert.assertEquals(3, wiggleMaxLength.wiggleMaxLength(nums5));

        // Test case 6: array with four elements with alternating signs
        int[] nums6 = {1, -2, 3, -4};
        Assert.assertEquals(4, wiggleMaxLength.wiggleMaxLength(nums6));
    }
}