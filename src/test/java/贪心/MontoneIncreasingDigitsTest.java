package 贪心;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontoneIncreasingDigitsTest {
    @Test
    public void testMonotoneIncreasingDigits() {
        MontoneIncreasingDigits digits = new MontoneIncreasingDigits();

        // Test case 1
        int N1 = digits.monotoneIncreasingDigits(1234);
        Assert.assertEquals(1234, N1);

        // Test case 2
        int N2 = digits.monotoneIncreasingDigits(987654321);
        Assert.assertEquals(899999999, N2);

        // Test case 3
        int N3 = digits.monotoneIncreasingDigits(123456789);
        Assert.assertEquals(123456789, N3);

}}