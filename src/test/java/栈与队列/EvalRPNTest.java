package 栈与队列;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvalRPNTest {
    @Test
    public void testEvalRPN() {
        EvalRPN evalRPN = new EvalRPN();

        String[] tokens1 = {"5", "3", "+", "4", "+"};
        int result1 = evalRPN.evalRPN(tokens1);
        Assert.assertEquals(12, result1);

        String[] tokens2 = {"2", "1", "+", "3","*"};
        int result2 = evalRPN.evalRPN(tokens2);
        Assert.assertEquals(9, result2);

        String[] tokens3 = {"4", "13", "5", "/","+"};
        int result3 = evalRPN.evalRPN(tokens3);
        Assert.assertEquals(6, result3);

    }
}

