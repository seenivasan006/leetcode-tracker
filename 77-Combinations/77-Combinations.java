// Last updated: 09/07/2026, 10:08:43
import java.util.*;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k, new ArrayList<>());
        return res;
    }

    void backtrack(int start, int n, int k, List<Integer> temp) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) {
            temp.add(i);
            backtrack(i + 1, n, k, temp);
            temp.remove(temp.size() - 1);
        }
    }
}