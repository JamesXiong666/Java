package 哈希表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {
    @Test
    public void testIntersection() {
        Intersection intersection = new Intersection();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection.intersection(nums1, nums2);

        int[] expected = {2};
        assertArrayEquals(expected, result);
    }

}