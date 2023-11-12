package 数组;

import org.junit.jupiter.api.Test;
import 数组.RemoveElement;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest  {


    @Test
    public void testRemoveElement() {
        int[] nums = {1, 2, 3, 4, 5};
        int val = 3;
        int expected = 4;

        RemoveElement removeElement = new RemoveElement();
        int result = removeElement.removeElement(nums, val);

        assertEquals(expected, result);
    }

}