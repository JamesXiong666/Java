package 贪心;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanJumpTest {

    @Test
    public void testCanJump() {
        CanJump canJump = new CanJump();

        int[] nums1 = {1, 0, 1, 1, 4};
        assertFalse(canJump.canJump(nums1));

        int[] nums2 = {2, 3, 1, 1, 4, 2};
        assertTrue(canJump.canJump(nums2));

        int[] nums3 = {2, 3, 1, 1, 4, 3};
        assertTrue(canJump.canJump(nums3));

        int[] nums4 = {3, 2, 1, 0, 4};
        assertFalse(canJump.canJump(nums4));

        int[] nums5 = {1, 2, 3, 4, 5, 6};
        assertTrue(canJump.canJump(nums5));
    }

}