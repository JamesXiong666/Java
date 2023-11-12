package 数组;

import org.junit.jupiter.api.Test;
import 数组.SpiralMatrix;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {


        @Test
        public void testGenerateMatrix() {
            SpiralMatrix sm = new SpiralMatrix();

            int[][] result1 = sm.generateMatrix(1);
            assertEquals(1, result1.length);
            assertEquals(1, result1[0].length);
            assertEquals(1, result1[0][0]);

            int[][] result2 = sm.generateMatrix(3);
            assertEquals(3, result2.length);
            assertEquals(3, result2[0].length);
            assertEquals(1, result2[0][0]);
            assertEquals(2, result2[0][1]);
            assertEquals(3, result2[0][2]);
            assertEquals(5, result2[2][2]);
            assertEquals(6, result2[2][1]);
            assertEquals(7, result2[2][0]);

            int[][] result3 = sm.generateMatrix(5);
            assertEquals(5, result3.length);
            assertEquals(5, result3[0].length);
            assertEquals(1, result3[0][0]);
            assertEquals(2, result3[0][1]);
            assertEquals(3, result3[0][2]);
            assertEquals(4, result3[0][3]);
            assertEquals(5, result3[0][4]);
            assertEquals(9, result3[4][4]);
            assertEquals(10, result3[4][3]);

        }
    }


