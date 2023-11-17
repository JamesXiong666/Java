package 栈与队列;

import java.util.ArrayDeque;
import java.util.Deque;

//用队列实现栈
public class MyStack {
    Deque<Integer> que;

    public MyStack() {
        que = new ArrayDeque<>();
    }

    //进栈
    public void push(int x) {
        que.addLast(x);
    }

    //出栈
    public int pop() {
        int size = que.size();
        size--;
        //将队列前面的元素移到队列后面
        while (size > 0) {
            que.addLast(que.peekFirst());
            que.pollFirst();
        }
        //弹出第一个元素
        int res = que.pollFirst();
        return res;
    }

    //查看栈顶,即队列的最后一个元素
    public int top(){
        return que.peekLast();
    }

    //查看是否为空
    public boolean empty(){
        return que.isEmpty();
    }



}
