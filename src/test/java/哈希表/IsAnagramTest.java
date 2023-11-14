package 哈希表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsAnagramTest {
    @Test
    public void testIsAnagram() {
        IsAnagram isAnagram = new IsAnagram();

        // Test case 1: Two anagram strings
        String s1 = "listen";
        String t1 = "silent";
        assertTrue(isAnagram.isAnagram(s1, t1));

        // Test case 2: Two non-anagram strings
        String s2 = "hello";
        String t2 = "world";
        assertFalse(isAnagram.isAnagram(s2, t2));

        // Test case 3: Two empty strings
        String s3 = "";
        String t3 = "";
        assertTrue(isAnagram.isAnagram(s3, t3));

        // Test case 4: String s is empty
        String s4 = "";
        String t4 = "world";
        assertFalse(isAnagram.isAnagram(s4, t4));

}
}