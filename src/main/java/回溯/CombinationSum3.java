package 回溯;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(n,k,1,0);
        return res ;
    }

    private void backTracking(int target, int k, int index, int sum) {
        //减枝
        if (sum > target){
            return;
        }

        if (path.size() == k && sum == target){
            res.add(new LinkedList<>(path));
        }

        //减枝 9-(k-path.size())+1
        for (int i = index; i <= 9; i++) {
            path.add(i);
            sum +=i;
            backTracking(target,k,i+1,sum);
            //减枝
            path.removeLast();
            sum -= i;
        }
    }
}
