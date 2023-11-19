package 栈与队列;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsValidTest {
    @Test
    public void testValidInput() {
        IsValid isValid = new IsValid();

        // Test case 1: Valid input
        String s1 = "(({}))";
        assertTrue(isValid.isValid(s1));

        // Test case 2: Valid input
        String s2 = "{[]}";
        assertTrue(isValid.isValid(s2));

        // Test case 3: Valid input
        String s3 = "({[()]})";
        assertTrue(isValid.isValid(s3));
    }

    @Test
    public void testInvalidInput() {
        IsValid isValid = new IsValid();

        // Test case 1: Invalid input
        String s1 = "({[)]}";
        assertFalse(isValid.isValid(s1));

        // Test case 2: Invalid input
        String s2 = "({[()})";
        assertFalse(isValid.isValid(s2));

        // Test case 3: Invalid input
        String s3 = "({[()})";
        assertFalse(isValid.isValid(s3));
    }

}