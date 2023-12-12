package 贪心;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LemonadeChangeTest {
    @Test
    public void testLemonadeChange() {
        LemonadeChange lc = new LemonadeChange();

        // Test case 1: when all bills are 5s
        int[] bills1 = {5, 5, 5, 5, 5};
        assertTrue(lc.lemonadeChange(bills1));

        // Test case 2: when all bills are 10s
        int[] bills2 = {10, 10, 10, 10, 10};
        assertFalse(lc.lemonadeChange(bills2));

        // Test case 3: when all bills are 20s
        int[] bills3 = {20, 20, 20, 20, 20};
        assertFalse(lc.lemonadeChange(bills3));

        // Test case 4: when there are enough 5s and 10s to make change for a 20
        int[] bills4 = {5, 5, 10, 20};
        assertTrue(lc.lemonadeChange(bills4));

        // Test case 5: when there are not enough 5s and 10s to make change for a 20
        int[] bills5 = {5, 5, 10};
        assertTrue(lc.lemonadeChange(bills5));

        // Test case 6: when there are not enough 5s to make change for three 20s
        int[] bills6 = {5, 5, 20, 20, 20};
        assertFalse(lc.lemonadeChange(bills6));

        // Test case 7: when there are not enough 5s and 10s to make change for three 20s
        int[] bills7 = {5, 20, 20, 20};
        assertFalse(lc.lemonadeChange(bills7));

        // Test case 8: when all bills are 10s and 20s
        int[] bills8 = {10, 20, 20, 5, 5, 5, 5, 5};
        assertFalse(lc.lemonadeChange(bills8));
    }
}