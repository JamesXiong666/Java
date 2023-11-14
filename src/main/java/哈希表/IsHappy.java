package 哈希表;
//快乐数
import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public boolean isHappy(int n) {
        // 哈希表
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        //如果 n==1 则返回 true 否则 false
        return n == 1;
    }

    private int getNext(int n) {
        int result = 0;
        while(n > 0){
            //如 82%10=2 则 2*2=4
            int temp = n % 10;
            result += temp * temp;
            //82/10=8
            n /= 10;
        }
        return result;
    }
}
