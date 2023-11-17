package 字符串;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {
    @Test
    public void testRemoveWords() {

        // Test case 3: s has multiple words
        String s3 = "   hello   world   ";
        Assert.assertEquals("world hello", new ReverseWords().removeWords(s3));

        // Test case 5: s has leading, trailing, and extra spaces between words
        String s5 = "   extra     spaces   between   words   ";
        Assert.assertEquals("words between spaces extra", new ReverseWords().removeWords(s5));
    }

}