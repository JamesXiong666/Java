package 栈与队列;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateTest {
    RemoveDuplicate removeDuplicate = new RemoveDuplicate();

    @Test
    public void testRemoveDuplicateLetters() {
        String S = "abbccbz";
        String result = removeDuplicate.removeDuplicateLetters(S);
        Assert.assertEquals("abz", result);
    }

    @Test
    public void testRemoveDuplicateLetters_emptyString() {
        String S = "";
        String result = removeDuplicate.removeDuplicateLetters(S);
        Assert.assertEquals("", result);
    }

    @Test
    public void testRemoveDuplicateLetters_noDuplicate() {
        String S = "abcdefg";
        String result = removeDuplicate.removeDuplicateLetters(S);
        Assert.assertEquals("abcdefg", result);
    }

    @Test
    public void testRemoveDuplicateLetters_allDuplicates() {
        String S = "abbccc";
        String result = removeDuplicate.removeDuplicateLetters(S);
        Assert.assertEquals("ac", result);
    }

}