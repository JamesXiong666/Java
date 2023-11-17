package 栈与队列;

import java.util.Stack;

//用栈实现队列
public class MyQue {
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();

    //入队
    public void push(int x) {
        stackIn.push(x);
    }

    //出队
    public int pop() {
        dumpStackIn();
        return stackOut.pop();
    }

    //获取队首元素
    public int peek() {
        dumpStackIn();
        return stackOut.peek();
    }

    //判断队列是否为空
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }


    //如果 stackOut 为空,那么将 stackIn 中的元素全部放到 stackOut 中
    private void dumpStackIn() {
        if (!stackOut.isEmpty()) return;
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
    }
}
