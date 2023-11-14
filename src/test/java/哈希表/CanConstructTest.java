package 哈希表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanConstructTest {
    @Test
    public void testCanConstruct() {
        CanConstruct canConstruct = new CanConstruct();

        // Test case 1
        String ransomNote1 = "a";
        String magazine1 = "b";
        boolean result1 = canConstruct.canConstruct(ransomNote1, magazine1);
        assertFalse(result1);

        // Test case 2
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        boolean result2 = canConstruct.canConstruct(ransomNote2, magazine2);
        assertFalse(result2);

        // Test case 3
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        boolean result3 = canConstruct.canConstruct(ransomNote3, magazine3);
        assertTrue(result3);

    }
}