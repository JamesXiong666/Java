package 贪心;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {
    @Test
    public void testMaxProfit() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        MaxProfit maxProfit = new MaxProfit();
        int expected = 7;
        int actual = maxProfit.maxProfit(prices);
        Assert.assertEquals(expected, actual);
    }
}