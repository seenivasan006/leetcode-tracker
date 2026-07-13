// Last updated: 13/07/2026, 21:00:24
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m = s.length(), n = p.length();
4        boolean[][] dp = new boolean[m + 1][n + 1];
5
6        dp[0][0] = true;
7
8        for (int j = 2; j <= n; j++) {
9            if (p.charAt(j - 1) == '*') {
10                dp[0][j] = dp[0][j - 2];
11            }
12        }
13
14        for (int i = 1; i <= m; i++) {
15            for (int j = 1; j <= n; j++) {
16                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
17                    dp[i][j] = dp[i - 1][j - 1];
18                } else if (p.charAt(j - 1) == '*') {
19                    dp[i][j] = dp[i][j - 2];
20                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
21                        dp[i][j] |= dp[i - 1][j];
22                    }
23                }
24            }
25        }
26
27        return dp[m][n];
28    }
29}