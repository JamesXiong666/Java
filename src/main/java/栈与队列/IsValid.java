package 栈与队列;

import java.util.Deque;
import java.util.LinkedList;

//有效括号
public class IsValid {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for (int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            //碰到左括号,就把相应的右括号入栈
            if (ch == '('){
                deque.push(')');
            }else if (ch == '{'){
                deque.push('}');
            }else if (ch == '['){
                deque.push(']');
            }else if (deque.isEmpty() || deque.peek()!= ch){
                return false;
            }else {
                deque.pop();
            }
        }
        //如果最后都匹配完成就为空
        return deque.isEmpty();
    }

}
