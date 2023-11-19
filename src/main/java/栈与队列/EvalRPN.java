package 栈与队列;
//逆波兰表达式求值
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for (String s: tokens){
            if ("+".equals(s)){
                deque.push(deque.pop() + deque.pop());
            }else if("-".equals(s)){
                deque.push(-deque.pop() + deque.pop());
            }else if("*".equals(s)){
                deque.push(deque.pop() * deque.pop());
            } else if("/".equals(s)){
                int tmp1 = deque.pop();
                int tmp2 = deque.pop();
                deque.push(tmp2 / tmp1);
            }else{
                deque.push(Integer.valueOf(s));
            }
        }
        return deque.pop();
    }
}
