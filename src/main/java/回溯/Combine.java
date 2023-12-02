package 回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combine {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, k, 1);
        return res;
    }

    private void backtrack(int n, int k, int startIndex) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backtrack(n, k, i + 1);
            path.removeLast();
        }
    }
}
