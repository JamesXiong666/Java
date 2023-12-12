package 贪心;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMindArrowShotsTest {
    @Test
    public void testFindMinArrowShots() {
        FindMindArrowShots findMindArrowShots = new FindMindArrowShots();

        // Test case 1
        int[][] points1 = {{3, 4}, {1, 2}, {2, 3}};
        int expected1 = 2;
        int result1 = findMindArrowShots.findMinArrowShots(points1);
        Assert.assertEquals(expected1, result1);

        // Test case 2
        int[][] points2 = {{1, 2}, {3, 4}, {5, 6}};
        int expected2 = 3;
        int result2 = findMindArrowShots.findMinArrowShots(points2);
        Assert.assertEquals(expected2, result2);

        // Test case 3
        int[][] points3 = {{2, 3}, {1, 2}, {3, 4}, {5, 6}};
        int expected3 = 3;
        int result3 = findMindArrowShots.findMinArrowShots(points3);
        Assert.assertEquals(expected3, result3);
    }

}