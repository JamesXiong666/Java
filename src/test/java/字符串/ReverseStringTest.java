package 字符串;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    public void testReverseString() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(s);
        assertEquals('o', s[0]);
        assertEquals('l', s[1]);
        assertEquals('l', s[2]);
        assertEquals('e', s[3]);
        assertEquals('h', s[4]);
    }

}