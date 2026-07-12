# Last updated: 12/07/2026, 09:12:52
1class Solution(object):
2    def minimumCost(self, nums, k):
3        MOD=10**9+7
4        curr_res=k
5        tot_ops=0
6        tot_cost=0
7        for num in nums:
8            if curr_res<num:
9                need = (num-curr_res+k-1)//k
10                tot_cost += (tot_ops+1+tot_ops+need)*need//2
11                tot_cost %= MOD
12                tot_ops += need
13                curr_res += need*k
14            curr_res -= num
15        return tot_cost%MOD
16        