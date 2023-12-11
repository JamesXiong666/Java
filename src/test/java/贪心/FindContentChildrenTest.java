package 贪心;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindContentChildrenTest {
    @Test
    public void testFindContentChildren() {
        int[] g = {3, 6, 9, 10};
        int[] s = {1, 2, 3, 4, 5};
        FindContentChildren finder = new FindContentChildren();
        int result = finder.findContentChildren(g, s);
        Assert.assertEquals(1, result);
    }

}