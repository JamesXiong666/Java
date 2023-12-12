package 贪心;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanCompleteCircuitTest {
    @Test
    public void testCanCompleteCircuit() {
        int[] gas = {1, 2, 3, 4};
        int[] cost = {2, 3, 4, 5};
        CanCompleteCircuit ccc = new CanCompleteCircuit();
        int result = ccc.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);

        gas = new int[]{2, 3, 4, 5};
        cost = new int[]{3, 4, 5, 6};
        result = ccc.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);

        gas = new int[]{2, 3, 4, 5};
        cost = new int[]{1, 2, 3, 4};
        result = ccc.canCompleteCircuit(gas, cost);
        assertEquals(0, result);

        gas = new int[]{2, 5, 2,3,5};
        cost = new int[]{1, 2, 8, 2,4};
        result = ccc.canCompleteCircuit(gas, cost);
        assertEquals(3, result);
}}