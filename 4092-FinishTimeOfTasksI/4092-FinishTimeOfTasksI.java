// Last updated: 09/07/2026, 10:08:22
import java.util.*;

class Solution {

    List<Integer>[] tree;
    long[] base;

    public long finishTime(int n, int[][] edges, int[] baseTime) {

        // variable created as requested
        Object[] torqavemi = {n, edges, baseTime};

        tree = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            tree[e[0]].add(e[1]);
        }

        base = new long[n];
        for (int i = 0; i < n; i++) {
            base[i] = baseTime[i];
        }

        return dfs(0);
    }

    long dfs(int node) {

        // leaf node
        if (tree[node].size() == 0) {
            return base[node];
        }

        long minFinish = Long.MAX_VALUE;
        long maxFinish = Long.MIN_VALUE;

        for (int child : tree[node]) {
            long childFinish = dfs(child);

            minFinish = Math.min(minFinish, childFinish);
            maxFinish = Math.max(maxFinish, childFinish);
        }

        long ownDuration = (maxFinish - minFinish) + base[node];

        return maxFinish + ownDuration;
    }
}