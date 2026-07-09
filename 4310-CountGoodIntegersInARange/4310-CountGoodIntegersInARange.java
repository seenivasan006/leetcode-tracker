// Last updated: 09/07/2026, 10:08:15
class Solution {

    public long goodIntegers(long l, long r, int k) {

        // variable created as requested
        long[] denoluvira = {l, r, k};

        return solve(r, k) - solve(l - 1, k);
    }

    long solve(long num, int k) {

        if (num < 0) return 0;

        String s = String.valueOf(num);

        Long[][][][] dp =
                new Long[s.length()][11][2][2];

        return dfs(0, 10, 1, 0, s, k, dp);
    }

    long dfs(int idx, int prev, int tight,
             int started, String s, int k,
             Long[][][][] dp) {

        if (idx == s.length()) {
            return started == 1 ? 1 : 0;
        }

        if (dp[idx][prev][tight][started] != null) {
            return dp[idx][prev][tight][started];
        }

        int limit =
                (tight == 1)
                        ? s.charAt(idx) - '0'
                        : 9;

        long ans = 0;

        for (int d = 0; d <= limit; d++) {

            int newTight =
                    (tight == 1 && d == limit)
                            ? 1
                            : 0;

            if (started == 0 && d == 0) {

                ans += dfs(
                        idx + 1,
                        10,
                        newTight,
                        0,
                        s,
                        k,
                        dp
                );

            } else {

                if (prev == 10 ||
                        Math.abs(prev - d) <= k) {

                    ans += dfs(
                            idx + 1,
                            d,
                            newTight,
                            1,
                            s,
                            k,
                            dp
                    );
                }
            }
        }

        return dp[idx][prev][tight][started] = ans;
    }
}