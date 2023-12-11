package 贪心;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpTest {
    @Test
    public void testJump() {
        Jump jump = new Jump();

        int[] nums = new int[]{2, 3, 1, 1, 4};
        assertEquals(2, jump.jump(nums));

        nums = new int[]{2, 3, 2, 4, 1, 1, 1};
        assertEquals(3, jump.jump(nums));

        nums = new int[]{1, 2, 3};
        assertEquals(2, jump.jump(nums));

        nums = new int[]{};
        assertEquals(0, jump.jump(nums));

        nums = new int[]{1};
        assertEquals(0, jump.jump(nums));

        nums = new int[]{1, 1, 1, 1, 1};
        assertEquals(4, jump.jump(nums));
    }

}