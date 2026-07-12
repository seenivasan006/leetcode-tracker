# Last updated: 12/07/2026, 09:19:30
1class Solution(object):
2    def maxConsistentColumns(self, grid, limit):
3        m=len(grid)
4        if m==0:
5            return 0
6        n=len(grid[0])
7        dp = [1]*n
8        for j in range(1,n):
9            for a in range(j):
10                is_valid = True
11                for i in range(m):
12                    if abs(grid[i][j]-grid[i][a]) > limit:
13                        is_valid = False
14                        break
15                if is_valid:
16                    dp[j] = max(dp[j],dp[a]+1)
17        return max(dp) if n>0 else 0