package 回溯;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Partition {
    List<List<String>> lists = new ArrayList<>();
    Deque<String> deque = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backback(s, 0);
        return lists;
    }

    private void backback(String s, int index) {
        //如果其实位置大于 s 的大小,说明找到了一组分割方案
        if ( index == s.length()){
            lists.add(new ArrayList<>(deque));
            return;
        }

        for (int i=index; i<s.length(); i++){
            //如果是回文串,则添加到集合中
            if (isPartition(s, index, i)){
                String str = s.substring(index, i+1);
                deque.addLast(str);
            }else{
                continue;
            }
            //起始位置后移,保证不重复
            backback(s, i+1);
            deque.removeLast();
        }

    }

    private boolean isPartition(String s, int index, int end) {
        for (int i = index,j = end; i < j; i++,j--){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
