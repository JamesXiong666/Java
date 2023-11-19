package 栈与队列;
//给定一个仅包含小写字母的字符串，去除字符串中重复的字母，使得每个字母只出现一次。需保证返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
import java.util.ArrayDeque;

public class RemoveDuplicate {
    public String removeDuplicateLetters(String S) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < S.length(); i++){
            ch = S.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch){
                deque.push(ch);
            } else{
                deque.pop();
            }
        }
        String str = "";
        //剩余的元素即为不重复的元素
        while (!deque.isEmpty()){
            str += deque.pop();
        }
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse;
    }
}
