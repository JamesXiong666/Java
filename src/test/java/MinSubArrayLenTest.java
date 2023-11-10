import org.junit.jupiter.api.Test;
import 数组.MinSubArrayLen;

import static org.junit.jupiter.api.Assertions.*;

class MinSubArrayLenTest {


        @Test
        public void testMinSubArrayLen() {
            int[] nums = {2, 3, 1, 2, 4, 3};
            int s = 7;
            int expected = 4;
            int result  =new MinSubArrayLen().minSubArrayLen(s, nums);

            assertEquals(expected, result);
        }


    }


