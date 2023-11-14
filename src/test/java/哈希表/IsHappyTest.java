package 哈希表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsHappyTest {

    @Test
    void testIsHappy() {
        IsHappy isHappy = new IsHappy();

        // Test case 1
        assertTrue(isHappy.isHappy(10));

        // Test case 2
        assertFalse(isHappy.isHappy(2));

        // Test case 3
        assertTrue(isHappy.isHappy(1));

        // Test case 4
        assertFalse(isHappy.isHappy(5));

        // Test case 5
        assertFalse(isHappy.isHappy(0));
    }

}